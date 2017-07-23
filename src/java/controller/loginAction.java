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
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class loginAction extends ActionSupport implements SessionAware {

    private static final long serialVersionUID = 1L;
    SessionMap<String, String> sessionmap;
    public usersDAO dao = new usersDAO();
    private Users users;

    @Override
    public void setSession(Map<String, Object> map) {
        sessionmap = (SessionMap) map;
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

    @Override
    public void validate() {
//        if (getUsers().getUserName() == null || getUsers().getUserName().length() == 0) {
//            this.addFieldError("users.userName", "Name is required");
//         System.out.println("masuk username err ");
//        }
//        if (getUsers().getPassword() == null || getUsers().getPassword().length() == 0) 
//        {
//            this.addFieldError("users.password", "Password is required");
//         System.out.println("masuk pass err ");
//        }   
    }

    @Override
    public String execute() {
        if(getUsers()!=null){
            System.out.println("---getUsers().getUserName() "+getUsers().getUserName());
            System.out.println("---getUsers().getPassword() "+getUsers().getPassword());
            if (dao.find(getUsers().getUserName(), getUsers().getPassword())) {
                System.out.println("---masuk login execute");
                sessionmap.put("login", "true");
                sessionmap.put("username",getUsers().getUserName());
                return SUCCESS;
            } else {
                this.addActionError("Invalid username and password");
            }
        }
        return INPUT;
    }

    public String logout() {
        System.out.println("---logging out"+sessionmap );
        if(sessionmap!=null) sessionmap.invalidate();
        return SUCCESS;
    }

}
