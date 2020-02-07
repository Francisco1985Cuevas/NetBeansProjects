
package modelos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class UsuariosOperaciones {
    
    public ArrayList<Users> getUsuarios(){
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
        ArrayList<Users> arreglo = new ArrayList<Users>();
        Query q = session.createQuery("from Users");
        List<Users> lista = q.list();
        Iterator<Users> iter = lista.iterator();     
        tx.commit();
        
        session.close();
        
        //tomar la lista y pasarla a un arraylist
        while(iter.hasNext()){
            Users noti = (Users) iter.next();
            arreglo.add(noti);
        }
        return arreglo; 
    }
    
    
    public void addUsuario(Users user){
        //esto es un metodo de ejecucion
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        
        session.close();
    }
    
    
    public void updateUsuario(int id){
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
        
        Users user = (Users)session.get(Users.class, id);
        user.setEmail("lalala@yahoo.com");
        session.update(user);
        tx.commit();
        
        session.close();
    }
    
    public void deleteUsuario(int id){
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        Transaction tx = session.beginTransaction();
        Users user = (Users)session.get(Users.class, id);
        session.delete(user);
        tx.commit();
        
        session.close();
    }
    
    
}
