package ar.edu.unlam.peliculas.prueba;


import ar.edu.unlam.peliculas.negocio.*;
import java.util.Scanner;

import ar.edu.unlam.peliculas.negocio.CatalogoPeliculasImpl;
import ar.edu.unlam.peliculas.negocio.ICatalogoPeliculas;

public class PruebaPeliculas {
	
	public static void main(String args[]) {
		
		    var opcion = -1;
		    var teclado = new Scanner(System.in);
	        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
		
		while(opcion != 0) {
			System.out.println("Elije una opcion: ");
			System.out.println("*****************************");
			System.out.println("1 - Iniciar catalogo de peliculas: ");
			System.out.println("2 - Agregar Peliculas: ");
			System.out.println("3 - Listar Peliculas: ");
			System.out.println("4 - Buscar pelicula: ");
			System.out.println("0 - Salir: ");
		opcion = Integer.parseInt(teclado.nextLine());

	    switch(opcion){
        case 1:
            catalogo.iniciarCatalogoPeliculas();
            break;
        case 2:
            System.out.println("Introduce el nombre de la pelicula");
            var nombrePelicula = teclado.nextLine();
            catalogo.agregarPelicula(nombrePelicula);
            break;
        case 3:
            catalogo.listarPeliculas();
            break;
        case 4:
            System.out.println("Introduce una pelicula a buscar");
            var buscar = teclado.nextLine();
            catalogo.buscarPelicula(buscar);
            break;
        case 0:
            System.out.println("Hasta Pronto!");
            break;
        default:
            System.out.println("Opcion no reconocida");
            break;
		
		
		
		
		}
			

		}// FIN DE WHILE
	
	
	
	
		
		
		
		
		
		
	}
	
	//Contiene el menu que perimite al usuario seleccionar
	//la accion a ejecutar sobre el catálogo de películas
	
	
	
	
	
}
