/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import utils.HibernateUtil;
import java.util.List;
import model.DrHeaders;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class DrHeaderDAO {

    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    Transaction transaction = session.beginTransaction();;

    /**
     * Used to save or update a user.
     */
    public void saveOrUpdateDrHeader(DrHeaders drHeader) {
        try {
            session.saveOrUpdate(drHeader);
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    /**
     * Used to delete a DrHeader.
     */
    public void deleteDrHeader(String drHeaderNo) {
        try {
            DrHeaders drHeader = (DrHeaders) session.get(DrHeaders.class, drHeaderNo);
            session.delete(drHeader);
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
        try {
            drHeaders = session.createQuery("from DrHeaders").list();
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
    
    public static void main(String[] args){
        DrHeaderDAO d = new DrHeaderDAO();
        for(DrHeaders dr: d.listDrHeader()){
            System.out.println(dr.getDrHeaderId());
        }
    }
}
