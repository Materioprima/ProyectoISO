package testClasses;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Random;

import org.junit.jupiter.api.*;
import org.mockito.*;
import toTest.*;

public class AlmacenarObjetosTest {
	private static Random r = new Random();
	private String user1,correo,contrasena;
	Usuario user;
	
	@BeforeEach
	void init() {
		user1="aeiou";
		correo="aeiou@prueba";
		contrasena="abajoaeiou";
		user= new Usuario(user1,correo,contrasena);
	}
	
	@Test
	public void test() {
		int uni=r.nextInt(100)+10;
		ProductoServicio mockObjeto =mock(ProductoServicio.class);
		when(mockObjeto.toString()).thenReturn("Hola soy un objeto de prueba");
		ProductoServicio mockObjeto1 =mock(ProductoServicio.class);
		when(mockObjeto1.toString()).thenReturn("Hola soy un objeto de prueba 1");
		ProductoServicio mockObjeto2 =mock(ProductoServicio.class);
		when(mockObjeto2.toString()).thenReturn("Hola soy un objeto de prueba 2");
		when(mockObjeto.getUnidades()).thenReturn(uni);
		when(mockObjeto1.getUnidades()).thenReturn(uni);
		when(mockObjeto2.getUnidades()).thenReturn(uni);
		user.anadirProducto(mockObjeto);
		user.anadirProducto(mockObjeto1);
		user.anadirProducto(mockObjeto2);
		assertEquals(mockObjeto.getUnidades(),uni);
		assertEquals(mockObjeto1.getUnidades(),uni);
		assertEquals(mockObjeto2.getUnidades(),uni);
		
	}
}
