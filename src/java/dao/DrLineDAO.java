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
import model.DrLines;
import model.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

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
        Transaction transaction = session.beginTransaction();
        List<DrLines> drLine = null;
        System.out.println(drHeaderNo);
        try {
            drLine = session.createQuery("from DrLines where drHeaders='"+drHeaderNo+"'").list();
        } catch (Exception e) {
            transaction.rollback();
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