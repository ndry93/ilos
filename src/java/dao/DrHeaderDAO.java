/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.opensymphony.xwork2.ActionContext;
import java.lang.reflect.Field;
import java.util.Date;
import utils.HibernateUtil;
import java.util.List;
import java.util.Map;
import model.DrLines;
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
//    Map LoginSession = ActionContext.getContext().getSession();

    /**
     * Used to save or update a user.
     */
    public void saveOrUpdateDrHeader(DrHeaders drHeader) {
        Transaction transaction = null;
        Map LoginSession = ActionContext.getContext().getSession();
        try {
            if (!session.getTransaction().isActive()) {
                System.out.println("---new trans ");
                transaction = session.beginTransaction();
            } else {
                transaction = session.getTransaction();
            }
            drHeader.setUpdatedDate(new Date());
            drHeader.setUpdatedBy(LoginSession.get("username").toString());
            System.out.println("-----get drheaderid " + drHeader.getDrHeaderId());
            session.saveOrUpdate(drHeader);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Used to delete a DrHeader.
     */
    public void deleteDrHeader(String drHeaderNo) {
         Transaction transaction = null;
         if (!session.getTransaction().isActive()) {
                System.out.println("---new trans ");
                transaction = session.beginTransaction();
            } else {
                transaction = session.getTransaction();
         }
        try {
            DrHeaders drHeader = (DrHeaders) session.get(DrHeaders.class, drHeaderNo);
//            drHeader.setUpdatedBy(LoginSession.get("username").toString());
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
            drHeaders = (DrHeaders) session.createQuery("from DrHeaders where drHeaderId='" + drHeaderNo + "' and enabled is null").uniqueResult();
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
     * Excample for SaveOrUpdate User and Customer must exist in database
     *
     * @param args
     */
    public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
//        DrHeaders dr = new DrHeaders();
//        dr.setDrHeaderId("29072017SUPFV");
//        Customers c = new Customers();
//        c.setCustomerId(22222);
//        dr.setCustomers(c);
//        Users u = new Users();
//        u.setUserName("ndry93");
//        dr.setUsers(u);
//        DrHeaderDAO d = new DrHeaderDAO();
//        d.saveOrUpdateDrHeader(dr);
//        System.out.println("asdadds");
        List<DrHeaders> drr = null;
        DrHeaderDAO d = new DrHeaderDAO();
        drr = d.listDrHeader();
        for (DrHeaders drHeaders : drr) {
            for (Object someObject : drHeaders.getDrLineses()) {
                Object a=someObject;
                //a.getClass().getField("drLineId").get(a);
                for (Field field : someObject.getClass().getDeclaredFields()) {
                    field.setAccessible(true); // You might want to set modifier to public first.
                    System.out.println(field.get(a));
                }
            }

        }

    }
}
