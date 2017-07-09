package model;
// Generated Jul 9, 2017 10:35:16 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Customers generated by hbm2java
 */
public class Customers  implements java.io.Serializable {


     private Integer customerId;
     private String customerName;
     private String customerAddr;
     private String customerPhone;
     private String createdBy;
     private Date createdDate;
     private String updatedBy;
     private Date updatedDate;
     private String enabled;
     private Set drHeaderses = new HashSet(0);

    public Customers() {
    }

    public Customers(String customerName, String customerAddr, String customerPhone, String createdBy, Date createdDate, String updatedBy, Date updatedDate, String enabled, Set drHeaderses) {
       this.customerName = customerName;
       this.customerAddr = customerAddr;
       this.customerPhone = customerPhone;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.updatedBy = updatedBy;
       this.updatedDate = updatedDate;
       this.enabled = enabled;
       this.drHeaderses = drHeaderses;
    }
   
    public Integer getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerAddr() {
        return this.customerAddr;
    }
    
    public void setCustomerAddr(String customerAddr) {
        this.customerAddr = customerAddr;
    }
    public String getCustomerPhone() {
        return this.customerPhone;
    }
    
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
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
    public String getUpdatedBy() {
        return this.updatedBy;
    }
    
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    public Date getUpdatedDate() {
        return this.updatedDate;
    }
    
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    public String getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
    public Set getDrHeaderses() {
        return this.drHeaderses;
    }
    
    public void setDrHeaderses(Set drHeaderses) {
        this.drHeaderses = drHeaderses;
    }




}


