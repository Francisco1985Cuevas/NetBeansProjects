/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.Session;
//import org.hibernate.SessionFactory;

/**
 *
 * @author francisco
 */
public class daoGeneral {
    
    public static void alta(Object objeto){
        //definimos un tipo session de conexion a la bd
        Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            sesion.beginTransaction();
            sesion.save(objeto);
            sesion.getTransaction().commit();
            
        }catch(Exception e){
            System.out.println("Se ha producido un error al insertar objeto"+objeto.getClass());
            sesion.getTransaction().rollback();
        }
        
        
        //SessionFactory sesion = HibernateUtil.getSessionFactory();
        //Session session = sesion.openSession();
        //Transaction tx = session.beginTransaction();
        
        //session.save(sw);
        
        //tx.commit();
        //session.close();
    
    }
    
    
}
