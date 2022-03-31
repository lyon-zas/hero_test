package com.demo.app.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table
public class Heroku implements  Serializable{
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

    public Heroku(){
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWebMail() {
        return webMail;
    }

    public void setWebMail(String webMail) {
        this.webMail = webMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getTodayDate() {
        return todayDate;
    }

    public void setTodayDate(String todayDate) {
        this.todayDate = todayDate;
    }

    @Override
    public String toString(){
        return  "Heroku{" +
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
