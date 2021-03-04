package udemy.java.universidad;

public class Empleado extends Persona{

	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	
	public Empleado(String nombre, double sueldo) {
		super(nombre);
		this.sueldo = sueldo;
		this.idEmpleado = ++Empleado.contadorEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=").append(idEmpleado);
		builder.append(", sueldo=").append(this.sueldo);
		builder.append(", Persona{=").append(super.toString());
		builder.append("}");
		builder.append("]");
		return builder.toString();
	}
	
	

	
	
	
	
	
	
	
}
