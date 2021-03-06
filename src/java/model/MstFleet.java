package model;
// Generated Aug 20, 2017 3:58:45 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MstFleet generated by hbm2java
 */
public class MstFleet  implements java.io.Serializable {


     private String fleetId;
     private String plateNum;
     private String fleetType;
     private String fleetOwnership;
     private String yearOfAcquisition;
     private String yearOfAssembly;
     private String assetNum;
     private String fleetBrand;
     private String fleetModel;
     private String fleetColor;
     private String fleetEngineNum;
     private int fleetCylinderVol;
     private int fleetHousePower;
     private int fleetFuelCap;
     private int fleetOilCap;
     private String gpsNum;
     private String radioNum;
     private String vinNum;
     private int fleetFuelConsumption;
     private int fleetNumOfTire;
     private int fleetSizeOfTire;
     private String fleetKeurNum;
     private Date fleetKeurExpiry;
     private String fleetBpkbId;
     private String fleetStnkId;
     private Date fleetStnkExpiry;
     private String createdBy;
     private Date createdTime;
     private String updatedBy;
     private Date updatedTime;
     private Integer modificationNum;
     private String isEnabled;
     private String isDeleted;
     private Set mstFleetMaintenances = new HashSet(0);
     private Set mstFleetInsurances = new HashSet(0);
     private Set trxDeliveryRequestses = new HashSet(0);

    public MstFleet() {
    }

	
    public MstFleet(String fleetId, int fleetCylinderVol, int fleetHousePower, int fleetFuelCap, int fleetOilCap, int fleetFuelConsumption, int fleetNumOfTire, int fleetSizeOfTire) {
        this.fleetId = fleetId;
        this.fleetCylinderVol = fleetCylinderVol;
        this.fleetHousePower = fleetHousePower;
        this.fleetFuelCap = fleetFuelCap;
        this.fleetOilCap = fleetOilCap;
        this.fleetFuelConsumption = fleetFuelConsumption;
        this.fleetNumOfTire = fleetNumOfTire;
        this.fleetSizeOfTire = fleetSizeOfTire;
    }
    public MstFleet(String fleetId, String plateNum, String fleetType, String fleetOwnership, String yearOfAcquisition, String yearOfAssembly, String assetNum, String fleetBrand, String fleetModel, String fleetColor, String fleetEngineNum, int fleetCylinderVol, int fleetHousePower, int fleetFuelCap, int fleetOilCap, String gpsNum, String radioNum, String vinNum, int fleetFuelConsumption, int fleetNumOfTire, int fleetSizeOfTire, String fleetKeurNum, Date fleetKeurExpiry, String fleetBpkbId, String fleetStnkId, Date fleetStnkExpiry, String createdBy, Date createdTime, String updatedBy, Date updatedTime, Integer modificationNum, String isEnabled, String isDeleted, Set mstFleetMaintenances, Set mstFleetInsurances, Set trxDeliveryRequestses) {
       this.fleetId = fleetId;
       this.plateNum = plateNum;
       this.fleetType = fleetType;
       this.fleetOwnership = fleetOwnership;
       this.yearOfAcquisition = yearOfAcquisition;
       this.yearOfAssembly = yearOfAssembly;
       this.assetNum = assetNum;
       this.fleetBrand = fleetBrand;
       this.fleetModel = fleetModel;
       this.fleetColor = fleetColor;
       this.fleetEngineNum = fleetEngineNum;
       this.fleetCylinderVol = fleetCylinderVol;
       this.fleetHousePower = fleetHousePower;
       this.fleetFuelCap = fleetFuelCap;
       this.fleetOilCap = fleetOilCap;
       this.gpsNum = gpsNum;
       this.radioNum = radioNum;
       this.vinNum = vinNum;
       this.fleetFuelConsumption = fleetFuelConsumption;
       this.fleetNumOfTire = fleetNumOfTire;
       this.fleetSizeOfTire = fleetSizeOfTire;
       this.fleetKeurNum = fleetKeurNum;
       this.fleetKeurExpiry = fleetKeurExpiry;
       this.fleetBpkbId = fleetBpkbId;
       this.fleetStnkId = fleetStnkId;
       this.fleetStnkExpiry = fleetStnkExpiry;
       this.createdBy = createdBy;
       this.createdTime = createdTime;
       this.updatedBy = updatedBy;
       this.updatedTime = updatedTime;
       this.modificationNum = modificationNum;
       this.isEnabled = isEnabled;
       this.isDeleted = isDeleted;
       this.mstFleetMaintenances = mstFleetMaintenances;
       this.mstFleetInsurances = mstFleetInsurances;
       this.trxDeliveryRequestses = trxDeliveryRequestses;
    }
   
