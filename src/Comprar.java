
public class Comprar {
	private int codigo,codigoproducto,codigousuario,unidades;
	
	public Comprar(int codigo,int codigoproducto,int codigousuario,int unidades){
		this.codigo=codigo;
		this.codigoproducto=codigoproducto;
		this.codigousuario=codigousuario;
		this.unidades=unidades;
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

	public int getCodigousuario() {
		return codigousuario;
	}

	public void setCodigousuario(int codigousuario) {
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
