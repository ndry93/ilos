package model;
// Generated Aug 2, 2017 11:44:35 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Destinations generated by hbm2java
 */
public class Destinations  implements java.io.Serializable {


     private Integer destId;
     private String destName;
     private String destAddr;
     private String destType;
     private Integer areaId;
     private String createdBy;
     private Date createdDate;
     private String updatedBy;
     private Date updatedDate;
     private String enabled;
     private String isDeleted;
     private Set drLineses = new HashSet(0);

    public Destinations() {
    }

    public Destinations(String destName, String destAddr, String destType, Integer areaId, String createdBy, Date createdDate, String updatedBy, Date updatedDate, String enabled, String isDeleted, Set drLineses) {
       this.destName = destName;
       this.destAddr = destAddr;
       this.destType = destType;
       this.areaId = areaId;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.updatedBy = updatedBy;
       this.updatedDate = updatedDate;
       this.enabled = enabled;
       this.isDeleted = isDeleted;
       this.drLineses = drLineses;
    }
   
    public Integer getDestId() {
        return this.destId;
    }
    
    public void setDestId(Integer destId) {
        this.destId = destId;
    }
    public String getDestName() {
        return this.destName;
    }
    
    public void setDestName(String destName) {
        this.destName = destName;
    }
    public String getDestAddr() {
        return this.destAddr;
    }
    
    public void setDestAddr(String destAddr) {
        this.destAddr = destAddr;
    }
    public String getDestType() {
        return this.destType;
    }
    
    public void setDestType(String destType) {
        this.destType = destType;
    }
    public Integer getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
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
    public String getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }
    public Set getDrLineses() {
        return this.drLineses;
    }
    
    public void setDrLineses(Set drLineses) {
        this.drLineses = drLineses;
    }




}


