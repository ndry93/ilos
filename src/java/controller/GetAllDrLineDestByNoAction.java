/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import dao.DrHeaderDAO;
import dao.DrLineDAO;
import model.DrLineDest;
import model.DrLines;

/**
 *
 * @author S
 */
public class GetAllDrLineDestByNoAction extends ActionSupport{
    private static final long serialVersionUID = 9L;
    private DrLines SelectedDrLine;
    private DrHeaderDAO dr_header_dao= new DrHeaderDAO();
    private String DrHeaderNo;
    public GetAllDrLineDestByNoAction(){
        
    }
    @Override
      public String execute() throws Exception {
        try {
            //this contains multiple action, and thus should only use one transaction
            //first method will call beginTransaction, the rest will use getTransaction
            System.out.println("--- e drLineDest is executed");
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return SUCCESS;
    }
    /**
     * @return the SelectedDrLine
     */
    public DrLines getSelectedDrLine() {
        return SelectedDrLine;
    }

    /**
     * @param SelectedDrLine the SelectedDrLine to set
     */
    public void setSelectedDrLine(DrLines SelectedDrLine) {
        this.SelectedDrLine = SelectedDrLine;
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
