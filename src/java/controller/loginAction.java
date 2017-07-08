/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Users;
import dao.usersDAO;
import com.opensymphony.xwork2.ActionSupport;
import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;

public class loginAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    usersDAO dao = new usersDAO();
    private Users users;

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

    @Override
    public void validate() {
        System.out.println("username " + getUsers().getUserName());
        if (getUsers().getUserName() != null) {
            if (getUsers().getUserName().length() == (0)) {
                this.addFieldError("users.userName", "Name is required");
            }
            if (getUsers().getUserPassword().length() == (0)) {
                this.addFieldError("users.userPassword", "Password is required");
            }
        }
    }

    @Override
    public String execute() {
        if (dao.find(getUsers().getUserName(), getUsers().getUserPassword())) {
            return SUCCESS;
        } else {
            this.addActionError("Invalid username and password");
        }
        return INPUT;
    }

}
