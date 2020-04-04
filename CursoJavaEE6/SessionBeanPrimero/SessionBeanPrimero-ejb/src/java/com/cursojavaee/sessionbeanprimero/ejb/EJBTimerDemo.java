/*
 Session Bean: EJBTimerDemo.java
 */
package com.cursojavaee.sessionbeanprimero.ejb;

import java.util.Date;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Schedule;



@Stateless
@LocalBean
public class EJBTimerDemo {
    
    @Schedule(hour = "*", minute = "*", second = "*/30")
    public void logMessage() {
        System.out.println("Mensaje Log() metodo invocado a las:"
        + new Date(System.currentTimeMillis()));
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
