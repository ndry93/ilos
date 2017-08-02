package model;
// Generated Aug 2, 2017 11:44:35 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * AuditDestinations generated by hbm2java
 */
public class AuditDestinations  implements java.io.Serializable {


     private Integer id;
     private String action;
     private int destId;
     private String createdBy;
     private Date createdDate;

    public AuditDestinations() {
    }

	
    public AuditDestinations(int destId) {
        this.destId = destId;
    }
    public AuditDestinations(String action, int destId, String createdBy, Date createdDate) {
       this.action = action;
       this.destId = destId;
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
    public int getDestId() {
        return this.destId;
    }
    
    public void setDestId(int destId) {
        this.destId = destId;
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

