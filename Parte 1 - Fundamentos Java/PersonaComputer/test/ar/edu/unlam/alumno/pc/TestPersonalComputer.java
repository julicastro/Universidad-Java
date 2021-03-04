package ar.edu.unlam.alumno.pc;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPersonalComputer {

	@Test
	public void queFuncioneCorrectamente() {
		
		Monitor monitor1 = new Monitor("Samsung", 25.0);
		Mouse mouse1 = new Mouse("USB", "Ryzen");
		Teclado teclado1 = new Teclado("USB", "Rysen");
		Computadora computadora1 = new Computadora("CX", monitor1, teclado1, mouse1);
		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadora1);
		orden1.mostrarOrden();
		assertNotNull(orden1);
			
	}

}
