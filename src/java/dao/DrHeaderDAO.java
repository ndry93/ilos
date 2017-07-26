/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.opensymphony.xwork2.ActionContext;
import java.util.Date;
import utils.HibernateUtil;
import java.util.List;
import java.util.Map;
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
    Map LoginSession = ActionContext.getContext().getSession();
    /**
     * Used to save or update a user.
     */
    public void saveOrUpdateDrHeader(DrHeaders drHeader) {
        Transaction transaction = session.beginTransaction();
        try {
            drHeader.setUpdatedBy(LoginSession.get("username").toString());
            drHeader.setUpdatedDate(new Date());
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
            drHeader.setUpdatedBy(LoginSession.get("username").toString());
            drHeader.setUpdatedDate(new Date());
            drHeader.setEnabled("N");
            session.saveOrUpdate(drHeader);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    /**
     * Used to list all the users.
     */
    public List<DrHeaders> listDrHeader() {
        List<DrHeaders> drHeaders = null;
         if(!session.getTransaction().isActive()){
            session.beginTransaction();
        }
        try {
            drHeaders = session.createQuery("from DrHeaders where enabled is null").list();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return drHeaders;
    }
    public DrHeaders getDrHeader(String drHeaderNo) {
        DrHeaders drHeaders = null;
        //we must check whether the transaction is created or not. 
        //in case this method is called directly, it will create transaction
        if(!session.getTransaction().isActive()){
            session.beginTransaction();
        }
        try {
            drHeaders = (DrHeaders) session.createQuery("from DrHeaders where drHeaderId='"+drHeaderNo+"' and enabled is null").uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return drHeaders;
    }
    /**
     * Used to list a single user by Id.
     */
    public DrHeaders listDrHeaderByDrHeaderNo(String drHeaderNo) {
        DrHeaders drHeader = null;
        try {
            drHeader = (DrHeaders) session.get(DrHeaders.class, drHeaderNo);
        } catch (Exception e) {
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
        d.deleteDrHeader("fgh345");
        System.out.println("asdadds");
    }
}