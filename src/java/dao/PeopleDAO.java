/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.SysPersons;
import model.SysUsers;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

/**
 *
 * @author ndry93
 */
public class PeopleDAO {
    
    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    
    public void saveOrUpdatePeople(SysPersons people) {
        Transaction transaction = null;
        try {
            if(!session.getTransaction().isActive()){
                System.out.println("---new trans ");
                transaction = session.beginTransaction();
            }else{
                transaction = session.getTransaction();
            }
            session.saveOrUpdate(people);
            transaction.commit();
        } catch (Exception e) {
            if(transaction!=null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PeopleDAO d = new PeopleDAO();
        SysPersons people= new SysPersons();
        people.setFirstName("Hendry");
        people.setLastName("Yuwono");
        people.setEmail("ndry93@yahoo.co.id");
        d.saveOrUpdatePeople(people);
    }
    
}
