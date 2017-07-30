/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DrHeaderDAO;
import dao.DrLineDAO;
import java.util.Date;
import java.util.Map;
import model.Customers;
import model.DrLines;
import model.Users;

/**
 *
 * @author ndry93
 */
public class CreateDrLineAction extends ActionSupport {

    private static final long serialVersionUID = 5L;
    private final DrLineDAO drline_dao = new DrLineDAO();
    private final DrHeaderDAO drheader_dao = new DrHeaderDAO();
    private Users users;
    private DrLines selectedDrLine;
    private String DrHeaderNo;
    

    public CreateDrLineAction() {
    }

    @Override
    public String execute() throws Exception {
        System.out.println("controller.CreateDrLineAction.execute()");
        try {
            System.out.println("---"+DrHeaderNo);
            selectedDrLine.setDrHeaders(drheader_dao.getDrHeader(getDrHeaderNo()));
            System.out.println("---DrHeader for new line "+selectedDrLine.getDrHeaders().getDrHeaderId());
            drline_dao.addDrLine(getSelectedDrLine());
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
     * @return the selectedDrLine
     */
    public DrLines getSelectedDrLine() {
        return selectedDrLine;
    }

    /**
     * @param selectedDrLine the selectedDrLine to set
     */
    public void setSelectedDrLine(DrLines selectedDrLine) {
        this.selectedDrLine = selectedDrLine;
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

  

}
