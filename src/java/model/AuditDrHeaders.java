package model;
// Generated Aug 6, 2017 11:25:33 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * AuditDrHeaders generated by hbm2java
 */
public class AuditDrHeaders  implements java.io.Serializable {


     private Integer id;
     private String action;
     private int drHeaderId;
     private String createdBy;
     private Date createdDate;

    public AuditDrHeaders() {
    }

	
    public AuditDrHeaders(int drHeaderId) {
        this.drHeaderId = drHeaderId;
    }
    public AuditDrHeaders(String action, int drHeaderId, String createdBy, Date createdDate) {
       this.action = action;
       this.drHeaderId = drHeaderId;
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
    public int getDrHeaderId() {
        return this.drHeaderId;
    }
    
    public void setDrHeaderId(int drHeaderId) {
        this.drHeaderId = drHeaderId;
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


