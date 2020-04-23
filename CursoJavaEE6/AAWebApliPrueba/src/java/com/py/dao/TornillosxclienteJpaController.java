/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.dao;

import com.py.dao.exceptions.NonexistentEntityException;
import com.py.dao.exceptions.PreexistingEntityException;
import com.py.dao.exceptions.RollbackFailureException;
import com.py.entidades.Tornillosxcliente;
import com.py.entidades.TornillosxclientePK;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;

/**
 *
 * @author francisco
 */
public class TornillosxclienteJpaController implements Serializable {

    public TornillosxclienteJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Tornillosxcliente tornillosxcliente) throws PreexistingEntityException, RollbackFailureException, Exception {
        if (tornillosxcliente.getTornillosxclientePK() == null) {
            tornillosxcliente.setTornillosxclientePK(new TornillosxclientePK());
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            em.persist(tornillosxcliente);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findTornillosxcliente(tornillosxcliente.getTornillosxclientePK()) != null) {
                throw new PreexistingEntityException("Tornillosxcliente " + tornillosxcliente + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Tornillosxcliente tornillosxcliente) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            tornillosxcliente = em.merge(tornillosxcliente);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                TornillosxclientePK id = tornillosxcliente.getTornillosxclientePK();
                if (findTornillosxcliente(id) == null) {
                    throw new NonexistentEntityException("The tornillosxcliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(TornillosxclientePK id) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Tornillosxcliente tornillosxcliente;
            try {
                tornillosxcliente = em.getReference(Tornillosxcliente.class, id);
                tornillosxcliente.getTornillosxclientePK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tornillosxcliente with id " + id + " no longer exists.", enfe);
            }
            em.remove(tornillosxcliente);
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

    public List<Tornillosxcliente> findTornillosxclienteEntities() {
        return findTornillosxclienteEntities(true, -1, -1);
    }

    public List<Tornillosxcliente> findTornillosxclienteEntities(int maxResults, int firstResult) {
        return findTornillosxclienteEntities(false, maxResults, firstResult);
    }

    private List<Tornillosxcliente> findTornillosxclienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tornillosxcliente.class));
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

    public Tornillosxcliente findTornillosxcliente(TornillosxclientePK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Tornillosxcliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getTornillosxclienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tornillosxcliente> rt = cq.from(Tornillosxcliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
