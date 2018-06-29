package Controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import model.Atividade;
import model.Colaborador;
import model.Projeto;
import model.Tshirt;

/**
 *
 * @author Victor
 */
public class DAO {
    public static void salvar(Object object){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("prog2_jpaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static void merge(Object object){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("prog2_jpaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.merge(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static void remove(Object object){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("prog2_jpaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.remove(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @SuppressWarnings("unchecked")
    public List<Tshirt> listarEsforco() {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("prog2_jpaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query q = em.createQuery("SELECT t FROM Tshirt y ORDER BY p.id");
        return q.getResultList();        
    }
    
    @SuppressWarnings("unchecked")
    public List<Colaborador> listarColaborador() {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("prog2_jpaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query q = em.createQuery("SELECT c FROM Colaborador c ORDER BY c.id");
        return q.getResultList();        
    }
    
    @SuppressWarnings("unchecked")
    public List<Projeto> listarProjeto() {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("prog2_jpaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query q = em.createQuery("SELECT p FROM Projeto p ORDER BY p.id");
        return q.getResultList();        
    }
    
    @SuppressWarnings("unchecked")
    public Projeto procuraProjeto(Long id) {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("prog2_jpaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query q = em.createQuery("SELECT p FROM Projeto p where p.id="+id);
        return (Projeto) q.getSingleResult();
    }
    @SuppressWarnings("unchecked")
    public Atividade procuraAtividade(Long id) {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("prog2_jpaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query q = em.createQuery("SELECT a FROM Atividade a where a.id="+id);
        return (Atividade) q.getSingleResult();
    }
    
    @SuppressWarnings("unchecked")
    public List<Atividade> listarAtividade() {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("prog2_jpaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query q = em.createQuery("SELECT a FROM Atividade a ORDER BY a.id");
        return q.getResultList();        
    }
    
}
