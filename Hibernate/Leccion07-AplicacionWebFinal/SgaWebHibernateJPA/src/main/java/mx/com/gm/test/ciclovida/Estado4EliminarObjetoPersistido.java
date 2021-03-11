package mx.com.gm.test.ciclovida;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.com.gm.domain.Contacto;

public class Estado4EliminarObjetoPersistido {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //recuperar objeto almacenado en BD
        //definimos la variable
        Contacto contacto = null;

        // recuperamos objeto
        // 1. transitivo
        contacto = em.find(Contacto.class, 3); //id = 3

        em.getTransaction().begin();

        // 2. remove
        em.remove(em.merge(contacto));

        em.getTransaction().commit();

        // 3. transitivo. no tiene repre en BD
        System.out.println("contacto: " + contacto);

    }

}
