/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.web;

import com.py.entidades.Tornillo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author francisco
 */
@Stateless
public class TornilloFacade extends AbstractFacade<Tornillo> {

    @PersistenceContext(unitName = "AAWebApliPruebaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TornilloFacade() {
        super(Tornillo.class);
    }
    
}
