/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import dao.TrxDeliveryRequestsDAO;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.TrxDeliveryRequests;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author S
 */
public class TrxDeliveryRequestsAction extends ActionSupport implements ModelDriven<TrxDeliveryRequests> {

    private TrxDeliveryRequests TrxDeliveryRequest = new TrxDeliveryRequests();
    private List<TrxDeliveryRequests> TrxDeliveryRequestList = new ArrayList<TrxDeliveryRequests>();
    TrxDeliveryRequestsDAO dao = new TrxDeliveryRequestsDAO();

    @Override
    public TrxDeliveryRequests getModel() {
        return getTrxDeliveryRequest();
    }

    public String addAction() {
        dao.create(getTrxDeliveryRequest());
        return SUCCESS;
    }

    public String updateAction() {
        dao.update(getTrxDeliveryRequest());
        return SUCCESS;
    }

    public String delete() {
//        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
//		userDAO.deleteUser(Long.parseLong( request.getParameter("id")));
//		return SUCCESS;
        dao.delete(getTrxDeliveryRequest());
        return SUCCESS;
    }

    /**
     * To list a single user by Id.
     *
     * @return String
     */
    public String edit() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
//        user = userDAO.listUserById(Long.parseLong(request.getParameter("id")));
//        return SUCCESS;
        this.setTrxDeliveryRequest(dao.find(request.getParameter("dreqNUM")));
        return SUCCESS;
    }

    public String listAvailableDRRequest() {
        setTrxDeliveryRequestList((List<TrxDeliveryRequests>) dao.getTrxDeliveryRequestList());
        return SUCCESS;
    }

    /**
     * @return the TrxDeliveryRequest
     */
    public TrxDeliveryRequests getTrxDeliveryRequest() {
        return TrxDeliveryRequest;
    }

    /**
     * @param TrxDeliveryRequest the TrxDeliveryRequest to set
     */
    public void setTrxDeliveryRequest(TrxDeliveryRequests TrxDeliveryRequest) {
        this.TrxDeliveryRequest = TrxDeliveryRequest;
    }

    /**
     * @return the TrxDeliveryRequestList
     */
    public List<TrxDeliveryRequests> getTrxDeliveryRequestList() {
        return TrxDeliveryRequestList;
    }

    /**
     * @param TrxDeliveryRequestList the TrxDeliveryRequestList to set
     */
    public void setTrxDeliveryRequestList(List<TrxDeliveryRequests> TrxDeliveryRequestList) {
        this.TrxDeliveryRequestList = TrxDeliveryRequestList;
    }

}
