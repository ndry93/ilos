/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import dao.DrLineDAO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Destinations;
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
    private DrLines edDrLine;

    public UpdateDrLineAction() {
    }

    public String execute() throws Exception {
        try {
            setUrl();
            System.out.println("controller.UpdateDrLineAction.execute()");
            DrLines li = new DrLines();
            System.out.println("controller.UpdateDrLineAction.execute()");
            System.out.println("----------edit--------" + edDrLine.getDrLineId());
            li = drline_dao.getDrLine(edDrLine.getDrLineId());
            Destinations dest = edDrLine.getDestinations();

            System.out.println("----dest " + dest.getDestId());
            li.setDestinations(dest);
            li.setAmount(edDrLine.getAmount());
            li.setBk24(edDrLine.getBk24());
            System.out.println("datefdate " + edDrLine.getLeavingDate());
            
            String str_date = edDrLine.getLeavingDate().toString();
            DateFormat formatter;
            Date date;
            formatter = new SimpleDateFormat("dd-MMM-yy");
            date = formatter.parse(str_date);
//              li.setDeliveryDate(edDrLine.getDeliveryDate());
//              li.setArrivalDate(edDrLine.getArrivalDate());
            li.setArrivalKm(edDrLine.getArrivalKm());
//              li.setLeavingDate(edDrLine.getLeavingDate());
            li.setDescription(edDrLine.getDescription());
//            drHeader.setCustomers(getSelectedDrHeader().getCustomers());
//            drHeader.setDriverName(getSelectedDrHeader().getDriverName());
//            drHeader.setPoliceNo(getSelectedDrHeader().getPoliceNo());
//            drHeader.setRit(getSelectedDrHeader().getRit());
            drline_dao.saveOrUpdateDrLines(li);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String deleteDrLine() {
        setUrl();
        System.out.println("controller.UpdateDrLineAction.deleteDrLine()");
        System.out.println("--delete line " + DrLineNo);
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

    /**
     * @return the edDrLine
     */
    public DrLines getEdDrLine() {
        return edDrLine;
    }

    /**
     * @param edDrLine the edDrLine to set
     */
    public void setEdDrLine(DrLines edDrLine) {
        this.edDrLine = edDrLine;
    }
}
