package model;
// Generated Aug 2, 2017 11:44:35 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private String userName;
     private People people;
     private String password;
     private String createdBy;
     private Date createdDate;
     private String updatedBy;
     private Date updatedDate;
     private String enabled;
     private String isDeleted;
     private Set userRolesObjectses = new HashSet(0);

    public Users() {
    }

	
    public Users(String userName, People people) {
        this.userName = userName;
        this.people = people;
    }
    public Users(String userName, People people, String password, String createdBy, Date createdDate, String updatedBy, Date updatedDate, String enabled, String isDeleted, Set userRolesObjectses) {
       this.userName = userName;
       this.people = people;
       this.password = password;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.updatedBy = updatedBy;
       this.updatedDate = updatedDate;
       this.enabled = enabled;
       this.isDeleted = isDeleted;
       this.userRolesObjectses = userRolesObjectses;
    }
   
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public People getPeople() {
        return this.people;
    }
    
    public void setPeople(People people) {
        this.people = people;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
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


