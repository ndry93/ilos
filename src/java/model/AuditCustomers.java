package model;
// Generated Aug 6, 2017 11:25:33 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * AuditCustomers generated by hbm2java
 */
public class AuditCustomers  implements java.io.Serializable {


     private Integer id;
     private String action;
     private int customerId;
     private String createdBy;
     private Date createdDate;

    public AuditCustomers() {
    }

	
    public AuditCustomers(int customerId) {
        this.customerId = customerId;
    }
    public AuditCustomers(String action, int customerId, String createdBy, Date createdDate) {
       this.action = action;
       this.customerId = customerId;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getAction() {
        return this.action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }
    public int getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }




}


