///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controller;
//
//import static com.opensymphony.xwork2.Action.SUCCESS;
//import com.opensymphony.xwork2.ActionSupport;
//import model.DrLines;
//import dao.TrxDRPodsDAO;
//import dao.CustomerDAO;
//import dao.MstDropPointsDAO;
//import dao.TrxDeliveryRequestsDAO;
//import java.util.List;
//import model.DrHeaders;
//import model.Customers;
//import model.Destinations;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import utils.HibernateUtil;
//
//
///**
// *
// * @author S
// */
//public class GetAllDrLinesByDrNoAction extends ActionSupport{
//
//    private static final long serialVersionUID = 3L;
//    private int DrHeaderId;
//    private List<Customers> listCustomer;
//    private List<Destinations> listDestination;
//    private DrHeaders selectedDrHeader;
//    private final CustomerDAO customer_dao = new CustomerDAO();
//    private final TrxDeliveryRequestsDAO drheader_dao = new TrxDeliveryRequestsDAO();
//    private final MstDropPointsDAO destination_dao = new MstDropPointsDAO();
//    private String actionName;
//
//    public GetAllDrLinesByDrNoAction() {
//
//    }
//
//    public String execute() throws Exception {
//        try {
//            //this contains multiple action, and thus should only use one transaction
//            //first method will call beginTransaction, the rest will use getTransaction
//            System.out.println("--- a drLine is executed");
//            setSelectedDrHeader(drheader_dao.getDrHeader(getDrHeaderId()));
////            System.out.println("--- b drLine is executed ");
////            setDrLineList(drline_dao.listDrLineByDrHeaderId(getDrHeaderId()));
//            System.out.println("--- c drLine is executed");
//            setListCustomer(customer_dao.getAllCustomerList()); 
//            setListDestination(destination_dao.getAllDestinationList());
//            System.out.println("--- d end drline");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } 
//        return SUCCESS;
//    }
//
//    /**
//     * @return the DrHeaderId
//     */
//    public int getDrHeaderId() {
//        return DrHeaderId;
//    }
//
//    /**
//     * @param DrHeaderId the DrHeaderId to set
//     */
//    public void setDrHeaderId(int DrHeaderId) {
//        this.DrHeaderId = DrHeaderId;
//    }
//
//    /**
//     * @return the selectedDrHeader
//     */
//    public DrHeaders getSelectedDrHeader() {
//        return selectedDrHeader;
//    }
//
//    /**
//     * @param selectedDrHeader the selectedDrHeader to set
//     */
//    public void setSelectedDrHeader(DrHeaders selectedDrHeader) {
//        this.selectedDrHeader = selectedDrHeader;
//    }
//
//    /**
//     * @return the actionName
//     */
//    public String getActionName() {
//        return actionName;
//    }
//
//    /**
//     * @param actionName the actionName to set
//     */
//    public void setActionName(String actionName) {
//        this.actionName = actionName;
//    }
//
//    /**
//     * @return the listCustomer
//     */
//    public List<Customers> getListCustomer() {
//        return listCustomer;
//    }
//
//    /**
//     * @param listCustomer the listCustomer to set
//     */
//    public void setListCustomer(List<Customers> listCustomer) {
//        this.listCustomer = listCustomer;
//    }
//
//    /**
//     * @return the listDestination
//     */
//    public List<Destinations> getListDestination() {
//        return listDestination;
//    }
//
//    /**
//     * @param listDestination the listDestination to set
//     */
//    public void setListDestination(List<Destinations> listDestination) {
//        this.listDestination = listDestination;
//    }
//
//}
