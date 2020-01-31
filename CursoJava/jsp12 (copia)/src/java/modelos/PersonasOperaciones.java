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
        
        Transaction tx = session.beginTransaction();
        ArrayList<Personas> arreglo = new ArrayList<Personas>();
        Query q = session.createQuery("from Personas");
        List<Personas> lista = q.list();
        Iterator<Personas> iter = lista.iterator();     
        tx.commit();
        
        session.close();
        
        //tomar la lista y pasarla a un arraylist
        while(iter.hasNext()){
            Personas noti = (Personas) iter.next();
            arreglo.add(noti);
        }
        return arreglo; 
    }
    
    
    public void updatePersona(int id){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Personas per = (Personas)session.get(Personas.class, id);
        per.setNombres(nombres);//hay que pasarle el parametro en la funcion
        session.update(per);
        tx.commit();
        session.close();
    }
    
    public void deletePersona(int id){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Personas per = (Personas)session.get(Personas.class, id);
        session.delete(per);
        tx.commit();
        session.close();
    }
    
    public void addPersona(Personas per){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(per);
        tx.commit();
        session.close();
    }
    
}
