package mx.com.gm.test.ciclovida;

import javax.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado1Persistido {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //1. estado transitivo. no tiene repre en BD
        Contacto contacto = new Contacto();
        contacto.setEmail("messi");
        contacto.setTelefono("123456789");

        //2. persistimos objeto
        em.getTransaction().begin();
        em.persist(contacto);
        //em.flush(); // es como hacer commit. solo se sincroniza lo pendiente en BD
        em.getTransaction().commit();

        //3. estado detached (separado)
        //tiene repre en bd pero no podemos modif salvo nueva transaccion
        System.err.println("contacto: " + contacto);

    }

}
