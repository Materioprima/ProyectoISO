import java.util.Random;

public class Main {

	private static Random r = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String CIF="72329123K";
		String correo="ejemplo@correo.com";
		String contrasena="clavesupersecreta";
		Usuario user1= new Usuario(CIF,correo,contrasena);
		System.out.println(user1);
		
		
	}

}
