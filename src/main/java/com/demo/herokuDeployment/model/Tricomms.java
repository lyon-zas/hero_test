package com.demo.herokuDeployment.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table
public class Tricomms implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)

    private  Long userId;
    private String userName;
    private String webMail;
    private String firstName;
    private String lastName;
    private String accountStatus;
    private String userRole;
    private String password;
    private String confirmPassword;
    private String profilePicture;
    private String todayDate;

    public Tricomms(){
    }

  //Encapsulative mapping done below

    //userId
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    //userName
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    //webMail
    public String getWebMail() {
        return webMail;
    }

    public void setWebMail(String webMail) {
        this.webMail = webMail;
    }

    //firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //accountStatus
    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    //userRole
    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    //password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //confirmPassword
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    //profilePicture
    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    //todayDate
    public String getTodayDate() {
        return todayDate;
    }

    public void setTodayDate(String todayDate) {
        this.todayDate = todayDate;
    }

    @Override
    public String toString(){
        return  "Tricomms{" +
                "userId=" + userId +
                ", userName='" + userName +'\'' +
                ", webMail='" + webMail + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                ", userRole='" + userRole + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", todayDate='" + todayDate + '\'' +
                '}';
    }
}