    public String getFleetId() {
        return this.fleetId;
    }
    
    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }
    public String getPlateNum() {
        return this.plateNum;
    }
    
    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }
    public String getFleetType() {
        return this.fleetType;
    }
    
    public void setFleetType(String fleetType) {
        this.fleetType = fleetType;
    }
    public String getFleetOwnership() {
        return this.fleetOwnership;
    }
    
    public void setFleetOwnership(String fleetOwnership) {
        this.fleetOwnership = fleetOwnership;
    }
    public String getYearOfAcquisition() {
        return this.yearOfAcquisition;
    }
    
    public void setYearOfAcquisition(String yearOfAcquisition) {
        this.yearOfAcquisition = yearOfAcquisition;
    }
    public String getYearOfAssembly() {
        return this.yearOfAssembly;
    }
    
    public void setYearOfAssembly(String yearOfAssembly) {
        this.yearOfAssembly = yearOfAssembly;
    }
    public String getAssetNum() {
        return this.assetNum;
    }
    
    public void setAssetNum(String assetNum) {
        this.assetNum = assetNum;
    }
    public String getFleetBrand() {
        return this.fleetBrand;
    }
    
    public void setFleetBrand(String fleetBrand) {
        this.fleetBrand = fleetBrand;
    }
    public String getFleetModel() {
        return this.fleetModel;
    }
    
    public void setFleetModel(String fleetModel) {
        this.fleetModel = fleetModel;
    }
    public String getFleetColor() {
        return this.fleetColor;
    }
    
    public void setFleetColor(String fleetColor) {
        this.fleetColor = fleetColor;
    }
    public String getFleetEngineNum() {
        return this.fleetEngineNum;
    }
    
    public void setFleetEngineNum(String fleetEngineNum) {
        this.fleetEngineNum = fleetEngineNum;
    }
    public int getFleetCylinderVol() {
        return this.fleetCylinderVol;
    }
    
    public void setFleetCylinderVol(int fleetCylinderVol) {
        this.fleetCylinderVol = fleetCylinderVol;
    }
    public int getFleetHousePower() {
        return this.fleetHousePower;
    }
    
    public void setFleetHousePower(int fleetHousePower) {
        this.fleetHousePower = fleetHousePower;
    }
    public int getFleetFuelCap() {
        return this.fleetFuelCap;
    }
    
    public void setFleetFuelCap(int fleetFuelCap) {
        this.fleetFuelCap = fleetFuelCap;
    }
    public int getFleetOilCap() {
        return this.fleetOilCap;
    }
    
    public void setFleetOilCap(int fleetOilCap) {
        this.fleetOilCap = fleetOilCap;
    }
    public String getGpsNum() {
        return this.gpsNum;
    }
    
    public void setGpsNum(String gpsNum) {
        this.gpsNum = gpsNum;
    }
    public String getRadioNum() {
        return this.radioNum;
    }
    
    public void setRadioNum(String radioNum) {
        this.radioNum = radioNum;
    }
    public String getVinNum() {
        return this.vinNum;
    }
    
    public void setVinNum(String vinNum) {
        this.vinNum = vinNum;
    }
    public int getFleetFuelConsumption() {
        return this.fleetFuelConsumption;
    }
    
    public void setFleetFuelConsumption(int fleetFuelConsumption) {
        this.fleetFuelConsumption = fleetFuelConsumption;
    }
    public int getFleetNumOfTire() {
        return this.fleetNumOfTire;
    }
    
    public void setFleetNumOfTire(int fleetNumOfTire) {
        this.fleetNumOfTire = fleetNumOfTire;
    }
    public int getFleetSizeOfTire() {
        return this.fleetSizeOfTire;
    }
    
    public void setFleetSizeOfTire(int fleetSizeOfTire) {
        this.fleetSizeOfTire = fleetSizeOfTire;
    }
    public String getFleetKeurNum() {
        return this.fleetKeurNum;
    }
    
    public void setFleetKeurNum(String fleetKeurNum) {
        this.fleetKeurNum = fleetKeurNum;
    }
    public Date getFleetKeurExpiry() {
        return this.fleetKeurExpiry;
    }
    
    public void setFleetKeurExpiry(Date fleetKeurExpiry) {
        this.fleetKeurExpiry = fleetKeurExpiry;
    }
    public String getFleetBpkbId() {
        return this.fleetBpkbId;
    }
    
    public void setFleetBpkbId(String fleetBpkbId) {
        this.fleetBpkbId = fleetBpkbId;
    }
    public String getFleetStnkId() {
        return this.fleetStnkId;
    }
    
    public void setFleetStnkId(String fleetStnkId) {
        this.fleetStnkId = fleetStnkId;
    }
    public Date getFleetStnkExpiry() {
        return this.fleetStnkExpiry;
    }
    
    public void setFleetStnkExpiry(Date fleetStnkExpiry) {
        this.fleetStnkExpiry = fleetStnkExpiry;
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
    public Set getMstFleetMaintenances() {
        return this.mstFleetMaintenances;
    }
    
    public void setMstFleetMaintenances(Set mstFleetMaintenances) {
        this.mstFleetMaintenances = mstFleetMaintenances;
    }
    public Set getMstFleetInsurances() {
        return this.mstFleetInsurances;
    }
    
    public void setMstFleetInsurances(Set mstFleetInsurances) {
        this.mstFleetInsurances = mstFleetInsurances;
    }
    public Set getTrxDeliveryRequestses() {
        return this.trxDeliveryRequestses;
    }
    
    public void setTrxDeliveryRequestses(Set trxDeliveryRequestses) {
        this.trxDeliveryRequestses = trxDeliveryRequestses;
    }




}


