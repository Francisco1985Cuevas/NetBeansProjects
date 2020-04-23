/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.web;

import com.py.entidades.Tornillosxcliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author francisco
 */
@Stateless
public class TornillosxclienteFacade extends AbstractFacade<Tornillosxcliente> {

    @PersistenceContext(unitName = "AAWebApliPruebaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TornillosxclienteFacade() {
        super(Tornillosxcliente.class);
    }
    
}
