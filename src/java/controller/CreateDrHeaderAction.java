///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controller;
//
//import com.opensymphony.xwork2.ActionContext;
//import com.opensymphony.xwork2.ActionSupport;
//import dao.TrxDeliveryRequestsDAO;
//import java.util.Date;
//import java.util.Map;
//import model.Customers;
//import model.DrHeaders;
//import model.Users;
//
///**
// *
// * @author ndry93
// */
//public class CreateDrHeaderAction extends ActionSupport {
//
//    private static final long serialVersionUID = 5L;
//    private final TrxDeliveryRequestsDAO drheader_dao = new TrxDeliveryRequestsDAO();
//    private Users users;
//    private DrHeaders selectedDrHeader;
//
//    public CreateDrHeaderAction() {
//    }
//
//    @Override
//    public String execute() throws Exception {
//        System.out.println("controller.CreateDrHeaderAction.execute()");
//        try {
//            Map session = ActionContext.getContext().getSession();
//            Customers cust = new Customers();
//            cust.setCustomerId(getSelectedDrHeader().getCustomers().getCustomerId());
//            cust.setCustomerName(getSelectedDrHeader().getCustomers().getCustomerName());
//            Users user = new Users();
//            user.setUserName(session.get("username").toString());
////            DrHeaders dr = new DrHeaders( this.selectedDrHeader, cust, user);
//            DrHeaders dr = new DrHeaders();
//            dr = selectedDrHeader;
//            dr.setEnabled("Y");
//            dr.setIsDeleted("N");
//            dr.setCreatedDate(new Date());
//            dr.setDrStatus("Draft");
//            drheader_dao.saveOrUpdateDrHeader(dr);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return SUCCESS;
//        
//    }
//
//    /**
//     * @return the users
//     */
//    public Users getUsers() {
//        return users;
//    }
//    public boolean validateDrHeaderForm(){
//        boolean result= true;
//        if(getSelectedDrHeader().getCustomers().getCustomerId()==-1)
//        {
//            result = false;
//        }
//        if(getSelectedDrHeader().getDriverName()=="")
//        {
//            result = false;
//        }
//        if(getSelectedDrHeader().getPoliceNo()=="")
//        {
//            result = false;
//        }
//        if(getSelectedDrHeader().getRit()== null)
//        {
//           this.selectedDrHeader.setRit(0);
//        }
//        
//        return result;
//    }
//    /**
//     * @param users the users to set
//     */
//    public void setUsers(Users users) {
//        this.users = users;
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
//}
