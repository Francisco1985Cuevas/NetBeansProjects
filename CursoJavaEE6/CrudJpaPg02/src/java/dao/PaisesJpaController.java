/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.exceptions.IllegalOrphanException;
import dao.exceptions.NonexistentEntityException;
import dao.exceptions.RollbackFailureException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entidades.Ciudades;
import entidades.Paises;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.UserTransaction;

/**
 *
 * @author francisco
 */
public class PaisesJpaController implements Serializable {

    public PaisesJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Paises paises) throws RollbackFailureException, Exception {
        if (paises.getCiudadesCollection() == null) {
            paises.setCiudadesCollection(new ArrayList<Ciudades>());
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Collection<Ciudades> attachedCiudadesCollection = new ArrayList<Ciudades>();
            for (Ciudades ciudadesCollectionCiudadesToAttach : paises.getCiudadesCollection()) {
                ciudadesCollectionCiudadesToAttach = em.getReference(ciudadesCollectionCiudadesToAttach.getClass(), ciudadesCollectionCiudadesToAttach.getId());
                attachedCiudadesCollection.add(ciudadesCollectionCiudadesToAttach);
            }
            paises.setCiudadesCollection(attachedCiudadesCollection);
            em.persist(paises);
            for (Ciudades ciudadesCollectionCiudades : paises.getCiudadesCollection()) {
                Paises oldPaisOfCiudadesCollectionCiudades = ciudadesCollectionCiudades.getPais();
                ciudadesCollectionCiudades.setPais(paises);
                ciudadesCollectionCiudades = em.merge(ciudadesCollectionCiudades);
                if (oldPaisOfCiudadesCollectionCiudades != null) {
                    oldPaisOfCiudadesCollectionCiudades.getCiudadesCollection().remove(ciudadesCollectionCiudades);
                    oldPaisOfCiudadesCollectionCiudades = em.merge(oldPaisOfCiudadesCollectionCiudades);
                }
            }
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

    public void edit(Paises paises) throws IllegalOrphanException, NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Paises persistentPaises = em.find(Paises.class, paises.getId());
            Collection<Ciudades> ciudadesCollectionOld = persistentPaises.getCiudadesCollection();
            Collection<Ciudades> ciudadesCollectionNew = paises.getCiudadesCollection();
            List<String> illegalOrphanMessages = null;
            for (Ciudades ciudadesCollectionOldCiudades : ciudadesCollectionOld) {
                if (!ciudadesCollectionNew.contains(ciudadesCollectionOldCiudades)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Ciudades " + ciudadesCollectionOldCiudades + " since its pais field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Collection<Ciudades> attachedCiudadesCollectionNew = new ArrayList<Ciudades>();
            for (Ciudades ciudadesCollectionNewCiudadesToAttach : ciudadesCollectionNew) {
                ciudadesCollectionNewCiudadesToAttach = em.getReference(ciudadesCollectionNewCiudadesToAttach.getClass(), ciudadesCollectionNewCiudadesToAttach.getId());
                attachedCiudadesCollectionNew.add(ciudadesCollectionNewCiudadesToAttach);
            }
            ciudadesCollectionNew = attachedCiudadesCollectionNew;
            paises.setCiudadesCollection(ciudadesCollectionNew);
            paises = em.merge(paises);
            for (Ciudades ciudadesCollectionNewCiudades : ciudadesCollectionNew) {
                if (!ciudadesCollectionOld.contains(ciudadesCollectionNewCiudades)) {
                    Paises oldPaisOfCiudadesCollectionNewCiudades = ciudadesCollectionNewCiudades.getPais();
                    ciudadesCollectionNewCiudades.setPais(paises);
                    ciudadesCollectionNewCiudades = em.merge(ciudadesCollectionNewCiudades);
                    if (oldPaisOfCiudadesCollectionNewCiudades != null && !oldPaisOfCiudadesCollectionNewCiudades.equals(paises)) {
                        oldPaisOfCiudadesCollectionNewCiudades.getCiudadesCollection().remove(ciudadesCollectionNewCiudades);
                        oldPaisOfCiudadesCollectionNewCiudades = em.merge(oldPaisOfCiudadesCollectionNewCiudades);
                    }
                }
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
                Integer id = paises.getId();
                if (findPaises(id) == null) {
                    throw new NonexistentEntityException("The paises with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Paises paises;
            try {
                paises = em.getReference(Paises.class, id);
                paises.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The paises with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Collection<Ciudades> ciudadesCollectionOrphanCheck = paises.getCiudadesCollection();
            for (Ciudades ciudadesCollectionOrphanCheckCiudades : ciudadesCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Paises (" + paises + ") cannot be destroyed since the Ciudades " + ciudadesCollectionOrphanCheckCiudades + " in its ciudadesCollection field has a non-nullable pais field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(paises);
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

    public List<Paises> findPaisesEntities() {
        return findPaisesEntities(true, -1, -1);
    }

    public List<Paises> findPaisesEntities(int maxResults, int firstResult) {
        return findPaisesEntities(false, maxResults, firstResult);
    }

    private List<Paises> findPaisesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Paises.class));
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

    public Paises findPaises(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Paises.class, id);
        } finally {
            em.close();
        }
    }

    public int getPaisesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Paises> rt = cq.from(Paises.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
