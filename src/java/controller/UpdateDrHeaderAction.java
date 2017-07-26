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
import model.DrHeaders;
import model.Users;

/**
 *
 * @author S
 */
public class UpdateDrHeaderAction extends ActionSupport {

    private static final long serialVersionUID = 7L;
    private final DrHeaderDAO drheader_dao = new DrHeaderDAO();
    private Users users;
    private DrHeaders selectedDrHeader;

    public UpdateDrHeaderAction() {
    }

    public String execute() throws Exception {
        try {
            System.out.println("controller.UpdateDrHeaderAction.execute()");
            drheader_dao.saveOrUpdateDrHeader(selectedDrHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
    public String deleteDrHeader() {
       try {
           System.out.println("controller.UpdateDrHeaderAction.deleteDrHeader()");
           System.out.println("sdds"+getSelectedDrHeader().getDrHeaderId());
            drheader_dao.deleteDrHeader(getSelectedDrHeader().getDrHeaderId());
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