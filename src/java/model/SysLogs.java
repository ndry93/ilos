package model;
// Generated Aug 20, 2017 3:58:45 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * SysLogs generated by hbm2java
 */
public class SysLogs  implements java.io.Serializable {


     private String rowId;
     private Date logTime;
     private String loginId;
     private String entityName;
     private String entityKey;
     private String logAction;
     private String logType;
     private String logDescription;
     private String logDescription2;

    public SysLogs() {
    }

	
    public SysLogs(String rowId) {
        this.rowId = rowId;
    }
    public SysLogs(String rowId, Date logTime, String loginId, String entityName, String entityKey, String logAction, String logType, String logDescription, String logDescription2) {
       this.rowId = rowId;
       this.logTime = logTime;
       this.loginId = loginId;
       this.entityName = entityName;
       this.entityKey = entityKey;
       this.logAction = logAction;
       this.logType = logType;
       this.logDescription = logDescription;
       this.logDescription2 = logDescription2;
    }
   
    public String getRowId() {
        return this.rowId;
    }
    
    public void setRowId(String rowId) {
        this.rowId = rowId;
    }
    public Date getLogTime() {
        return this.logTime;
    }
    
    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }
    public String getLoginId() {
        return this.loginId;
    }
    
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
    public String getEntityName() {
        return this.entityName;
    }
    
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
    public String getEntityKey() {
        return this.entityKey;
    }
    
    public void setEntityKey(String entityKey) {
        this.entityKey = entityKey;
    }
    public String getLogAction() {
        return this.logAction;
    }
    
    public void setLogAction(String logAction) {
        this.logAction = logAction;
    }
    public String getLogType() {
        return this.logType;
    }
    
    public void setLogType(String logType) {
        this.logType = logType;
    }
    public String getLogDescription() {
        return this.logDescription;
    }
    
    public void setLogDescription(String logDescription) {
        this.logDescription = logDescription;
    }
    public String getLogDescription2() {
        return this.logDescription2;
    }
    
    public void setLogDescription2(String logDescription2) {
        this.logDescription2 = logDescription2;
    }




}


