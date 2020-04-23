/*
dao(controlador): CiudadesJpaController.java
 */
package dao;

import dao.exceptions.NonexistentEntityException;
import dao.exceptions.PreexistingEntityException;
import dao.exceptions.RollbackFailureException;
import entidades.Ciudades;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entidades.Paises;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.UserTransaction;


public class CiudadesJpaController implements Serializable {

    public CiudadesJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Ciudades ciudades) throws PreexistingEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Paises pais = ciudades.getPais();
            if (pais != null) {
                pais = em.getReference(pais.getClass(), pais.getId());
                ciudades.setPais(pais);
            }
            em.persist(ciudades);
            if (pais != null) {
                pais.getCiudadesCollection().add(ciudades);
                pais = em.merge(pais);
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findCiudades(ciudades.getId()) != null) {
                throw new PreexistingEntityException("Ciudades " + ciudades + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Ciudades ciudades) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Ciudades persistentCiudades = em.find(Ciudades.class, ciudades.getId());
            Paises paisOld = persistentCiudades.getPais();
            Paises paisNew = ciudades.getPais();
            if (paisNew != null) {
                paisNew = em.getReference(paisNew.getClass(), paisNew.getId());
                ciudades.setPais(paisNew);
            }
            ciudades = em.merge(ciudades);
            if (paisOld != null && !paisOld.equals(paisNew)) {
                paisOld.getCiudadesCollection().remove(ciudades);
                paisOld = em.merge(paisOld);
            }
            if (paisNew != null && !paisNew.equals(paisOld)) {
                paisNew.getCiudadesCollection().add(ciudades);
                paisNew = em.merge(paisNew);
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = ciudades.getId();
                if (findCiudades(id) == null) {
                    throw new NonexistentEntityException("The ciudades with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Ciudades ciudades;
            try {
                ciudades = em.getReference(Ciudades.class, id);
                ciudades.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ciudades with id " + id + " no longer exists.", enfe);
            }
            Paises pais = ciudades.getPais();
            if (pais != null) {
                pais.getCiudadesCollection().remove(ciudades);
                pais = em.merge(pais);
            }
            em.remove(ciudades);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Ciudades> findCiudadesEntities() {
        return findCiudadesEntities(true, -1, -1);
    }

    public List<Ciudades> findCiudadesEntities(int maxResults, int firstResult) {
        return findCiudadesEntities(false, maxResults, firstResult);
    }

    private List<Ciudades> findCiudadesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Ciudades.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Ciudades findCiudades(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Ciudades.class, id);
        } finally {
            em.close();
        }
    }

    public int getCiudadesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Ciudades> rt = cq.from(Ciudades.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
