/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DrHeaderDAO;
import java.util.Map;
import model.Customers;
import model.DrHeaders;
import model.Users;

/**
 *
 * @author ndry93
 */
public class CreateDrHeaderAction extends ActionSupport {

    private static final long serialVersionUID = 5L;
    private final DrHeaderDAO drheader_dao = new DrHeaderDAO();
    private Users users;
    private DrHeaders selectedDrHeader;

    public CreateDrHeaderAction() {
    }

    @Override
    public String execute() throws Exception {
        System.out.println("controller.CreateDrHeaderAction.execute()");
        try {
            Map session = ActionContext.getContext().getSession();
            System.out.println("Id DrHeader " + getSelectedDrHeader().getDrHeaderId());
            System.out.println("Cust Name" + getSelectedDrHeader().getCustomers().getCustomerName());
            getSelectedDrHeader().setDrStatus(getSelectedDrHeader().getDrStatus());
            System.out.println("Get status------"+getSelectedDrHeader().getDrStatus());
            Customers cust = new Customers();
            cust.setCustomerId(getSelectedDrHeader().getCustomers().getCustomerId());
            cust.setCustomerName(getSelectedDrHeader().getCustomers().getCustomerName());
            Users user = new Users();
            user.setUserName(session.get("username").toString());
            DrHeaders dr = new DrHeaders(getSelectedDrHeader(), cust, user);
            drheader_dao.saveOrUpdateDrHeader(dr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    /**
     * @return the users
     */
    public Users getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(Users users) {
        this.users = users;
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

}
