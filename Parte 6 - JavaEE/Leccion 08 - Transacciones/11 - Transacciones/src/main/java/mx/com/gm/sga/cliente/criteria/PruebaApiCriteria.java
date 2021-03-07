package mx.com.gm.sga.cliente.criteria;

import java.util.*;
import javax.persistence.*;
import javax.persistence.criteria.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

public class PruebaApiCriteria {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Persona> criteriaQuery = null;
        Root<Persona> fromPersona = null;
        TypedQuery<Persona> query = null;
        Persona persona = null;
        List<Persona> personas = null;

        //Query utilizando API de criteria
        //1. Consulta de todas las personas
        //a. objeto entityManger crea instancia CriteriaBuilder
        cb = em.getCriteriaBuilder();

        //b. crea objeto criteriaQuery
        criteriaQuery = cb.createQuery(Persona.class);

        //c. creamos objeto raiz de query
        fromPersona = criteriaQuery.from(Persona.class);

        //d. seleccionamos lo necesario del from
        criteriaQuery.select(fromPersona);

        //e. Creamos tipo de query typeSafe
        query = em.createQuery(criteriaQuery);

        //f. ejecutamos la consulta
        personas = query.getResultList();

        //mostrarPersonas(personas);
        
        //2.a consulta de la persona con id = 1
        //jpql = "select p from Persona p where p.idPersona = 1"
            log.debug("\n2.a. consulta de la persona con id = 1");
            cb = em.getCriteriaBuilder();
            criteriaQuery = cb.createQuery(Persona.class);
            fromPersona = criteriaQuery.from(Persona.class);
            criteriaQuery.select(fromPersona).where(cb.equal(fromPersona.get("idPersona"), 1));
            persona = em.createQuery(criteriaQuery).getSingleResult();
            //log.debug(persona);
        
        //2.b consutla de la persona con id = 1
        log.debug("\n2.b. consulta de la persona con id = 1");
        cb = em.getCriteriaBuilder();
        criteriaQuery = cb.createQuery(Persona.class);
        fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona);
        //la clase predicate permite agregar varios criterios dinamicamente
        List <Predicate> criterios = new ArrayList<Predicate>();
        // verificcamos si tenemos criterio q agregar
        Integer idPersonaParam = 1;
        ParameterExpression<Integer> parameter= cb.parameter(Integer.class,"idPersona");
        criterios.add(cb.equal(fromPersona.get("idPersona"), parameter));
        
        //se agregan los criterios
        if(criterios.isEmpty()){
            throw new RuntimeException("Sin criterios");
        }else if(criterios.size()==1){
            criteriaQuery.where(criterios.get(0));
            // o sea q si es solo 1 elemento, obtenemos el primer valor de esta coleccion
        }else{
            criteriaQuery.where(cb.and(criterios.toArray(new Predicate[0])));
        }// si son varios criterios decidimos como se concatenan. decidimos q se concatenen a nuestro query
        
        query = em.createQuery(criteriaQuery);
        query.setParameter("idPersona", idPersonaParam);
        
        //se ejecuta el query
        persona = query.getSingleResult();
        log.debug(persona);
        
    }

    private static void mostrarPersonas(List<Persona> personas) {
        for (Persona p : personas) {
            log.debug(p);
        }
    }

}
