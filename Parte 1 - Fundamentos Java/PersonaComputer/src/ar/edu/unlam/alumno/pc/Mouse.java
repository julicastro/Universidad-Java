package ar.edu.unlam.alumno.pc;

public class Mouse extends DispositivoEntrada {

	private final int idRaton;
	private static int contadorRaton;
	
	public Mouse(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idRaton=++contadorRaton;
	}

	@Override
	public String toString() {
		return "Mouse [idRaton=" + idRaton + ", contadorRaton=" + contadorRaton + "]";
	}

	
	
	
	
	
}
