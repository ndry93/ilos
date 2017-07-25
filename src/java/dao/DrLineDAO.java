/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import utils.HibernateUtil;
import java.util.List;
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
        Transaction transaction = session.beginTransaction();
        try {
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
        Transaction transaction = session.beginTransaction();
        try {
            DrLines drLine = (DrLines) session.get(DrLines.class, drLineNo);
            session.delete(drLine);
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
        for(DrLines dr: d.listDrLineByDrHeaderNo("header123")){
            System.out.println(dr.getDrLineId().toString());
            System.out.println(dr.getDrHeaders().getDrStatus().toString());
        }   
    }
}
