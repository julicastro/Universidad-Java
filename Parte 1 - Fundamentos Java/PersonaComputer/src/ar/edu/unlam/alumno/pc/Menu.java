package ar.edu.unlam.alumno.pc;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Orden orden = new Orden();
		Scanner teclado = new Scanner(System.in);
		
		int opcion;
		
		do {
		System.out.println("***************************");
		System.out.println("1 - Agregar computadora");
		System.out.println("2 - Mostrar orden");
		System.out.println("0 - Salir");
		System.out.println("***************************");
		opcion = teclado.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("MONITOR - escriba la marca");
			String marca = teclado.next();
			System.out.println("MONITOR - escriba el tamanio");
			double tamanio = teclado.nextDouble();
			
			System.out.println("TECLADO - escriba el tipo de entrada");
			String tipoEntradaTeclado = teclado.next();
			System.out.println("TECLADO - escriba la marca");
			String marcaTeclado = teclado.next();
			
			System.out.println("MOUSE - escriba el tipo de entrada");
			String tipoEntradaMouse = teclado.next();
			System.out.println("MOUSE - escriba la marca");
			String marcaMouse = teclado.next();
			
			Monitor monitor = new Monitor(marca,tamanio);
			Teclado tecladoPc = new Teclado(tipoEntradaTeclado,marcaTeclado);
			Mouse mouse = new Mouse(tipoEntradaMouse,marcaMouse);
			
			System.out.println("Escriba el nombre de la PC");
			String nombrePC = teclado.next();
			Computadora computadora = new Computadora(nombrePC,monitor,tecladoPc,mouse);
			orden.agregarComputadora(computadora);
			break;
		case 2:
			orden.mostrarOrden();
			break;
		case 0:
			System.out.println("Adios");

			break;
		default:
		System.out.println("Opcion invalida");
			break;
		}
				
		}while(opcion!=0);
		System.out.println("Que tenga un buen dia");
		
	

	}

}
