package mx.com.gm.sga.cliente.jpql;

import java.util.Iterator;
import java.util.List;
import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.*;

public class PruebaJPQL {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        String jpql = null;
        Query q = null;
        List <Persona> personas = null;
        Persona persona = null;
        Iterator iter = null;
        Object[] tupla = null;
        List <String> nombres = null;
        List <Usuario> usuarios = null;
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        //1. consulta todos los objetos del tipo persona
        log.debug("\n1. Consulta de todas las Personas");
        jpql = "select p from Persona p";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        //2. consulta de la Persona con id = 1
        log.debug("\n2. Consulta de la perosna con id = 1");
        jpql = "select p from Persona p where p.idPersona = 1";
        persona = (Persona) em.createQuery(jpql).getSingleResult();
        //log.debug(persona);
        
        //3. consulta de la Persona por nombre
        jpql = "select p from Persona p where p.nombre = 'Karla'";
        // va al listado xq varias personas podrian tener este nombre
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        //4. consulta de datos individuales, se crea un arreglo(tupla) del tipo object de 3 columnas
        // es del tipo object para q soporte cualquier objeto
        log.debug("\n4. consulta de datos inviduales, se crea un arreglo(tupla) de tipo objeto de 3 columas");
        jpql = "select p.nombre as Nombre, p.apellido as Apellido, p.email as Email from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while(iter.hasNext()){
            tupla = (Object[]) iter.next();
            String nombre = (String) tupla[0];
            String apellido = (String) tupla[1];
            String email = (String) tupla[2];
            //log.debug("nombre: " + nombre + ", apellido: " + apellido + ", email: " + email);
        }
        
        //5. Obtiene el objeto Persona y el ID, se crea un arreglo del tipo Object con 2 columnas
        log.debug("\n5. Obtiene el objeto Persona y el ID, se crea un arreglo del tipo Object con 2 columnas ");
        jpql = "select p, p.idPersona from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while(iter.hasNext()){
            tupla = (Object[]) iter.next();
            persona = (Persona) tupla[0];
            int idPersona = (int) tupla[1];
            //log.debug("objeto persona: " + persona);
            //log.debug("id persona: " + idPersona);
        }
        
        //6. Consulta de todas las personas
        log.debug("\n6. Consulta de todas las personas");
        jpql = "select new mx.com.gm.sga.domain.Persona( p.idPersona ) from Persona p";
        // creamos nuevo objeto tipo persona pero solo llenando el id Persona
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        //7. Regresa el valor minimo y maximo del idPersona (Escalares)
        log.debug("\n7. Regresa el valor minimo y maximo del idPersona (Escalares)");
        jpql = "select min(p.idPersona) as MinId, max(p.idPersona) as MaxId, count(p.idPersona) as Contador from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while(iter.hasNext()){
            tupla = (Object[]) iter.next();
            Integer idMin = (Integer) tupla[0];
            Integer idMax = (Integer) tupla[1];
            Long count = (Long) tupla[2];
            //log.debug("idMin: " + idMin + ", idMax: " + idMax + ", Contador: " + count);
        }
        
        //8. Contar los nombres de las personas q son distintos
        log.debug("\n8. Contar los nombres de las personas q son distintos");
        jpql = "select count(distinct p.nombre) from Persona p";
        Long contador = (Long) em.createQuery(jpql).getSingleResult();
        // solo regresa el contador
        //log.debug("Nro de personas con nombres distintos = " + contador);
        
        //9. Concatenar y convertir a mayusculas el nombre y apellido
        log.debug("\n9. Concatenar y convertir a mayusculas el nombre y apellido");
        jpql="select CONCAT(p.nombre,' ', p.apellido) as Nombre from Persona p";
        nombres = em.createQuery(jpql).getResultList();
        for (String nombreCompleto : nombres) {
            //log.debug(nombreCompleto);
        }

        //10. Obtiene el objeto perosna con id igual al parametro proporcionado
        log.debug("\n10. Obtiene el objeto perosna con id igual al parametro proporcionado");
        int idPersona = 1;
        jpql = "select p from Persona p where p.idPersona = :id";
        q = em.createQuery(jpql);
        q.setParameter("id", idPersona);
        persona = (Persona) q.getSingleResult();
        //log.debug(persona);
        // se usa en formularios. user proporciana valor y filtra cualquier campo
        
        //11. Obtener personas que contengan letra "A" sin importar si es Mayus o min
        log.debug("\n11. Obtener personas que contengan letra \"A\" sin importar si es Mayus o min");
        jpql = "select p from Persona p where upper(p.nombre) like upper(:parametro) ";
        String parametroString = "%ar%"; // puede ser una cadena completa
        // % es el caracter utilizado para sentencia "like"
        q = em.createQuery(jpql);
        q.setParameter("parametro", parametroString);
        personas = q.getResultList();
        //mostrarPersonas(personas);
        
        //12. uso de between (Entre) 
        log.debug("\n12. uso de between");
        jpql = "select p from Persona p where p.idPersona between 1 and 2"; // o :param1 and :param2 x ejemplo
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        //13. Uso del ordenamiento
        log.debug("\n13. Uso del ordenamiento");
        jpql = "select p from Persona p where p.idPersona <= 3 order by p.nombre desc, p.apellido desc";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        //14. uso de subQuery
        log.debug("\n14. uso de subQuery");
        jpql = "select p from Persona p where p.idPersona in (select min (p1.idPersona) from Persona p1)";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        //15. Uso de join con lazy loading
        log.debug("\n15. Uso de join con lazy loading");
        jpql = "select u from Usuario u join u.persona p";
        usuarios = em.createQuery(jpql).getResultList();
        //mostrarUsuarios(usuarios);
        
        //16. Uso de left o right join con eager loading
        log.debug("\n16. Uso de left o right join con eager loading");
        jpql = "select u from Usuario u left join fetch u.persona";
        // con fetch pasa a ser eager, si lo sacamos es lazy
        usuarios = em.createQuery(jpql).getResultList();
        mostrarUsuarios(usuarios);

    }

    private static void mostrarPersonas(List<Persona> personas) {
        for (Persona p : personas) {
            log.debug(p);
        }
    }

    private static void mostrarUsuarios(List<Usuario> usuarios) {
        for (Usuario u : usuarios) {
            log.debug(u);
        }
    }

}
