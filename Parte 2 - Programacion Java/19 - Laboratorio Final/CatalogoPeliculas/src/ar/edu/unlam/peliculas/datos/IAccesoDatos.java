package ar.edu.unlam.peliculas.datos;

import java.util.List;
import ar.edu.unlam.peliculas.domain.Pelicula;
import ar.edu.unlam.peliculas.excepciones.AccesoDatosEx;
import ar.edu.unlam.peliculas.excepciones.EscrituraDatosEx;
import ar.edu.unlam.peliculas.excepciones.LecturaDatosEx;


public interface IAccesoDatos {

    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecurso) throws AccesoDatosEx;
}	
	

//Contiene las operaciones a ejecutar en el archivo de peliculas.txt