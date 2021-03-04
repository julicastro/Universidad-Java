package udemy.java.universidad;

public class Caja {

	private Integer alto;
	private Integer ancho;
	private Integer profundo;
	
	public Caja() {
		
	}
	
	public Caja(Integer alto, Integer ancho, Integer profundo) {
		this.alto = alto;
		this.ancho = ancho;
		this.profundo = profundo;
	}
	
	public Integer calcularVolumenDeLaCaja() {
		return this.alto * this.ancho * this.profundo;
	}
	
	
	
	

}