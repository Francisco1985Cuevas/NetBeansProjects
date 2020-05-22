/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.exceptions.IllegalOrphanException;
import dao.exceptions.NonexistentEntityException;
import dao.exceptions.RollbackFailureException;
import entidades.Ciudades;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entidades.Paises;
import entidades.Personas;
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

    public void create(Ciudades ciudades) throws RollbackFailureException, Exception {
        if (ciudades.getPersonasCollection() == null) {
            ciudades.setPersonasCollection(new ArrayList<Personas>());
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Paises idPaises = ciudades.getIdPaises();
            if (idPaises != null) {
                idPaises = em.getReference(idPaises.getClass(), idPaises.getId());
                ciudades.setIdPaises(idPaises);
            }
            Collection<Personas> attachedPersonasCollection = new ArrayList<Personas>();
            for (Personas personasCollectionPersonasToAttach : ciudades.getPersonasCollection()) {
                personasCollectionPersonasToAttach = em.getReference(personasCollectionPersonasToAttach.getClass(), personasCollectionPersonasToAttach.getId());
                attachedPersonasCollection.add(personasCollectionPersonasToAttach);
            }
            ciudades.setPersonasCollection(attachedPersonasCollection);
            em.persist(ciudades);
            if (idPaises != null) {
                idPaises.getCiudadesCollection().add(ciudades);
                idPaises = em.merge(idPaises);
            }
            for (Personas personasCollectionPersonas : ciudades.getPersonasCollection()) {
                Ciudades oldIdCiudadesOfPersonasCollectionPersonas = personasCollectionPersonas.getIdCiudades();
                personasCollectionPersonas.setIdCiudades(ciudades);
                personasCollectionPersonas = em.merge(personasCollectionPersonas);
                if (oldIdCiudadesOfPersonasCollectionPersonas != null) {
                    oldIdCiudadesOfPersonasCollectionPersonas.getPersonasCollection().remove(personasCollectionPersonas);
                    oldIdCiudadesOfPersonasCollectionPersonas = em.merge(oldIdCiudadesOfPersonasCollectionPersonas);
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

    public void edit(Ciudades ciudades) throws IllegalOrphanException, NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Ciudades persistentCiudades = em.find(Ciudades.class, ciudades.getId());
            Paises idPaisesOld = persistentCiudades.getIdPaises();
            Paises idPaisesNew = ciudades.getIdPaises();
            Collection<Personas> personasCollectionOld = persistentCiudades.getPersonasCollection();
            Collection<Personas> personasCollectionNew = ciudades.getPersonasCollection();
            List<String> illegalOrphanMessages = null;
            for (Personas personasCollectionOldPersonas : personasCollectionOld) {
                if (!personasCollectionNew.contains(personasCollectionOldPersonas)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Personas " + personasCollectionOldPersonas + " since its idCiudades field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (idPaisesNew != null) {
                idPaisesNew = em.getReference(idPaisesNew.getClass(), idPaisesNew.getId());
                ciudades.setIdPaises(idPaisesNew);
            }
            Collection<Personas> attachedPersonasCollectionNew = new ArrayList<Personas>();
            for (Personas personasCollectionNewPersonasToAttach : personasCollectionNew) {
                personasCollectionNewPersonasToAttach = em.getReference(personasCollectionNewPersonasToAttach.getClass(), personasCollectionNewPersonasToAttach.getId());
                attachedPersonasCollectionNew.add(personasCollectionNewPersonasToAttach);
            }
            personasCollectionNew = attachedPersonasCollectionNew;
            ciudades.setPersonasCollection(personasCollectionNew);
            ciudades = em.merge(ciudades);
            if (idPaisesOld != null && !idPaisesOld.equals(idPaisesNew)) {
                idPaisesOld.getCiudadesCollection().remove(ciudades);
                idPaisesOld = em.merge(idPaisesOld);
            }
            if (idPaisesNew != null && !idPaisesNew.equals(idPaisesOld)) {
                idPaisesNew.getCiudadesCollection().add(ciudades);
                idPaisesNew = em.merge(idPaisesNew);
            }
            for (Personas personasCollectionNewPersonas : personasCollectionNew) {
                if (!personasCollectionOld.contains(personasCollectionNewPersonas)) {
                    Ciudades oldIdCiudadesOfPersonasCollectionNewPersonas = personasCollectionNewPersonas.getIdCiudades();
                    personasCollectionNewPersonas.setIdCiudades(ciudades);
                    personasCollectionNewPersonas = em.merge(personasCollectionNewPersonas);
                    if (oldIdCiudadesOfPersonasCollectionNewPersonas != null && !oldIdCiudadesOfPersonasCollectionNewPersonas.equals(ciudades)) {
                        oldIdCiudadesOfPersonasCollectionNewPersonas.getPersonasCollection().remove(personasCollectionNewPersonas);
                        oldIdCiudadesOfPersonasCollectionNewPersonas = em.merge(oldIdCiudadesOfPersonasCollectionNewPersonas);
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

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException, RollbackFailureException, Exception {
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
            List<String> illegalOrphanMessages = null;
            Collection<Personas> personasCollectionOrphanCheck = ciudades.getPersonasCollection();
            for (Personas personasCollectionOrphanCheckPersonas : personasCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Ciudades (" + ciudades + ") cannot be destroyed since the Personas " + personasCollectionOrphanCheckPersonas + " in its personasCollection field has a non-nullable idCiudades field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Paises idPaises = ciudades.getIdPaises();
            if (idPaises != null) {
                idPaises.getCiudadesCollection().remove(ciudades);
                idPaises = em.merge(idPaises);
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
