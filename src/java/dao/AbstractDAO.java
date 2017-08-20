/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateFactory;
import java.util.List;
import model.TrxDeliveryRequests;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Expression;
import utils.DataAccessLayerException;
import utils.HibernateUtil;

/**
 *
 * @author S
 */
public abstract class AbstractDAO {
    protected Session session;
    protected Transaction tx;

    public AbstractDAO() {
        HibernateFactory.buildIfNeeded();
        startOperation();        
    }

    protected void saveOrUpdate(Object obj) {
        try {
            session.saveOrUpdate(obj);
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        }
    }

    protected void delete(Object obj) {
        try {
            session.delete(obj);
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        }
    }

    protected List findListWithCriteria(Criteria crit) {
        List obj = null;
        try {
            obj = crit.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        }
        return obj;
    }

    protected List findAll(Class clazz) {
        List objects = null;
        try {
            Query query = session.createQuery("from " + clazz.getName());
            objects = query.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        }
        return objects;
    }

    protected void handleException(HibernateException e) throws DataAccessLayerException {
        HibernateFactory.rollback(tx);
        throw new DataAccessLayerException(e);
    }

    protected void startOperation() throws HibernateException {
        session = HibernateFactory.openSession();
        tx = session.beginTransaction();
    }
}

