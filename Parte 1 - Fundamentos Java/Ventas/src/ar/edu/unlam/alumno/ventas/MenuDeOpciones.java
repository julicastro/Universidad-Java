package ar.edu.unlam.alumno.ventas;

import java.util.Scanner;

public class MenuDeOpciones {

	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		Orden orden = new Orden();
		int opcion;
		do {
		System.out.println("**************************");
		System.out.println("1 - Agregar Producto");
		System.out.println("2 - Calcular Precio");
		System.out.println("3 - Mostrar Orden");
		System.out.println("0 - Salir");
		System.out.println("**************************");
		System.out.println("Elija una opcion: ");
		opcion = teclado.nextInt();
		
			switch(opcion) {
			case 1:
				System.out.println("Escriba el nombre del producto: ");
				String nombre = teclado.next();
				System.out.println("Escriba el precio del producto: ");
				double precio = teclado.nextDouble();
				Producto producto = new Producto(nombre,precio);
				orden.agregarProducto(producto);
				break;
			case 2:
				System.out.println("Precio total: " + orden.calcularTotal());
				break;
			case 3:
				orden.mostrarOrden();
				break;
			default:
				System.out.println("Opcion incorrecta");
			}
			
			
			
		}while(opcion!=0);
		System.out.println("Que tenga un buen dia: ");

	}//FIN DEL MAIN
}