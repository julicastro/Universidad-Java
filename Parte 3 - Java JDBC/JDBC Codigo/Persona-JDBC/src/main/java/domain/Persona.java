package domain;

public class Persona {
	
	//CLASE QUE VINCULA LA COLUMNA CON JAVA

	private int idPersona;
	private String nombre;
	private String apellido;
	private String mail;
	private String telefono;
	
	public Persona() {
		
	}
	
	//VA SEPARADA XQ ES AUTOINCREMENTABLE
	public Persona(int idPersona) {
		this.idPersona = idPersona;
	}

	public Persona(String nombre, String apellido, String mail, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.telefono = telefono;
	}
	//ESTE TIENE TODOS X SI TENGO Q HACER MODIFICACIONES
	public Persona(int idPersona, String nombre, String apellido, String mail, String telefono) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.telefono = telefono;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail
				+ ", telefono=" + telefono + "]";
	}
	
	
	
	
	
	
}
