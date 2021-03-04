package ar.edu.unlam.peliculas.negocio;

public interface ICatalogoPeliculas {
    
    String NOMBRE_RECURSO = "peliculas.txt";
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscarPelicula(String buscar);
    
    void iniciarCatalogoPeliculas();
}


	
	//Contiene las operaciones necesarias de la aplicacion CatalogoPeliculas
	
