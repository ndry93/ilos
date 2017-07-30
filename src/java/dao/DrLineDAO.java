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
import model.DrHeaders;
import model.DrLines;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @drline
 */
public class DrLineDAO {

    Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    /**
     * Used to save or update a drLines.
     */
    public void saveOrUpdateDrLines(DrLines drLines) {
        Transaction transaction = null;
        //Map LoginSession = ActionContext.getContext().getSession();
        try {
             if (!session.getTransaction().isActive()) {
                System.out.println("---new trans ");
                transaction = session.beginTransaction();
            } else {
                transaction = session.getTransaction();
            }
           // drLines.setUpdatedDate(new Date());
          //  drLines.setUpdatedBy(LoginSession.get("username").toString());
            session.saveOrUpdate(drLines);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    /**
     * Used to delete a DrLine.
     */
    public void deleteDrLine(String drLineNo) {
        Transaction transaction = null;
        //Map LoginSession = ActionContext.getContext().getSession();
        try {
             if (!session.getTransaction().isActive()) {
                System.out.println("---new trans ");
                transaction = session.beginTransaction();
            } else {
                transaction = session.getTransaction();
            }
            DrLines drLine = (DrLines) session.get(DrLines.class, drLineNo);
            session.delete(drLine);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }
     public void addDrLine(DrLines drLines) {
        Transaction transaction = null;
        Map LoginSession = ActionContext.getContext().getSession();
        try {
             if (!session.getTransaction().isActive()) {
                System.out.println("---new trans ");
                transaction = session.beginTransaction();
            } else {
                transaction = session.getTransaction();
            }
            drLines.setCreatedDate(new Date());
            drLines.setCreatedBy(LoginSession.get("username").toString());
            drLines.setUpdatedDate(new Date());
            drLines.setUpdatedBy(LoginSession.get("username").toString());
            session.save(drLines);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }
    
    /**
     * Used to list a single user by Id.
     */
    public List<DrLines> listDrLineByDrHeaderNo(String drHeaderNo) {
        List<DrLines> drLine = null;
        System.out.println("---selected drHeaderNo "+drHeaderNo);
        
        //we must check whether the transaction is created or not. 
        //in case this method is called directly, it will create transaction
        if(!session.getTransaction().isActive()){
            session.beginTransaction();
        }
        try {
            drLine = session.createQuery("from DrLines where drHeaders='"+drHeaderNo+"'").list();
            System.out.println("---executing commit");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return drLine;
    }
     
    /**
     * Excample for SaveOrUpdate
     * User and Customer must exist in database
     * @param args 
     */
    public static void main(String[] args){
        DrLineDAO d = new DrLineDAO();
        DrHeaderDAO dhdao = new DrHeaderDAO();
        DrLines  dd = new DrLines();
        DrHeaders dh = dhdao.getDrHeader("header123");
        dd.setDrHeaders(dh);
        dd.setDrLineId(123123123);
        dd.setDriverName("Tino");
        dd.setPoliceNo("B2234K");
        d.addDrLine(dd);
    }
}
