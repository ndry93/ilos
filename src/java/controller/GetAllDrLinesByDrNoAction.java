/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import model.DrLines;
import dao.DrLineDAO;
import dao.CustomerDAO;
import dao.DrHeaderDAO;
import java.util.List;
import model.DrHeaders;
import model.Customers;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

/**
 *
 * @author S
 */
public class GetAllDrLinesByDrNoAction {

    private static final long serialVersionUID = 3L;
    private List<DrLines> DrLineList = null;
    private String DrHeaderNo;
    private List<Customers> listCustomer;
    private DrHeaders selectedDrHeader;
    private final DrLineDAO drline_dao = new DrLineDAO();
    private final CustomerDAO customer_dao = new CustomerDAO();
    private final DrHeaderDAO drheader_dao = new DrHeaderDAO();
    private String actionName;

    public GetAllDrLinesByDrNoAction() {

    }

    public String execute() throws Exception {
        Session session = null;
        Transaction tx = null;
        try {
            //this contains multiple action, and thus should only use one transaction
            //first method will call beginTransaction, the rest will use getTransaction
            session =  HibernateUtil.getSessionFactory().getCurrentSession();
            System.out.println("---how is the transaction obj before creation "+session.getTransaction().isActive());
            tx = session.beginTransaction();
            System.out.println("--- a drLine is executed");
            setSelectedDrHeader(drheader_dao.getDrHeader(getDrHeaderNo()));
            System.out.println("--- b drLine is executed ");
            setDrLineList(drline_dao.listDrLineByDrHeaderNo(getDrHeaderNo()));
            System.out.println("--- c drLine is executed");
            setListCustomer(customer_dao.getAllCustomerList()); 
            
            
        } catch (Exception e) {
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        } 
        return SUCCESS;
    }

    /**
     * @return the DrLineList
     */
    public List<DrLines> getDrLineList() {
        return DrLineList;
    }

    /**
     * @param DrLineList the DrLineList to set
     */
    public void setDrLineList(List<DrLines> DrLineList) {
        this.DrLineList = DrLineList;
    }

    /**
     * @return the DrHeaderNo
     */
    public String getDrHeaderNo() {
        return DrHeaderNo;
    }

    /**
     * @param DrHeaderNo the DrHeaderNo to set
     */
    public void setDrHeaderNo(String DrHeaderNo) {
        this.DrHeaderNo = DrHeaderNo;
    }

    /**
     * @return the selectedDrHeader
     */
    public DrHeaders getSelectedDrHeader() {
        return selectedDrHeader;
    }

    /**
     * @param selectedDrHeader the selectedDrHeader to set
     */
    public void setSelectedDrHeader(DrHeaders selectedDrHeader) {
        this.selectedDrHeader = selectedDrHeader;
    }

    /**
     * @return the actionName
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * @param actionName the actionName to set
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * @return the listCustomer
     */
    public List<Customers> getListCustomer() {
        return listCustomer;
    }

    /**
     * @param listCustomer the listCustomer to set
     */
    public void setListCustomer(List<Customers> listCustomer) {
        this.listCustomer = listCustomer;
    }

}
