///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controller;
//
//import com.opensymphony.xwork2.ActionSupport;
//import dao.TrxDeliveryRequestsDAO;
//import model.DrHeaders;
//import model.Users;
//import org.apache.struts2.ServletActionContext;
//
///**
// *
// * @author S
// */
//public class UpdateDrHeaderAction extends ActionSupport {
//
//    private static final long serialVersionUID = 7L;
//    private final TrxDeliveryRequestsDAO drheader_dao = new TrxDeliveryRequestsDAO();
//    private Users users;
//    private DrHeaders selectedDrHeader;
//    private String url;
//
//    public UpdateDrHeaderAction() {
//    }
//
//    public String execute() throws Exception {
//        setUrl();
//        try {
//            
//            System.out.println("controller.UpdateDrHeaderAction.execute()");
//            DrHeaders drHeader = drheader_dao.getDrHeader(getSelectedDrHeader().getDrHeaderId());
//            drHeader.setCustomers(getSelectedDrHeader().getCustomers());
//            drHeader.setDriverName(getSelectedDrHeader().getDriverName());
//            drHeader.setPoliceNo(getSelectedDrHeader().getPoliceNo());
//            drHeader.setRit(getSelectedDrHeader().getRit());
//            drHeader.setDeliveryDateStart(getSelectedDrHeader().getDeliveryDateStart());
//            drHeader.setDeliveryDateEnd(getSelectedDrHeader().getDeliveryDateEnd());
//            drHeader.setKmStart(getSelectedDrHeader().getKmStart());
//            drHeader.setKmEnd(getSelectedDrHeader().getKmEnd());
//            drHeader.setAreaId(getSelectedDrHeader().getAreaId());
//            drheader_dao.saveOrUpdateDrHeader(drHeader);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return SUCCESS;
//    }
//    public String deleteDrHeader() {
//        setUrl();
//       try {
//           System.out.println("controller.UpdateDrHeaderAction.deleteDrHeader()");
//           System.out.println("sdds"+getSelectedDrHeader().getDrHeaderId());
//            drheader_dao.deleteDrHeader(getSelectedDrHeader().getDrHeaderId());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return SUCCESS;
//    }
//    /**
//     * @return the users
//     */
//    public Users getUsers() {
//        return users;
//    }
//
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
//    /**
//     * @return the url
//     */
//    public String getUrl() {
//        return url;
//    }
//
//    /**
//     * @param url the url to set
//     */
//    public void setUrl() {
//         this.url = ServletActionContext.getRequest().getHeader("Referer").replace("editDrHeader", "viewDrHeader");
//    }
//
//}
