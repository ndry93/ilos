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
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        return drHeaders;
    }
    public DrHeaders getDrHeader(String drHeaderNo) {
        DrHeaders drHeaders = null;
        Transaction transaction = session.getTransaction();
        try {
            drHeaders = (DrHeaders) session.createQuery("from DrHeaders where drHeaderId='"+drHeaderNo+"'").uniqueResult();
            transaction.commit();
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
            transaction.commit();
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
        DrHeaders gg = new DrHeaders();
        gg = d.getDrHeader("2372017EUODR");
        System.out.println(gg.getDrHeaderId());
    }
}