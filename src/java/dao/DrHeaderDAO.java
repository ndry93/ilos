/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import utils.HibernateUtil;
import java.util.List;
import model.Customers;
import model.DrHeaders;
import model.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class DrHeaderDAO {

    Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    /**
     * Used to save or update a user.
     */
    public void saveOrUpdateDrHeader(DrHeaders drHeader) {
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(drHeader);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    /**
     * Used to delete a DrHeader.
     */
    public void deleteDrHeader(String drHeaderNo) {
        Transaction transaction = session.beginTransaction();
        try {
            DrHeaders drHeader = (DrHeaders) session.get(DrHeaders.class, drHeaderNo);
            session.delete(drHeader);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    /**
     * Used to list all the users.
     */
    @SuppressWarnings("unchecked")
    public List<DrHeaders> listDrHeader() {
        List<DrHeaders> drHeaders = null;
        Transaction transaction = session.beginTransaction();
        try {
            drHeaders = session.createQuery("from DrHeaders").list();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        return drHeaders;
    }

    /**
     * Used to list a single user by Id.
     */
    public DrHeaders listDrHeaderByDrHeaderNo(String drHeaderNo) {
        DrHeaders drHeader = null;
        Transaction transaction = session.beginTransaction();
        try {
            drHeader = (DrHeaders) session.get(DrHeaders.class, drHeaderNo);
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        return drHeader;
    }
    
    /**
     * Excample for SaveOrUpdate
     * User and Customer must exist in database
     * @param args 
     */
    public static void main(String[] args){
        DrHeaderDAO d = new DrHeaderDAO();
        for(DrHeaders dr: d.listDrHeader()){
            System.out.println(dr.getDrHeaderId());
        }   
        
        Customers cust = new Customers();
        cust.setCustomerId(1);
        cust.setCustomerName("Midi");
        Users user = new Users();
        user.setUserName("ndry93");
        DrHeaders dr = new DrHeaders("DR/MIDI/001",cust,user);
        d.saveOrUpdateDrHeader(dr);
    }
}
