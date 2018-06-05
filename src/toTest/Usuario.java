package toTest;
public class Usuario {
	private String CIF,correo,nombre,compania,direccion,apellidos,contrasena;
	private int telefono,idioma=0; //0 es español, definido por defecto
	
	public Usuario(String CIF,String correo, String contrasena ){
		this.CIF=CIF;
		this.correo=correo;
		this.contrasena=contrasena;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	public void setContraseña(String contrasena) {
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
				+ telefono + ", idioma=" + idioma + "]";
	}
}
