/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import static utils.ILoSConstants.DELIVERY_REPORT;

/**
 *
 * @author ndry93
 */
public class CreateReportAction extends ActionSupport {
    
    private String someVariable;
    
    @Override
    public String execute() throws Exception {
        System.out.println("---CreateReportAction");
        return SUCCESS;
    }
    
    public static void main(String[] args){
        
    }
    
    public String createDeliveryReport(){
        System.out.println("---createDeliveryReport "+this.getSomeVariable());
        return DELIVERY_REPORT;
    }

    public String getSomeVariable() {
        return someVariable;
    }

    public void setSomeVariable(String someVariable) {
        this.someVariable = someVariable;
    }
    
}
