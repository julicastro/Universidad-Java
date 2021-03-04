package ar.edu.unlam.alumno;

public class Personal extends Empleado {
	
	private String detalles; 
	private String departamento;
	
	public Personal(String nombre, Double sueldo, String departamento, String detalles) {
		super(nombre, sueldo);
		this.departamento=departamento;
		this.detalles=detalles;
	}
	
	@Override
	public String obtenerDetalles() {
		return super.obtenerDetalles() + ", Departamento = " + this.departamento + ", Detalles = " + this.detalles;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	
	
}
