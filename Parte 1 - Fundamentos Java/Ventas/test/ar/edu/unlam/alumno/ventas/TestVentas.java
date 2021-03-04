package ar.edu.unlam.alumno.ventas;

import java.util.Scanner;

import org.junit.Test;

public class TestVentas {

	@Test
	public void queFuncioneCorrectamente() {
		
		Producto producto1 = new Producto("Pepino",25.0);
		Producto producto2 = new Producto("Churrasco",100.0);
		Orden orden1 = new Orden();
		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		System.out.println(orden1.calcularTotal()); 
		orden1.mostrarOrden();
		
		
	}
	
}
