/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursojavaee.sessionbeanprimero.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author francisco
 */
@Stateless
public class Repetir implements RepetirRemote {

    @Override
    public String repetir(String repitiendo) {
        return "repitiendo: "+repitiendo;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
