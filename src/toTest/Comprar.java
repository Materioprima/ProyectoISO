package toTest;
import java.util.*;

public class Comprar {
	private int codigo;
	private String codigousuario;
	private ArrayList<ProductoServicio> cesta = new ArrayList<ProductoServicio>();
	private int [] unidades;
	
	public Comprar(int codigo,String codigousuario){
		this.codigo=codigo;
		this.codigousuario=codigousuario;
		unidades=new int[0];
	}
	public int realizarPago(){
		int precioCompra=0;
		for(int i=0;i<cesta.size();i++) {
			precioCompra+=(unidades[i])*(cesta.get(i).getPrecio());
		}
		return precioCompra;
	}
	
	public ArrayList<ProductoServicio> anadirProducto(ProductoServicio objeto,int cantidad){
		if(objeto.getUnidades()>=cantidad){
			cesta.add(objeto);
			int[] aux=new int[unidades.length+1];
			for(int i=0;i<unidades.length;i++) {
				aux[i]=unidades[i];
			}
			aux[aux.length-1]=cantidad;
			unidades=aux.clone();
			objeto.setUnidades(objeto.getUnidades()-cantidad);
		}else {
			System.out.println("No hay suficientes unidades");
		}
		return cesta;
	}
	public int[] getUnidades() {
		return unidades;
	}
	public void setUnidades(int[] unidades) {
		this.unidades = unidades;
	}
	public void quitarProducto(ProductoServicio objeto){
		if(cesta.contains(objeto)) {
			cesta.remove(objeto);
		}else {
			System.out.println("El objeto "+objeto+" no se encuentra en la cesta");
		}
	}
	
	public int getUnidadesCesta() {
		int unidades=0;
		for(int i=0;i<cesta.size();i++) {
			unidades+=cesta.get(i).getUnidades();
		}
		return unidades;
	}
	
	public ArrayList<ProductoServicio> getCesta(){
		return this.cesta;
	}
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCodigousuario() {
		return codigousuario;
	}

	public void setCodigousuario(String codigousuario) {
		this.codigousuario = codigousuario;
	}

	@Override
	public String toString() {
		return "Compra [Código de la compra=" + codigo + ", CIF del usuario=" + codigousuario
				+ ", Productos en las siguientes cantidades ="+Arrays.toString(unidades)+" " + cesta.toString() + "]";
	}
	
}



/*
 * int precioCompra=0;
		if((objeto.getUnidades()>0) && (objeto.getUnidades()-compra.getUnidades())>=0){
			precioCompra=compra.unidades*objeto.getPrecio();
			System.out.println("El pago va a ser realizado con el metodo de pago: "+objeto.getMetodopago()+" con un coste de: "+precioCompra+"€");
			objeto.setUnidades(objeto.getUnidades()-compra.getUnidades());
		}else{
			System.out.println("No hay suficientes unidades");
		}
		return precioCompra;
		
		
		Comprar nuevaCompra=new Comprar(r.nextInt(1000),objeto.getCodigoproducto(),objeto.getVendedor(),cantidad);
		System.out.println("El producto "+nuevaCompra+" ha sido añadido, proceda a realizar el pago.");
		
		
		
		
		volver a pedir de pedidos
		if((objeto.getUnidades()>0) && (objeto.getUnidades()-compra.getUnidades())>=0){
			Comprar nuevaOrden=new Comprar((compra.getCodigo()+r.nextInt(1000)),compra.getCodigoproducto(),compra.getCodigousuario(),compra.getUnidades());
			System.out.println("Se ha creado el pedido satisfactoriamente.");
			nuevaOrden.toString();
		}else{
			System.out.println("No hay suficientes unidades");
		}
*/
