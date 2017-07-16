/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.DrHeaders;
import dao.DrHeaderDAO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author S
 */
public class DrHeaderAction extends ActionSupport {

    private static final long serialVersionUID = 2L;
    private List<DrHeaders> DrHeaderList = null;
    public DrHeaderDAO drheader_dao = new DrHeaderDAO();

    public DrHeaderAction() {
    }

    @Override
    public String execute() throws Exception {
        System.out.println("1controller.DrHeaderAction.execute()");
        try {
           DrHeaderList = drheader_dao.listDrHeader();
            System.out.println("sdadsadadsadasd"+ this.DrHeaderList.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    /**
     * @return the DrHeaderList
     */
    public List<DrHeaders> getDrHeaderList() {
        return DrHeaderList;
    }

    /**
     * @param DrHeaderList the DrHeaderList to set
     */
    public void setDrHeaderList(List<DrHeaders> DrHeaderList) {
        this.DrHeaderList = DrHeaderList;
    }

}
