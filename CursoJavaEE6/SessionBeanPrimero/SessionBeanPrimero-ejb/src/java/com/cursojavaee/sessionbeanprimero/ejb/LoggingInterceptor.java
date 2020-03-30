
package com.cursojavaee.sessionbeanprimero.ejb;

import java.lang.reflect.Method;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;


public class LoggingInterceptor {
    
    @AroundInvoke
    public Object logMethodCall(
            InvocationContext invocationContext )
    throws Exception{
        Object interceptedObject = invocationContext.getTarget();
        Method interceptedMethod = invocationContext.getMethod();
        System.out.println("Entrando "+interceptedObject.getClass().getName()+"()");
        Object o = invocationContext.proceed();
        System.out.println("Saliendo "+interceptedObject.getClass().getName()+"."+interceptedMethod.getName()+"()");
        return o;
        
    }
}
