/*
Session Beans: AlumnoFacade.java
Todos estos "Session Beans" extienden a la interface AbstractFacade

Los Beans generados todos son muy similares, muy simples, se limitan
a una variable de "instancia" de tipo "EntityManager" esto le va a
permitir poder aprovecharse de la inyeccion de recursos al 
inicializarse
 */
package com.cursojavaee.sessionbeans;

import com.cursojavaee.jpa.Alumno;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class AlumnoFacade extends AbstractFacade<Alumno> {

    @PersistenceContext(unitName = "vt12SegundoJPAPU")
    private EntityManager em;
    
    /*el metodo getEntityManager, lo que indica es que son llamados
    por la clase Padre, asi que por lo tanto tienen acceso a la
    instancia EntityManager de el "Bean de Session".
    Este accesor EntityManager nos va a permitir por ejemplo si
    es necesario el poder recuperar mediante una consulta todos
    los registros que cumplan con una determinada condicion*/
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlumnoFacade() {
        super(Alumno.class);
    }
    
}
