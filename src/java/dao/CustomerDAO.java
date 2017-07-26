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
     * To get list of customers
     * @return List<Customers>
     */
    public List<Customers> getAllCustomerList() {
        List<Customers> listCustomer = null;
        //we must check whether the transaction is created or not. 
        //in case this method is called directly, it will create transaction
        if(!session.getTransaction().isActive()){
            session.beginTransaction();
        }
        try {
            listCustomer = session.createQuery("from Customers where enabled is null").list();
        } catch (Exception e) {
            e.printStackTrace();
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
