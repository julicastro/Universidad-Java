package udemy.java.universidad;

import java.util.Date;

public class Cliente extends Persona{

	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	private static int contadorCliente;
	
	public Cliente(Date fechaRegistro, boolean vip, String nombre,
			char genero, int edad, String direccion) {
		super(nombre, genero, edad, direccion);
		this.idCliente = ++contadorCliente;
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public static int getContadorCliente() {
		return contadorCliente;
	}

	public static void setContadorCliente(int contadorCliente) {
		Cliente.contadorCliente = contadorCliente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [idCliente=");
		builder.append(idCliente);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append(", vip=");
		builder.append(", Persona={").append(super.toString());
		builder.append(vip);
		builder.append("}");
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
