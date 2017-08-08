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
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author S
 */
public class UpdateDrLineAction extends ActionSupport {

   
    private static final long serialVersionUID = 11L;
    private final DrLineDAO drline_dao = new DrLineDAO();
    private Users users;
   private Integer DrLineNo;
   private String url;
    public UpdateDrLineAction() {
    }
    
    public String execute() throws Exception {
          try {
              setUrl();
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
     public String deleteDrLine() {
         setUrl();
         System.out.println("controller.UpdateDrLineAction.deleteDrLine()");
         System.out.println("--delete line "+DrLineNo);
       try {
            drline_dao.deleteDrLine(DrLineNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
     /**
     * @return the DrLineNo
     */
    public Integer getDrLineNo() {
        return DrLineNo;
    }

    /**
     * @param DrLineNo the DrLineNo to set
     */
    public void setDrLineNo(Integer DrLineNo) {
        this.DrLineNo = DrLineNo;
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
        this.url = ServletActionContext.getRequest().getHeader("Referer");
    }
}
