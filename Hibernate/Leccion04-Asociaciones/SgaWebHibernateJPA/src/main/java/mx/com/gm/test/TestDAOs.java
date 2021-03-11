package mx.com.gm.test;

import java.util.List;
import mx.com.gm.dao.*;

public class TestDAOs {
    
    public static void main(String[] args) {
        
        AlumnoDAO alumnoDAO = new AlumnoDAO();
        System.out.println("Alumnos: ");
        //imprimir(alumnoDAO.listar());
        
        DomicilioDAO domicilioDAO = new DomicilioDAO();
        System.out.println("Domicilio: ");
        //imprimir(domicilioDAO.listar());
        
        ContactoDAO contactoDAO = new ContactoDAO();
        System.out.println("Contacto: ");
        imprimir(contactoDAO.listar());
        
        CursoDAO cursoDAO = new CursoDAO();
        System.out.println("Curso: ");
        imprimir(cursoDAO.listar());
        
        AsignacionDAO asignacionDAO = new AsignacionDAO();
        System.out.println("Asignacion: ");
        imprimir(asignacionDAO.listar());
        
        
        
        
    }
    
    private static void imprimir(List colleccion){
        for (Object o : colleccion) {
            System.out.println("Valor = " + o);
        }
    }
    
    
    
    
}
