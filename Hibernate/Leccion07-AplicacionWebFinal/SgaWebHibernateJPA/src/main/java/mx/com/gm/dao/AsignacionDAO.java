package mx.com.gm.dao;

import java.util.List;
import javax.persistence.Query;
import mx.com.gm.domain.Asignacion;

public class AsignacionDAO extends GenericDAO {

    public List<Asignacion> listar() {
        String consulta = "SELECT a FROM Asignacion a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void instertar(Asignacion asignacion) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(asignacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void actualizar(Asignacion asignacion) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(asignacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void eliminar(Asignacion asignacion) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(asignacion));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public Asignacion buscarPorId(Asignacion asignacion){
        em = getEntityManager();
        return em.find(Asignacion.class, asignacion.getIdAsignacion());
    }
    
    
    
}
