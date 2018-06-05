package toTest;
public class ProductoServicio {
	private int codigoproducto,precio,unidades,valoracion;
	private String vendedor,nombre,descripcion,categoria,ubicacion,metodopago;
	private boolean promo=false;
	private byte foto;
	
	
	public ProductoServicio(int codigoproducto, int precio, int unidades, int valoracion, String vendedor,
			String nombre, String descripcion, String categoria, String ubicacion, String metodopago, boolean promo,
			byte foto) {
		super();
		this.codigoproducto = codigoproducto;
		this.precio = precio;
		this.unidades = unidades;
		this.valoracion = valoracion;
		this.vendedor = vendedor;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.ubicacion = ubicacion;
		this.metodopago = metodopago;
		this.promo = promo;
		this.foto = foto;
	}
	
	public int getCodigoproducto() {
		return codigoproducto;
	}
	public void setCodigoproducto(int codigoproducto) {
		this.codigoproducto = codigoproducto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public int getValoracion() {
		return valoracion;
	}
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getMetodopago() {
		return metodopago;
	}
	public void setMetodopago(String metodopago) {
		this.metodopago = metodopago;
	}
	public boolean isPromo() {
		return promo;
	}
	public void setPromo(boolean promo) {
		this.promo = promo;
	}
	public byte getFoto() {
		return foto;
	}
	public void setFoto(byte foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "Producto/Servicio [Código del producto=" + codigoproducto + ", precio=" + precio + "€, unidades=" + unidades
				+ ", valoracion=" + valoracion + ", vendedor=" + vendedor + ", nombre=" + nombre + ", descripción del producto="
				+ descripcion + ", categoria=" + categoria + ", ubicación=" + ubicacion + ", método de pago=" + metodopago
				+ ", promoción=" + promo + "]";
	}
}
