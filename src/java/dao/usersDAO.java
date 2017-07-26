/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import utils.HibernateUtil;
import java.util.List;
import model.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class usersDAO {

    Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    public boolean find(String name, String password) {
        Transaction transaction = session.beginTransaction();
        List<Users> list = new ArrayList<Users>();
        try {
            String sql = "Select userName, enabled from Users u where u.userName=:name and u.password=:pass and enabled is null";
            Query query = session.createQuery(sql);
            query.setParameter("name", name);
            query.setParameter("pass", password);
            list = query.list();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        
        if (list.size() > 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        usersDAO d = new usersDAO();
        System.out.println(d.find("hendry", "123"));
    }
}
