/*
CiudadesFacade: representa la conexion a la base de datos de si misma
es decir si yo tengo una tabla Ciudades me representa a la conexion
a base de datos con la tabla Ciudades.
 */
package beansSessions;

import entidades.Ciudades;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class CiudadesFacade extends AbstractFacade<Ciudades> {

    @PersistenceContext(unitName = "CrudJpaPg02PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CiudadesFacade() {
        super(Ciudades.class);
    }
    
    
    //
    public List getAllCiudades(){
        Query q = em.createNativeQuery("SELECT c.id, c.nombre, p.nombre as pais \n" +
                                        "FROM ciudades c join paises p ON c.pais = p.id\n" +
                                        "ORDER BY c.nombre;");
        List<Object[]> listado = q.getResultList();
        return listado;
    }
    //
}
