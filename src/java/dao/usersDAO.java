/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import utils.HibernateUtil;
import java.util.List;
import model.People;
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
    
    public void saveOrUpdateUser(Users user) {
        Transaction transaction = null;
        try {
            if(!session.getTransaction().isActive()){
                System.out.println("---new trans ");
                transaction = session.beginTransaction();
            }else{
                transaction = session.getTransaction();
            }
            session.saveOrUpdate(user);
            transaction.commit();
        } catch (Exception e) {
            if(transaction!=null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        usersDAO d = new usersDAO();
        Users user= new Users();
        user.setUserName("ndry93");
        People people = new People();
        people.setEmail("ndry93@yahoo.co.id");
        user.setPeople(people);
        user.setPassword("welcome1");
        d.saveOrUpdateUser(user);
    }
}
