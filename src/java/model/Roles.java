package model;
// Generated Aug 5, 2017 11:03:01 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Roles generated by hbm2java
 */
public class Roles  implements java.io.Serializable {


     private Integer roleId;
     private String roleName;
     private String roleDesc;
     private String createdBy;
     private Date createdDate;
     private String updatedBy;
     private Date updatedDate;
     private String enabled;
     private String isDeleted;
     private Set userRolesObjectses = new HashSet(0);

    public Roles() {
    }

    public Roles(String roleName, String roleDesc, String createdBy, Date createdDate, String updatedBy, Date updatedDate, String enabled, String isDeleted, Set userRolesObjectses) {
       this.roleName = roleName;
       this.roleDesc = roleDesc;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.updatedBy = updatedBy;
       this.updatedDate = updatedDate;
       this.enabled = enabled;
       this.isDeleted = isDeleted;
       this.userRolesObjectses = userRolesObjectses;
    }
   
    public Integer getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public String getRoleDesc() {
        return this.roleDesc;
    }
    
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
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
    public Set getUserRolesObjectses() {
        return this.userRolesObjectses;
    }
    
    public void setUserRolesObjectses(Set userRolesObjectses) {
        this.userRolesObjectses = userRolesObjectses;
    }




}


