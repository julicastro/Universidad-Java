/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.test.ciclovida;

import javax.persistence.*;
import mx.com.gm.domain.Contacto;

/**
 *
 * @author windows10
 */
public class Estado3ModificarObjetoRecuperadoPersistente {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //recuperar objeto almacenado en BD
        
        //definimos la variable
        Contacto contacto = null;
        
        // recuperamos objeto
        // 1. transitivo
        contacto = em.find(Contacto.class, 3); //id = 3
        
        // modificamos objeto fuera de la transaccion
        contacto.setEmail("messi@mail.com");
        
         em.getTransaction().begin();
        
         // 2. persistente
         em.merge(contacto);
         
        em.getTransaction().commit();
        
        // 3. detached
        System.out.println("contacto: " + contacto);
        
        

    }

}

