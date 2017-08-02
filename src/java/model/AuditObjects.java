package model;
// Generated Aug 2, 2017 11:44:35 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * AuditObjects generated by hbm2java
 */
public class AuditObjects  implements java.io.Serializable {


     private Integer id;
     private String action;
     private int objectId;
     private String createdBy;
     private Date createdDate;

    public AuditObjects() {
    }

	
    public AuditObjects(int objectId) {
        this.objectId = objectId;
    }
    public AuditObjects(String action, int objectId, String createdBy, Date createdDate) {
       this.action = action;
       this.objectId = objectId;
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
    public int getObjectId() {
        return this.objectId;
    }
    
    public void setObjectId(int objectId) {
        this.objectId = objectId;
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


