package model;
// Generated Aug 20, 2017 3:58:45 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MstDrivers generated by hbm2java
 */
public class MstDrivers  implements java.io.Serializable {


     private String driverId;
     private String driverName;
     private String licenseId;
     private String ktpId;
     private String contactNum;
     private String address;
     private String city;
     private String province;
     private String country;
     private byte[] driverPict;
     private String historyInfo;
     private String createdBy;
     private Date createdTime;
     private String updatedBy;
     private Date updatedTime;
     private Integer modificationNum;
     private String isEnabled;
     private String isDeleted;
     private Set trxDeliveryRequestses = new HashSet(0);
     private Set trxDriverAvailibilties = new HashSet(0);

    public MstDrivers() {
    }

	
    public MstDrivers(String driverId) {
        this.driverId = driverId;
    }
    public MstDrivers(String driverId, String driverName, String licenseId, String ktpId, String contactNum, String address, String city, String province, String country, byte[] driverPict, String historyInfo, String createdBy, Date createdTime, String updatedBy, Date updatedTime, Integer modificationNum, String isEnabled, String isDeleted, Set trxDeliveryRequestses, Set trxDriverAvailibilties) {
       this.driverId = driverId;
       this.driverName = driverName;
       this.licenseId = licenseId;
       this.ktpId = ktpId;
       this.contactNum = contactNum;
       this.address = address;
       this.city = city;
       this.province = province;
       this.country = country;
       this.driverPict = driverPict;
       this.historyInfo = historyInfo;
       this.createdBy = createdBy;
       this.createdTime = createdTime;
       this.updatedBy = updatedBy;
       this.updatedTime = updatedTime;
       this.modificationNum = modificationNum;
       this.isEnabled = isEnabled;
       this.isDeleted = isDeleted;
       this.trxDeliveryRequestses = trxDeliveryRequestses;
       this.trxDriverAvailibilties = trxDriverAvailibilties;
    }
   
    public String getDriverId() {
        return this.driverId;
    }
    
    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }
    public String getDriverName() {
        return this.driverName;
    }
    
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public String getLicenseId() {
        return this.licenseId;
    }
    
    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }
    public String getKtpId() {
        return this.ktpId;
    }
    
    public void setKtpId(String ktpId) {
        this.ktpId = ktpId;
    }
    public String getContactNum() {
        return this.contactNum;
    }
    
    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getProvince() {
        return this.province;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public byte[] getDriverPict() {
        return this.driverPict;
    }
    
    public void setDriverPict(byte[] driverPict) {
        this.driverPict = driverPict;
    }
    public String getHistoryInfo() {
        return this.historyInfo;
    }
    
    public void setHistoryInfo(String historyInfo) {
        this.historyInfo = historyInfo;
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
    public Set getTrxDeliveryRequestses() {
        return this.trxDeliveryRequestses;
    }
    
    public void setTrxDeliveryRequestses(Set trxDeliveryRequestses) {
        this.trxDeliveryRequestses = trxDeliveryRequestses;
    }
    public Set getTrxDriverAvailibilties() {
        return this.trxDriverAvailibilties;
    }
    
    public void setTrxDriverAvailibilties(Set trxDriverAvailibilties) {
        this.trxDriverAvailibilties = trxDriverAvailibilties;
    }




}


