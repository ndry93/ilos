/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import utils.HibernateUtil;
import java.util.List;
import model.MstCustomers;
import model.SysUsers;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.LogicalExpression;
import utils.DataAccessLayerException;

/**
 *
 * @author user
 */
public class CustomerDAO extends AbstractDAO {
    public CustomerDAO() {
        super();
    }

    /**
     * Insert a new Event into the database.
     * @param event
     */
    public void create(MstCustomers event) throws DataAccessLayerException {
        super.saveOrUpdate(event);
    }


    /**
     * Delete a detached Event from the database.
     * @param event
     */
    public void delete(MstCustomers event) throws DataAccessLayerException {
        super.delete(event);
    }

    
    /**
     * Updates the state of a detached Event.
     *
     * @param event
     */
    public void update(MstCustomers event) throws DataAccessLayerException {
        super.saveOrUpdate(event);
    }

    /**
     * Finds all Events in the database.
     * @return
     */
    public List findAll() throws DataAccessLayerException{
        return super.findAll(MstCustomers.class);
    }
    
     public List getAvailableList() throws DataAccessLayerException {
        Session session = super.session;
        Criteria criteria = session.createCriteria(MstCustomers.class);
        Criterion isDeleted = Expression.eq( "isDeleted", "N" );
        Criterion isEnable = Expression.eq( "isEnabled", "Y" );
        LogicalExpression andExp = Expression.and(isEnable, isEnable);
        criteria.add(andExp);
        return super.findListWithCriteria(criteria);
    }
  
}
