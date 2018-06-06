package toTest;

import java.util.ArrayList;

public class Usuario {
	private String CIF,correo,nombre,compania,direccion,apellidos,contrasena;
	private int telefono,idioma=0; //0 es español, definido por defecto
	private boolean admin;
	private ArrayList<ProductoServicio> objetos = new ArrayList<ProductoServicio>();
	
	public ArrayList<ProductoServicio> getObjetos() {
		return objetos;
	}
	public void setObjetos(ArrayList<ProductoServicio> objetos) {
		this.objetos = objetos;
	}
	public Usuario(String CIF,String correo, String contrasena ){
		this.CIF=CIF;
		this.correo=correo;
		this.contrasena=contrasena;
		if(CIF=="admin"){
			admin=true;
		}else {
			admin=false;
		}
	}
	public void gestionarUsuarios(Usuario user) {
		if(isAdmin()) {
			System.out.println("El admin ha cambiado al usuario "+user);
			Usuario user1= new Usuario("RandomCIF","Cambiadopor@admin","**********");
			user=user1;
			System.out.println("Resultado "+user);
		}else {
			System.out.println("No reune los requisitos para esa funcion");
		}
	}
	public void darAltaUsuario(Usuario user){
		if(isAdmin()){
			user.CambiarPerfil(user);
			System.out.println("Se ha dado de alta al usuario "+user);
		}else {
			System.out.println("No reune los requisitos para esa funcion");
		}
	}
	
	public void darBajaUsuario(Usuario user){
		if(isAdmin()){
			String name=user.getCIF();
			user=null;
			System.out.println("Se ha dado de baja al usuario "+name);
		}else {
			System.out.println("No reune los requisitos para esa funcion");
		}
	}
	public void gestionarProducto(ProductoServicio objeto) {
		if(isAdmin()) {
			objeto.setUnidades(objeto.getUnidades()+10);
			System.out.println("El administrador ha modificado las unidades del producto, de "+(objeto.getUnidades()-10)+ " a "+objeto.getUnidades()+" unidades");
		}else {
			if(objetos.contains(objeto)) {
				objetos.get(objetos.indexOf(objeto)).setUnidades(objetos.get(objetos.indexOf(objeto)).getUnidades()+10);
				System.out.println("El usuario ha modificado las unidades del producto, de "+(objeto.getUnidades()-10)+ " a "+objeto.getUnidades()+" unidades");
			}else {
				System.out.println("No reune los requisitos para esa funcion");
			}
		}
	}
	
	public void anadirProducto(ProductoServicio objeto){
		objetos.add(objeto);
		System.out.println("Se ha añadido el producto/servicio "+objeto);
		System.out.println("La lista del usuario se compone de: "+this.getObjetos().toString());
	}
	
	public void eliminarProducto(ProductoServicio objeto){
		if(objetos.contains(objeto)){
			objetos.remove(objeto);
			System.out.println("Se ha eliminado el producto/servicio "+objeto);
			System.out.println("La lista del usuario se compone de: "+this.getObjetos().toArray().toString());
		}else{
			System.out.println("No se ha encontrado el producto/servicio.");
		}
	}
	
	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void CambiarPerfil(Usuario user){
		if(this.CIF==user.CIF){
			nombre=user.nombre;
			apellidos=user.apellidos;
			correo=user.correo;
			direccion=user.direccion;
			compania=user.compania;
			telefono=user.telefono;
		}
	}
	public void CambiarIdioma(int index){
		this.idioma=index;
	}
	@Override
	public String toString() {
		return "Usuario [CIF=" + CIF + ", correo=" + correo + ", nombre=" + nombre + ", compania=" + compania
				+ ", direccion=" + direccion + ", apellidos=" + apellidos + ", contrasena=" + contrasena + ", telefono="
				+ telefono + ", idioma=" + idioma + ", admin= "+admin+"]";
	}
}
