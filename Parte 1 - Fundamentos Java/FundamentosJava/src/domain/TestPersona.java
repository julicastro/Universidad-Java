package udemy.java.universidad;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;

public class TestPersona {

	@Test
	public void queSePuedaCrearEmpleado() {
		Empleado empleado1 = new Empleado("Julian", 25000);
		System.out.println("Empleado 1: " + empleado1.toString());
		assertNotNull(empleado1);
		
	}
	@Test
	public void queSePuedaCrearCliente() {
		Cliente cliente1 = new Cliente(new Date(), true, "Julian", 'M', 28, "Haedo");
		System.out.println("Cliente 1: " + cliente1.toString());
		assertNotNull(cliente1);
	}
	
	
	
}
