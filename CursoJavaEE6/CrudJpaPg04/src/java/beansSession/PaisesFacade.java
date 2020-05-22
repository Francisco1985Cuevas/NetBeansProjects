/*
 session bean, extiende(heredan) a la clase AbstractFacade
bean generado: se limitan a una variable "instancia" de tipo
EntityManager y esto le permite poder aprovecharse de la 
inyeccion de recursos al inicializarse.
 */
package beansSession;

import entidades.Paises;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class PaisesFacade extends AbstractFacade<Paises> {

    @PersistenceContext(unitName = "CrudJpaPg04PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaisesFacade() {
        super(Paises.class);
    }
    
}
