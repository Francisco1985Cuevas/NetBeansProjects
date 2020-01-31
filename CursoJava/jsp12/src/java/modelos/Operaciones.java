/*
 * Java Class modelos/Operaciones.java
 * archivo donde se desarrollan las funciones para
 * agregar/editar/eliminar registros.
 * 
 */
package modelos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Operaciones {
    
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
    
    
    public Personas getPersonasPorId(int id){
        //retorna un objeto de la clase entidad "Personas"
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
        //ArrayList<Personas> arreglo = new ArrayList<Personas>();
        //Query q = session.createQuery("from Personas");
        //List<Personas> lista = q.list();
        //Iterator<Personas> iter = lista.iterator();     
        Personas per = (Personas)session.get(Personas.class, id);
        tx.commit();
        
        session.close();
        return per;
    }
    
    public void updatePersona(int id){
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
        
        Personas per = (Personas)session.get(Personas.class, id);
        per.setCorreo("lalala@yahoo.com");
        session.update(per);
        tx.commit();
        
        session.close();
    }
    
    
    public void deletePersona(int id){
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
        Personas per = (Personas)session.get(Personas.class, id);
        session.delete(per);
        tx.commit();
        
        session.close();
    }
    
    public void addPersona(Personas per){
        //esto es un metodo de ejecucion
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
        session.save(per);
        tx.commit();
        
        session.close();
    }
    
}
