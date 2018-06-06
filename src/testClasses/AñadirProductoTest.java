package testClasses;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;
import org.junit.*;

import toTest.Comprar;
import toTest.ProductoServicio;

class AñadirProductoTest {
	private static Random r = new Random();
	private int codigo1,codigo2,unidades1,unidades2;
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
		p1 = new ProductoServicio(codigo1,r.nextInt(1000),unidades1,r.nextInt(5),user1,"producto1","descripcion1","categoria1","ubicacion1","metodopago1",false,(byte) 0);
		p2 = new ProductoServicio(codigo2,r.nextInt(1000),unidades2,r.nextInt(5),user2,"producto2","descripcion2","categoria2","ubicacion2","metodopago2",false,(byte) 0);
	}
	
	@Test
	void test() {
		int n1,n2;
		n1 = r.nextInt(100);
		n2 = r.nextInt(100);
		Comprar c1=new Comprar(n1,user1);
		Comprar c2=new Comprar(n2,user2);
		ArrayList<ProductoServicio> cs1 = c1.anadirProducto(p1,n1);
		ArrayList<ProductoServicio> cs2 = c2.anadirProducto(p2,n2);
		assertEquals(c1.getCesta(),cs1);
		assertEquals(c2.getCesta(),cs2);
		assertEquals(user1,c1.getCodigousuario());
		assertEquals(user2,c2.getCodigousuario());
	}
	
	@AfterEach
	void finish() {
		user1 = null;
		user2 = null;
		p1 = null;
		p2 = null;
	}

}

/*Comprar c1 = Comprar.anadirProducto(p1,n1);
		Comprar c2 = Comprar.anadirProducto(p2,n2);
		assertEquals(codigo1,c1.getCodigoproducto());
		assertEquals(codigo2,c2.getCodigoproducto());
		*/
