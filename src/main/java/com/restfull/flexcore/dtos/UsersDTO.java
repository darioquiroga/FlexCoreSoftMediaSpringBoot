/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.Users;

import java.io.ObjectInputFilter.Status;
import java.util.Date;


/**
 *
 * @author Dario
 */

public class UsersDTO {
 
    
    public Integer idUser;
    public String name;
    public String lastName;
    public String user;
    public String passwords;
    public String loginQrPath;
    public String mail;
    public Date created;
    public Date modify;
    public Boolean superUser; 
    public SisStatusDTO status;
    public UsersTokensDTO userTokens;
    public UsersGroupDTO userGroups;
    public UsersDetailsDTO userDetails;
    public UsersRelPermissionsDTO userRelPermisions;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getLoginQrPath() {
        return loginQrPath;
    }

    public void setLoginQrPath(String loginQrPath) {
        this.loginQrPath = loginQrPath;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModify() {
        return modify;
    }

    public void setModify(Date modify) {
        this.modify = modify;
    }

    public Boolean getSuperUser() {
        return superUser;
    }

    public void setSuperUser(Boolean superUser) {
        this.superUser = superUser;
    }

    public SisStatusDTO getStatus() {
        return status;
    }

    public void setStatus(SisStatusDTO status) {
        this.status = status;
    }

    public UsersTokensDTO getUserTokens() {
        return userTokens;
    }

    public void setUserTokens(UsersTokensDTO userTokens) {
        this.userTokens = userTokens;
    }

    public UsersGroupDTO getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(UsersGroupDTO userGroups) {
        this.userGroups = userGroups;
    }

    public UsersDetailsDTO getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UsersDetailsDTO userDetails) {
        this.userDetails = userDetails;
    }

    public UsersRelPermissionsDTO getUserRelPermisions() {
        return userRelPermisions;
    }

    public void setUserRelPermisions(UsersRelPermissionsDTO userRelPermisions) {
        this.userRelPermisions = userRelPermisions;
    }
   

  
            
}
