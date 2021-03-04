package mx.com.gm.sga.cliente.asociaciones;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.*;

public class ClienteAsociaciones {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory rmf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = rmf.createEntityManager();
        
        List<Persona>personas = em.createNamedQuery("Persona.findAll").getResultList();
        
        //Cerramos la conexion
        em.close();
        
        //Imprimir los objetos de tipo persona
        for (Persona persona : personas) {
            log.debug("persona: " + persona);
            //recuperamos los usuarios de cada persona
            for (Usuario usuario : persona.getUsuarioList()) {
                log.debug("Usuario: " + usuario);
            }
        }
        
    }
    
    
}
