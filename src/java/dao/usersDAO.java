/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import utils.HibernateUtil;
import java.util.List;
import model.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class usersDAO {

    
    Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    public boolean find(String name, String password) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
        //session.beginTransaction();
        Transaction transaction = session.beginTransaction();
        try {
            String sql = "Select userName, enabled from Users u where u.userName=:name and u.password=:pass";
            Query query = session.createQuery(sql);
            query.setParameter("name", name);
            query.setParameter("pass", password);
            List<Users> list = query.list();
            if (list.size() > 0) {
                return true;
            }
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        return false;

    }

    public static void main(String[] args) {
        usersDAO d = new usersDAO();
        System.out.println(d.find("hendry", "123"));
    }
}
