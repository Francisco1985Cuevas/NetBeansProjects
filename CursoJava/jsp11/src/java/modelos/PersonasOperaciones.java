
package modelos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PersonasOperaciones {
    
    public ArrayList<Personas> getPersonas(){
        
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        //a partir de aqui podemos manipular/ver los datos de la bd
        Transaction tx = session.beginTransaction();
        //aca hacemos la magia
        
        ArrayList<Personas> arreglo = new ArrayList<Personas>();
        Query q = session.createQuery("from Personas"); //apuntamos a la entidad(POJO)
        List<Personas> lista = q.list();
        Iterator<Personas> iter = lista.iterator();
        
        //aca termina la magia
        tx.commit();
        
        session.close();
        
        //aca ya terminamos todo y solo tomamos la lista y la pasamos a una arraylist.
        while(iter.hasNext()){
            Personas noti = (Personas) iter.next();
            arreglo.add(noti);
        }
        
        return arreglo;
        
    }
}
