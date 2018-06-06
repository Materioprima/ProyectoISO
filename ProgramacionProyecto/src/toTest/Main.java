package toTest;
import java.util.Random;

public class Main {

	private static Random r = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String CIF="72329123K";
		String correo="ejemplo@correo.com";
		String contrasena="clavesupersecreta";
		Usuario user1= new Usuario(CIF,correo,contrasena);
		Usuario admin= new Usuario("admin","admin@admin","admin");
		System.out.println(user1);
		System.out.println(admin);
		System.out.println();
		
		admin.gestionarUsuarios(user1);
		user1.gestionarUsuarios(admin);
		System.out.println();
		
		int codigoproducto=r.nextInt(100);
		int precio=50;
		int unidades=100;
		int valoracion=5;
		String vendedor=user1.getCIF();
		String nombre="Ejemploproducto";
		String descripcion="Hola soy una descripcion";
		String categoria="ejemplos";
		String ubicacion=user1.getDireccion();
		String metodopago="paypal";
		boolean promo=false;
		byte foto=0;
		
		ProductoServicio productoejemplo= new ProductoServicio(codigoproducto,precio,unidades,valoracion,vendedor,nombre,descripcion,categoria,ubicacion,metodopago,promo,foto);
		System.out.println(productoejemplo);
		admin.gestionarProducto(productoejemplo);
		System.out.println();
		
		user1.anadirProducto(productoejemplo);
		System.out.println();
		System.out.println(productoejemplo);
		user1.gestionarProducto(productoejemplo);
		System.out.println();
		
		int codigoCompra=r.nextInt(1000);
		Comprar nuevaCompra=new Comprar(codigoCompra,user1.getCIF());
		System.out.println(nuevaCompra);
		nuevaCompra.anadirProducto(productoejemplo, 45);
		System.out.println(nuevaCompra+" el costo es de: "+nuevaCompra.realizarPago()+"€");
		System.out.println(productoejemplo);
		System.out.println();
		
		String fechaCompra="04/06/18";
		String seguimiento="ES"+r.nextInt(300);
		Pedidos pedidoejemplo=new Pedidos(user1.getCIF(),seguimiento,fechaCompra,user1.getCorreo(),nuevaCompra.getCodigo(),user1.getTelefono());
		System.out.println(pedidoejemplo);
		
		pedidoejemplo.volverAPedir(nuevaCompra);
		System.out.println(productoejemplo);
		System.out.println();
		
		pedidoejemplo.volverAPedir(nuevaCompra);
	}

}
