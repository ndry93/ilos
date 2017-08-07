/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Destinations;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

/**
 *
 * @author S
 */
public class DestinationDAO {
      Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    
    /**
     * To get list of Destinations
     * @return List<Destinations>
     */
    public List<Destinations> getAllDestinationList() {
        List<Destinations> listDestinations = null;
        //we must check whether the transaction is created or not. 
        //in case this method is called directly, it will create transaction
        if(!session.getTransaction().isActive()){
            session.beginTransaction();
        }
        try {
            listDestinations = session.createQuery("from Destinations where isDeleted = 'N' or isDeleted is null").list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDestinations;
    }
    
    public void saveOrUpdateDestinations(Destinations destination) {
        Transaction transaction = null;
        try {
            if(!session.getTransaction().isActive()){
                System.out.println("dao.DestinationDAO.saveOrUpdateDestinations()");
                transaction = session.beginTransaction();
            }else{
                transaction = session.getTransaction();
            }
            session.saveOrUpdate(destination);
            transaction.commit();
        } catch (Exception e) {
            if(transaction!=null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
   
    }
}
