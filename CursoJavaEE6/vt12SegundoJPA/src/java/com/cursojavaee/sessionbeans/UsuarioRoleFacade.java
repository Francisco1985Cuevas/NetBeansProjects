/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursojavaee.sessionbeans;

import com.cursojavaee.jpa.UsuarioRole;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author francisco
 */
@Stateless
public class UsuarioRoleFacade extends AbstractFacade<UsuarioRole> {

    @PersistenceContext(unitName = "vt12SegundoJPAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioRoleFacade() {
        super(UsuarioRole.class);
    }
    
}
