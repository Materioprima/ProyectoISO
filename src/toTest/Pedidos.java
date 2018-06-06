package toTest;
import java.util.ArrayList;
import java.util.Random;

public class Pedidos {
	private String codigoUsuario,seguimiento,fechaCompra,correoVendedor;
	private int numCompra,tlfVendedor;
	private static Random r = new Random();
	
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
	public Comprar volverAPedir(Comprar compra){
		Comprar nuevaCompra=null;
		boolean viabilidad=true;
		ArrayList<ProductoServicio> aux=compra.getCesta();
		for(int i=0;i<aux.size();i++) {
			ProductoServicio objetoaux=aux.get(i);
			if(objetoaux.getUnidades()<compra.getUnidades()[i]) {
				viabilidad=false;
			}
		}
		if(viabilidad) {
			nuevaCompra=compra;
			nuevaCompra.setCodigo(r.nextInt(1000));
			for(int i=0;i<aux.size();i++) {
				ProductoServicio objetoaux=aux.get(i);
				objetoaux.setUnidades(objetoaux.getUnidades()-compra.getUnidades()[i]);
			}
			System.out.println("Proceda a pagar la nueva orden: "+nuevaCompra);
		}else {
			System.out.println("No se puede realizar el pedido de nuevo por falta de existencias.");
		}
		return nuevaCompra;
	}
	public void localizarPedido(String seguimiento){
		System.out.println("Su pedido con nº de seguimiento "+seguimiento+" se encuentra en las coordenadas. ES"+r.nextInt(1000));
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
