/*
 este es el cliente remoto
 */
package com.cursojavaee.sessionbeanprimero.ejb;

import javax.ejb.Remote;

@Remote
public interface RepetirRemote {

    String repetir(String repitiendo);
    
}
