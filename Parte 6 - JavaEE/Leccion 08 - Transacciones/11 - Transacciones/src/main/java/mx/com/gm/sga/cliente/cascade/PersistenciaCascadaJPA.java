package mx.com.gm.sga.cliente.cascade;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.*;


public class PersistenciaCascadaJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //Paso 1. crear nuevo objeto
        //objeto en estado transitivo
        
        Persona persona1 = new Persona("Hugo","Cinelli","hcinelli@mail.com","232165498");
        
        //Crar obj usuario con dependiacia con el obj persona
        Usuario usuario1 = new Usuario("hhernandez","123",persona1);
        
        //Fase 3. persistimos objeto usuario (solo ese objeto)
        // no persona xq se hace en automatico
        em.persist(usuario1);
        
        //paso 4. commit
        tx.commit();
        
        //objetos en estado detached ya q tienen repre en BD
        
        log.debug("objeto persistido persona1 " + persona1);
        log.debug("objeto persistido usuario1 " + usuario1);
    }
    
    
    
    
    
}
