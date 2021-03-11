package mx.com.gm.test.cascade;

import javax.persistence.*;
import mx.com.gm.domain.*;

public class PersistenciaCascadaTest {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("Concordia");
        domicilio.setNoCalle("894");
        domicilio.setPais("Argentina");
        
        Contacto contacto = new Contacto();
        contacto.setEmail("carlos@mail.com");
        contacto.setTelefono("123456789");
        
        Alumno alumno = new Alumno();
        alumno.setNombre("Carlos");
        alumno.setApellido("Lara");
        alumno.setDomicilio(domicilio);
        alumno.setContacto(contacto);
        
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();
        
        System.out.println("alumno = " + alumno);
        
        
    }
}
