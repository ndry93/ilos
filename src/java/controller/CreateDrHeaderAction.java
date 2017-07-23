/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import dao.DrHeaderDAO;
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
    
    public CreateDrHeaderAction() {
    }

    @Override
    public String execute() throws Exception {
        System.out.println("1controller.DrHeaderAction.execute()");
        try {
            //when creating new dr, dr number should be automatically generated
            
            //currently user object is null, we need to get from dao (*re-query), else we have to save in session variable
            System.out.println("---get user "+this.getUsers().getUserName());
            DrHeaders drHeader = new DrHeaders();
            Customers cust = new Customers();
            cust.setCustomerId(1);
            cust.setCustomerName("Midi");
            Users user = new Users();
            user.setUserName("ndry93");
            DrHeaders dr = new DrHeaders("DR/MIDI/001",cust,user);
            drheader_dao.saveOrUpdateDrHeader(drHeader);
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
    
}
