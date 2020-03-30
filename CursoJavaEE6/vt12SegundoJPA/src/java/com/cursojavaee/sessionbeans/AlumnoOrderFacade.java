/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursojavaee.sessionbeans;

import com.cursojavaee.jpa.AlumnoOrder;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author francisco
 */
@Stateless
public class AlumnoOrderFacade extends AbstractFacade<AlumnoOrder> {

    @PersistenceContext(unitName = "vt12SegundoJPAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlumnoOrderFacade() {
        super(AlumnoOrder.class);
    }
    
}
