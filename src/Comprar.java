import java.util.Random;

public class Comprar {
	private int codigo,codigoproducto,unidades;
	private String codigousuario;
	private static Random r = new Random();
	
	public Comprar(int codigo,int codigoproducto,String codigousuario,int unidades){
		this.codigo=codigo;
		this.codigoproducto=codigoproducto;
		this.codigousuario=codigousuario;
		this.unidades=unidades;
	}
	public int realizarPago(ProductoServicio objeto,Comprar compra){
		int precioCompra=0;
		if(objeto.getCodigoproducto()==compra.codigoproducto){
			precioCompra=compra.unidades*objeto.getPrecio();
		}
		System.out.println("El pago va a ser realizado con el metodo de pago: "+objeto.getMetodopago()+" con un coste de: "+precioCompra+"€");
		return precioCompra;
	}
	
	public Comprar anadirProducto(ProductoServicio objeto,int cantidad){
		Comprar nuevaCompra=new Comprar(r.nextInt(1000),objeto.getCodigoproducto(),objeto.getVendedor(),cantidad);
		System.out.println("El producto "+nuevaCompra+" ha sido añadido, proceda a realizar el pago.");
		return nuevaCompra;
	}
	public void quitarProducto(Comprar objeto){
		objeto=null;
	}
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigoproducto() {
		return codigoproducto;
	}

	public void setCodigoproducto(int codigoproducto) {
		this.codigoproducto = codigoproducto;
	}

	public String getCodigousuario() {
		return codigousuario;
	}

	public void setCodigousuario(String codigousuario) {
		this.codigousuario = codigousuario;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	@Override
	public String toString() {
		return "Compra [Código de la compra=" + codigo + ", Código del producto=" + codigoproducto + ", CIF del usuario=" + codigousuario
				+ ", unidades=x" + unidades + "]";
	}
	
}
