/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import model.DrLines;
import dao.DrLineDAO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import model.DrHeaders;

/**
 *
 * @author S
 */
public class DrLineAction {

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

    private static final long serialVersionUID = 3L;
    private List<DrLines> DrLineList = null;
    private String DrHeaderNo;
    private DrHeaders selectedDrHeader;
    public DrLineDAO drlilne_dao = new DrLineDAO();

    public DrLineAction() {
    }

    public String execute() throws Exception {
        try {
            setDrLineList(drlilne_dao.listDrLineByDrHeaderNo(getDrHeaderNo()));
            if(DrLineList.size()>0)
            {
                setSelectedDrHeader(DrLineList.get(0).getDrHeaders());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    /**
     * @return the DrLineList
     */
    public List<DrLines> getDrLineList() {
        return DrLineList;
    }

    /**
     * @param DrLineList the DrLineList to set
     */
    public void setDrLineList(List<DrLines> DrLineList) {
        this.DrLineList = DrLineList;
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
