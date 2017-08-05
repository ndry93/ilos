/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import dao.DrHeaderDAO;
import model.DrHeaders;
import static utils.ILoSConstants.DELIVERY_REPORT;

/**
 *
 * @author ndry93
 */
public class CreateReportAction extends ActionSupport {
    
    private int drHeaderId;
    private DrHeaders selectedDrHeader;
    private final DrHeaderDAO drheader_dao = new DrHeaderDAO();
    
    @Override
    public String execute() throws Exception {
        System.out.println("---CreateReportAction");
        return SUCCESS;
    }
    
    public String createDeliveryReport(){
        System.out.println("---deliveryReport for "+this.getDrHeaderId());
        this.setSelectedDrHeader(drheader_dao.getDrHeader(this.getDrHeaderId()));
        return DELIVERY_REPORT;
    }

    /**
     * @return the drHeaderId
     */
    public int getDrHeaderId() {
        return drHeaderId;
    }

    /**
     * @param drHeaderId the drHeaderId to set
     */
    public void setDrHeaderId(int drHeaderId) {
        this.drHeaderId = drHeaderId;
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
