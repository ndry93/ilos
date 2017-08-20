/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;



import java.util.List;
import model.TrxDeliveryRequests;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;


import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.LogicalExpression;

import utils.DataAccessLayerException;
import utils.HibernateUtil;

/**
 *
 * @author user
 */
public class TrxDeliveryRequestsDAO extends AbstractDAO{

     public TrxDeliveryRequestsDAO() {
        super();
    }

    /**
     * Insert a new Event into the database.
     * @param event
     */
    public void create(TrxDeliveryRequests event) throws DataAccessLayerException {
        super.saveOrUpdate(event);
    }


    /**
     * Delete a detached Event from the database.
     * @param event
     */
    public void delete(TrxDeliveryRequests event) throws DataAccessLayerException {
        super.delete(event);
    }

    /**
     * Find an Event by its primary key.
     * @param id
     * @return
     */
    public List getTrxDeliveryRequestList() throws DataAccessLayerException {
        Session session = super.session;
        Criteria criteria = session.createCriteria(TrxDeliveryRequests.class);
        Criterion isDeleted = Expression.eq( "isDeleted", "N" );
        Criterion isEnable = Expression.eq( "isEnabled", "Y" );
        LogicalExpression andExp = Expression.and(isEnable, isEnable);
        criteria.add(andExp);
        return super.findListWithCriteria(criteria);
    }

    /**
     * Updates the state of a detached Event.
     *
     * @param event
     */
    public void update(TrxDeliveryRequests event) throws DataAccessLayerException {
        super.saveOrUpdate(event);
    }

    /**
     * Finds all Events in the database.
     * @return
     */
    public List findAll() throws DataAccessLayerException{
        return super.findAll(TrxDeliveryRequests.class);
    }
    
    public TrxDeliveryRequests find(String dreqNum) throws DataAccessLayerException{
        TrxDeliveryRequests t= null;
        try {
            startOperation();
            t = (TrxDeliveryRequests)session.load(TrxDeliveryRequests.class, dreqNum);
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
//            HibernateFactory.close(session);
        }
        return t;
    }

 
    public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Session session = HibernateUtil.currentSession();
        List<TrxDeliveryRequests> drr = null;
        TrxDeliveryRequestsDAO d = new TrxDeliveryRequestsDAO();
        List results = d.getTrxDeliveryRequestList();
        System.out.println(results.size());
    }
}
