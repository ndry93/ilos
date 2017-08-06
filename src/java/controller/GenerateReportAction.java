/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import dao.DrHeaderDAO;
import dao.DrLineDAO;
import model.DrHeaders;
import static utils.ILoSConstants.DELIVERY_REPORT;

/**
 *
 * @author ndry93
 */
public class GenerateReportAction  extends ActionSupport {

    private static final long serialVersionUID = 5L;
    private int drId;
    private DrHeaders selectedDrHeader;
    private final DrHeaderDAO drheader_dao = new DrHeaderDAO();
    private final DrLineDAO drline_dao = new DrLineDAO();
    
    public String execute() throws Exception {
        System.out.println("---CreateReportAction");
        return DELIVERY_REPORT;
    }
    
    public String generateDRReport(){
        System.out.println("---deliveryReport for "+this.getDrId());
        this.setSelectedDrHeader(drheader_dao.getDrHeader(this.getDrId()));
        return DELIVERY_REPORT;
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

    /**
     * @return the drId
     */
    public int getDrId() {
        return drId;
    }

    /**
     * @param drId the drId to set
     */
    public void setDrId(int drId) {
        this.drId = drId;
    }
    
}
