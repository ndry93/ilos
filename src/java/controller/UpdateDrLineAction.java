/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import dao.DrLineDAO;
import model.DrHeaders;
import model.DrLines;
import model.Users;

/**
 *
 * @author S
 */
public class UpdateDrLineAction extends ActionSupport {
    private static final long serialVersionUID = 11L;
    private final DrLineDAO drline_dao = new DrLineDAO();
    private Users users;
   private DrLines selectedDrLine;
    public UpdateDrLineAction() {
    }
    
    public String execute() throws Exception {
          try {
            System.out.println("controller.UpdateDrHeaderAction.execute()");
//            DrLines DrLine = drline_dao
//            drHeader.setCustomers(getSelectedDrHeader().getCustomers());
//            drHeader.setDriverName(getSelectedDrHeader().getDriverName());
//            drHeader.setPoliceNo(getSelectedDrHeader().getPoliceNo());
//            drHeader.setRit(getSelectedDrHeader().getRit());
//            drheader_dao.saveOrUpdateDrHeader(drHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
    
}
