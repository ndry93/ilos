package model;
// Generated Jul 9, 2017 10:35:16 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Objects generated by hbm2java
 */
public class Objects  implements java.io.Serializable {


     private Integer objectId;
     private String objectName;
     private String objectDesc;
     private String objectType;
     private String createdBy;
     private Date createdDate;
     private String updatedBy;
     private Date updatedDate;
     private String enabled;
     private Set userRolesObjectses = new HashSet(0);

    public Objects() {
    }

    public Objects(String objectName, String objectDesc, String objectType, String createdBy, Date createdDate, String updatedBy, Date updatedDate, String enabled, Set userRolesObjectses) {
       this.objectName = objectName;
       this.objectDesc = objectDesc;
       this.objectType = objectType;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.updatedBy = updatedBy;
       this.updatedDate = updatedDate;
       this.enabled = enabled;
       this.userRolesObjectses = userRolesObjectses;
    }
   
    public Integer getObjectId() {
        return this.objectId;
    }
    
    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }
    public String getObjectName() {
        return this.objectName;
    }
    
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
    public String getObjectDesc() {
        return this.objectDesc;
    }
    
    public void setObjectDesc(String objectDesc) {
        this.objectDesc = objectDesc;
    }
    public String getObjectType() {
        return this.objectType;
    }
    
    public void setObjectType(String objectType) {
        this.objectType = objectType;
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
    public Set getUserRolesObjectses() {
        return this.userRolesObjectses;
    }
    
    public void setUserRolesObjectses(Set userRolesObjectses) {
        this.userRolesObjectses = userRolesObjectses;
    }




}


