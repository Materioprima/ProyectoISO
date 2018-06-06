package testClasses;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.mockito.*;

import toTest.*;
import java.util.Random;

public class RealizarPagoTest {
	private static Random r = new Random();
	private int codigo1,codigo2,unidades1,unidades2,unidades3,unidades4;
	private String user1,user2;
	ProductoServicio p1,p2;
	Comprar c1,c2;
	
	
	@BeforeEach
	void init() {
		user1 = "vendedor1";
		user2 = "vendedor2";
		codigo1 = r.nextInt(50);
		codigo2 = r.nextInt(50);
		unidades1 = r.nextInt(100);
		unidades2 = r.nextInt(100);
		unidades3 = r.nextInt(100);
		unidades4 = r.nextInt(100);
		p1 = new ProductoServicio(codigo1,r.nextInt(1000),unidades1,r.nextInt(5),user1,"producto1","descripcion1","categoria1","ubicacion1","metodopago1",false,(byte) 0);
		p2 = new ProductoServicio(codigo2,r.nextInt(1000),unidades2,r.nextInt(5),user2,"producto2","descripcion2","categoria2","ubicacion2","metodopago2",false,(byte) 0);
		
	}
		
		
		@Test
		public void test() {
			int n1,n2;
			n1 = r.nextInt(100);
			n2 = r.nextInt(100);
			Comprar c1=new Comprar(n1,user1);
			Comprar c2=new Comprar(n2,user2);
			ordenCompra c3 = Mockito.mock(ordenCompra.class);
			when(c3.getUnidades()).thenReturn(unidades4);
			
	}
		@AfterEach
		public void finish() {
			p1 = null;
			p2 = null;
		}

}


/*Comprar c1 = new Comprar(1,1,"usuario1",unidades1);
Comprar c2 = new Comprar(2,2,"usuario2",unidades2-1);
Comprar c3 = new Comprar(3,1,"usuario3",unidades1+1);
Comprar c4 = new Comprar(4,1,"usuario4",0);
assertEquals(0,Comprar.realizarPago(p1,c3)); //Intenta pagar mas unidades de las disponibles
assertEquals(0,Comprar.realizarPago(p1,c4)); //Intenta pagar 0 unidades
assertEquals(precio1*unidades1,Comprar.realizarPago(p1,c1)); //Intenta pagar cantidad maxima
assertEquals(precio2*(unidades2-1),Comprar.realizarPago(p2,c2)); //Intenta pagar cantidad valida
assertTrue(p1.getUnidades()==0); //Comprueba que las unidades se han actualizado correctamente  tras el pago
assertTrue(p2.getUnidades()==1); //Igual que anterior pero con p2
*/