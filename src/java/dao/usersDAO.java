/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import utils.HibernateUtil;
import java.util.List;
import model.SysUsers;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.*;
import utils.DataAccessLayerException;

public class usersDAO extends AbstractDAO{

     public usersDAO() {
        super();
    }
    public Boolean find(String userid, String password) throws DataAccessLayerException{
        Session session = super.session;
        Criteria criteria = session.createCriteria(SysUsers.class);
        criteria.add(Expression.eq( "isDeleted", "N" ));
        criteria.add(Expression.eq( "isEnabled", "Y" ));
        criteria.add(Restrictions.eq("userId",userid));
        criteria.add(Restrictions.eq("password",password));
        List a = super.findListWithCriteria(criteria);
        if(a.size()>0)
            return true;
        else
            return false;
    }
    
    public void saveOrUpdateUser(SysUsers user) {
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
       Boolean a = d.find("oyeni@yahoo.com", "password");
        System.out.println("sasas"+a);
       
    }
}
