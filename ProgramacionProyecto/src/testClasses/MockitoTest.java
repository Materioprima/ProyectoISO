package testClasses;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.mockito.*;

import toTest.Usuario;

import static org.mockito.Mockito.*;

public class MockitoTest{
	@Test
	public void test() {
		Usuario test =mock(Usuario.class);
		when(test.login(test)).thenReturn(true);
		assertEquals(test.login(test),true);
		
	}
}