package test;

import java.util.*;
import datos.PersonaDAO;
import domain.Persona;

public class TestManejoPersona {

	public static void main(String args[]) {
		
		PersonaDAO personaDao = new PersonaDAO();
		
//		INSERTAR UN NUEVO OBJETO PERSONA
//		Persona nuevaPersona = new Persona("Carlos","Ronaldo","cr7@gmail.com","1155576699");
//		personaDao.insertar(nuevaPersona);
	
//		MODIFICAR REGISTRO
//		Persona personaModificada = new Persona(5,"Cristiano","Ronaldo","cr7@gmail.com","1134499049");
//		personaDao.actualizar(personaModificada);
		
//		ELIMINAR REGISTRO
//		Persona personaEliminada = new Persona(5);
//		personaDao.eliminar(personaEliminada);

//		IMPRIMIR LISTA (SELECT)
		List<Persona>personas = personaDao.seleccionar();
			for(Persona persona : personas) {
				System.out.println("Persona = " + persona);
			}
			
		
		
		
		
	}

}
