/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DrLineDAO;
import java.util.Date;
import java.util.List;
import java.util.Map;
import model.Customers;
import model.DrHeaders;
import model.DrLines;
import model.Users;

/**
 *
 * @author ndry93
 */
public class GetDashboardAction extends ActionSupport {

    private static final long serialVersionUID = 9L;
    private int totalDrToday = 0;
    private int totalDrSuccessToday = 0;
    private int totalDrPendingToday = 0;
    private int totalDrAmtToday = 0;
    private DrLineDAO drLineDao = new DrLineDAO();
    
    @Override
    public String execute() throws Exception {
        System.out.println("--masuk sini");
        List<DrLines> drLines = drLineDao.listDrLineToday("Complete");
        this.setTotalDrToday(drLines.size());
        this.setTotalDrAmtToday(drLines.size());
        this.setTotalDrSuccessToday(drLines.size());
        this.setTotalDrPendingToday(0);
        return SUCCESS;
    }

    /**
     * @return the totalDrToday
     */
    public int getTotalDrToday() {
        return totalDrToday;
    }

    /**
     * @param totalDrToday the totalDrToday to set
     */
    public void setTotalDrToday(int totalDrToday) {
        this.totalDrToday = totalDrToday;
    }

    /**
     * @return the totalDrSuccessToday
     */
    public int getTotalDrSuccessToday() {
        return totalDrSuccessToday;
    }

    /**
     * @param totalDrSuccessToday the totalDrSuccessToday to set
     */
    public void setTotalDrSuccessToday(int totalDrSuccessToday) {
        this.totalDrSuccessToday = totalDrSuccessToday;
    }

    /**
     * @return the totalDrPendingToday
     */
    public int getTotalDrPendingToday() {
        return totalDrPendingToday;
    }

    /**
     * @param totalDrPendingToday the totalDrPendingToday to set
     */
    public void setTotalDrPendingToday(int totalDrPendingToday) {
        this.totalDrPendingToday = totalDrPendingToday;
    }

    /**
     * @return the totalDrAmtToday
     */
    public int getTotalDrAmtToday() {
        return totalDrAmtToday;
    }

    /**
     * @param totalDrAmtToday the totalDrAmtToday to set
     */
    public void setTotalDrAmtToday(int totalDrAmtToday) {
        this.totalDrAmtToday = totalDrAmtToday;
    }

    /**
     * @return the drLineDao
     */
    public DrLineDAO getDrLineDao() {
        return drLineDao;
    }

    /**
     * @param drLineDao the drLineDao to set
     */
    public void setDrLineDao(DrLineDAO drLineDao) {
        this.drLineDao = drLineDao;
    }
    
}
