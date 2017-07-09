package model;
// Generated Jul 9, 2017 10:35:16 AM by Hibernate Tools 4.3.1


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
     private String destinationscol;
     private String createdBy;
     private Date createdDate;
     private String updatedBy;
     private Date updatedDate;
     private String enabled;
     private Set drLineDests = new HashSet(0);

    public Destinations() {
    }

    public Destinations(String destName, String destAddr, String destType, String destinationscol, String createdBy, Date createdDate, String updatedBy, Date updatedDate, String enabled, Set drLineDests) {
       this.destName = destName;
       this.destAddr = destAddr;
       this.destType = destType;
       this.destinationscol = destinationscol;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.updatedBy = updatedBy;
       this.updatedDate = updatedDate;
       this.enabled = enabled;
       this.drLineDests = drLineDests;
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
    public String getDestinationscol() {
        return this.destinationscol;
    }
    
    public void setDestinationscol(String destinationscol) {
        this.destinationscol = destinationscol;
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
    public Set getDrLineDests() {
        return this.drLineDests;
    }
    
    public void setDrLineDests(Set drLineDests) {
        this.drLineDests = drLineDests;
    }




}

