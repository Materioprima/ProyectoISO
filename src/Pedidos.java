import java.util.Random;

public class Pedidos {
	private String codigoUsuario,seguimiento,fechaCompra,correoVendedor;
	private int numCompra,tlfVendedor;
	
	
	public Pedidos(String codigoUsuario, String seguimiento, String fechaCompra, String correoVendedor, int numCompra,
			int tlfVendedor) {
		super();
		this.codigoUsuario = codigoUsuario;
		this.seguimiento = seguimiento;
		this.fechaCompra = fechaCompra;
		this.correoVendedor = correoVendedor;
		this.numCompra = numCompra;
		this.tlfVendedor = tlfVendedor;
	}
	public void volverAPedir(Comprar clon){
		Comprar nuevaOrden=new Comprar((clon.getCodigo()+1),clon.getCodigoproducto(),clon.getCodigousuario(),clon.getUnidades());
		System.out.println("Se ha creado el pedido satisfactoriamente.");
		nuevaOrden.toString();
	}
	public void localizarPedido(String seguimiento){
		System.out.println("Su pedido con nº de seguimiento "+seguimiento+" se encuentra en china.");
	}
	public void contactarVendedor(int numCompra){
		if(this.numCompra==numCompra){
			System.out.println("El correo del vendedor es: "+this.getCorreoVendedor());
			System.out.println("El teléfono del vendedor es: "+this.getTlfVendedor());
		}
	}
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getSeguimiento() {
		return seguimiento;
	}
	public void setSeguimiento(String seguimiento) {
		this.seguimiento = seguimiento;
	}
	public String getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public String getCorreoVendedor() {
		return correoVendedor;
	}
	public void setCorreoVendedor(String correoVendedor) {
		this.correoVendedor = correoVendedor;
	}
	public int getNumCompra() {
		return numCompra;
	}
	public void setNumCompra(int numCompra) {
		this.numCompra = numCompra;
	}
	public int getTlfVendedor() {
		return tlfVendedor;
	}
	public void setTlfVendedor(int tlfVendedor) {
		this.tlfVendedor = tlfVendedor;
	}
	@Override
	public String toString() {
		return "Pedidos [CIF=" + codigoUsuario + ", nº de seguimiento=" + seguimiento + ", fecha de compra="
				+ fechaCompra + ", correo del vendedor=" + correoVendedor + ", nº de compra=" + numCompra + ", teléfono del vendedor="
				+ tlfVendedor + "]";
	}
	
}
