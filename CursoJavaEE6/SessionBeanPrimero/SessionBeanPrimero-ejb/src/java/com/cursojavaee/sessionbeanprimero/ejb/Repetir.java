/*
Este es nuestro primer "Bean de Session" creado.
 Session Bean: Repetir.java
 */
package com.cursojavaee.sessionbeanprimero.ejb;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;


@Stateless
public class Repetir implements RepetirRemote {
    
    //Interceptors, indicamos el INTERCEPTOR que queremos usar
    @Interceptors({LoggingInterceptor.class})
    //Interceptors
    
    //Transacciones
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    //Transacciones
    
    @Override
    public String repetir(String repitiendo) {
        //simplemente retornamos un String
        return "repitiendo: "+repitiendo;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
