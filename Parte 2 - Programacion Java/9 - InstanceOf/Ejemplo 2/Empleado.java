package ar.edu.unlam.alumno;

public class Empleado {

	protected String nombre;
	protected Double sueldo;
	
	public Empleado(String nombre, Double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	public String obtenerDetalles() {
		return "Nombre = " + nombre + ", Sueldo = " + sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}


	
	
	
	
}
