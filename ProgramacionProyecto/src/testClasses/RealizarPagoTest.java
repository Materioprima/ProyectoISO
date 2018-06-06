package testClasses;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import toTest.*;
import java.util.Random;

public class RealizarPagoTest {
		private static Random r = new Random();
		private int precio1,precio2;
		private int unidades1,unidades2;
		ProductoServicio p1,p2;
		
		@BeforeEach
		public void init() {
			precio1 = r.nextInt(500);
			precio2 = r.nextInt(500);
			unidades1 = r.nextInt(50);
			unidades2 = r.nextInt(50);
			p1 = new ProductoServicio(1,precio1,unidades1,r.nextInt(5),"vendedor1","producto1","descripcion1","categoria1","ubicacion1","metodopago1",false,(byte) 0);
			p2 = new ProductoServicio(2,precio2,unidades2,r.nextInt(5),"vendedor2","producto2","descripcion2","categoria2","ubicacion2","metodopago2",false,(byte) 0);
			
		}
		
		@Test
		public void test() {
			Comprar c1 = new Comprar(1,1,"usuario1",unidades1);
			Comprar c2 = new Comprar(2,2,"usuario2",unidades2-1);
			Comprar c3 = new Comprar(3,1,"usuario3",unidades1+1);
			Comprar c4 = new Comprar(4,1,"usuario4",0);
			assertEquals(0,Comprar.realizarPago(p1,c3)); //Intenta pagar mas unidades de las disponibles
			assertEquals(0,Comprar.realizarPago(p1,c4)); //Intenta pagar 0 unidades
			assertEquals(precio1*unidades1,Comprar.realizarPago(p1,c1)); //Intenta pagar cantidad maxima
			assertEquals(precio2*(unidades2-1),Comprar.realizarPago(p2,c2)); //Intenta pagar cantidad valida
			assertTrue(p1.getUnidades()==0); //Comprueba que las unidades se han actualizado correctamente  tras el pago
			assertTrue(p2.getUnidades()==1); //Igual que anterior pero con p2
	}
		@AfterEach
		public void finish() {
			p1 = null;
			p2 = null;
		}

}
