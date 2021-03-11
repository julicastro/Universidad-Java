package mx.com.gm.test.ciclovida;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.com.gm.domain.Contacto;

public class Estado2RecuperarObjetoPersistente {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //recuperar objeto almacenado en BD
        
        //definimos la variable
        Contacto contacto = null;
        
        // recuperamos el objeto. esta em érsostemte
        contacto = em.find(Contacto.class, 3); //id = 3
        // hasta aca se guardan los datos
        em.getTransaction().commit();
        
        // detached
        System.out.println("contacto: " + contacto);
        
        

    }

}
