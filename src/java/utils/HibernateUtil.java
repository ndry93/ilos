/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author user
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
     public static final ThreadLocal session = new ThreadLocal();
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static Session currentSession() {
       Session s = (Session) session.get();
    // Open a new Session, if this thread has none yet
    if (s == null) {
      s = sessionFactory.openSession();
      // Store it in the ThreadLocal variable
      session.set(s);
    }
    
    return s;
    }
     public static void closeSession() throws HibernateException {
    Session s = (Session) session.get();
    if (s != null)
      s.close();
    session.set(null);
  }
    
}
