/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import dao.DrHeaderDAO;
import dao.DrLineDAO;
import model.DrLines;
import model.Users;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author ndry93
 */
public class CreateDrLineAction extends ActionSupport {

    private static final long serialVersionUID = 5L;
    private final DrLineDAO drline_dao = new DrLineDAO();
    private final DrHeaderDAO drheader_dao = new DrHeaderDAO();
    private Users users;
    private String url;
    private DrLines selectedDrLine;
    private int DrHeaderNo;
    

    public CreateDrLineAction() {
    }

    @Override
    public String execute() throws Exception {
        setUrl();
        System.out.println("controller.CreateDrLineAction.execute()");
        try {
            System.out.println("---"+selectedDrLine.getDrHeaders().getDrHeaderId());
            selectedDrLine.setDrHeaders(drheader_dao.getDrHeader(selectedDrLine.getDrHeaders().getDrHeaderId()));
            System.out.println("---DrHeader for new line "+selectedDrLine.getDrHeaders().getDrHeaderId());
            selectedDrLine.setDeliveryStatus("Draft");
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
    public int getDrHeaderNo() {
        return DrHeaderNo;
    }

    /**
     * @param DrHeaderNo the DrHeaderNo to set
     */
    public void setDrHeaderNo(int DrHeaderNo) {
        this.DrHeaderNo = DrHeaderNo;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl() {
        this.url = this.url = ServletActionContext.getRequest().getHeader("Referer");
    }

  

}
