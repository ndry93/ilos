package model;
// Generated Aug 20, 2017 3:58:45 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SysObjects generated by hbm2java
 */
public class SysObjects  implements java.io.Serializable {


     private String objectId;
     private String objectDescription;
     private String objectType;
     private String createdBy;
     private Date createdTime;
     private String updatedBy;
     private Date updatedTime;
     private Integer modificationNum;
     private String isEnabled;
     private String isDeleted;
     private Set sysRolesObjectses = new HashSet(0);

    public SysObjects() {
    }

	
    public SysObjects(String objectId) {
        this.objectId = objectId;
    }
    public SysObjects(String objectId, String objectDescription, String objectType, String createdBy, Date createdTime, String updatedBy, Date updatedTime, Integer modificationNum, String isEnabled, String isDeleted, Set sysRolesObjectses) {
       this.objectId = objectId;
       this.objectDescription = objectDescription;
       this.objectType = objectType;
       this.createdBy = createdBy;
       this.createdTime = createdTime;
       this.updatedBy = updatedBy;
       this.updatedTime = updatedTime;
       this.modificationNum = modificationNum;
       this.isEnabled = isEnabled;
       this.isDeleted = isDeleted;
       this.sysRolesObjectses = sysRolesObjectses;
    }
   
    public String getObjectId() {
        return this.objectId;
    }
    
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }
    public String getObjectDescription() {
        return this.objectDescription;
    }
    
    public void setObjectDescription(String objectDescription) {
        this.objectDescription = objectDescription;
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
    public Date getCreatedTime() {
        return this.createdTime;
    }
    
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }
    
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    public Date getUpdatedTime() {
        return this.updatedTime;
    }
    
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
    public Integer getModificationNum() {
        return this.modificationNum;
    }
    
    public void setModificationNum(Integer modificationNum) {
        this.modificationNum = modificationNum;
    }
    public String getIsEnabled() {
        return this.isEnabled;
    }
    
    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }
    public String getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }
    public Set getSysRolesObjectses() {
        return this.sysRolesObjectses;
    }
    
    public void setSysRolesObjectses(Set sysRolesObjectses) {
        this.sysRolesObjectses = sysRolesObjectses;
    }




}


