package test;

import ar.edu.unlam.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.*;

public class ClienteEntidadPersona {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //Inicia la transaccion
        tx.begin();
        //No se debe especificar ID de BDD
        Persona persona1 = new Persona("Julian","Castro","julicastro@gmail.com","1134499049");
        log.debug("Objeto a persistir = " + persona1);
        //Persistir objeto en BDD
        em.persist(persona1);
        //termina la transaccion
        tx.commit(); // se genera pk y se crea registro nuevo
        log.debug("Objeto persistido = " + persona1);
        em.close();
        
        
        
        
        
    }
    
}
