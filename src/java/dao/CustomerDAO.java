/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import utils.HibernateUtil;
import java.util.List;
import model.Customers;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class CustomerDAO {

    Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    /**
     * Used to list all the users.
     * @return 
     */
    @SuppressWarnings("unchecked")
    public List<Customers> getAllCustomerList() {
        List<Customers> listCustomer = null;
        Transaction transaction = session.getTransaction();
        try {
            listCustomer = session.createQuery("from Customers").list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        return listCustomer;
    }

    public static void main(String[] args) {
        List<Customers> LC = null;
        CustomerDAO d = new CustomerDAO();
        LC = d.getAllCustomerList();
        for (Customers c : LC) {
            System.out.println(c.getCustomerName());
        }
    }
  
}
