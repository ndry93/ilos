package model;
// Generated Aug 2, 2017 11:44:35 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * AuditDrLines generated by hbm2java
 */
public class AuditDrLines  implements java.io.Serializable {


     private Integer id;
     private String action;
     private int drLineId;
     private String createdBy;
     private Date createdDate;

    public AuditDrLines() {
    }

	
    public AuditDrLines(int drLineId) {
        this.drLineId = drLineId;
    }
    public AuditDrLines(String action, int drLineId, String createdBy, Date createdDate) {
       this.action = action;
       this.drLineId = drLineId;
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
    public int getDrLineId() {
        return this.drLineId;
    }
    
    public void setDrLineId(int drLineId) {
        this.drLineId = drLineId;
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


