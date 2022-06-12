/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import java.util.Date;

/**
 *
 * @author Dario
 */
public class UsersChangePasswordsDTO {
    public Integer idChangePasswords;
    public String hashId;
    public Date dateExpired;
    public Date dateOrden;
    public Boolean used;
    public PlatformDTO platforms;
    public SisModulesDTO sisModules;
    public SisStatusDTO status;
    public UsersDTO users;

    public Integer getIdChangePasswords() {
        return idChangePasswords;
    }

    public void setIdChangePasswords(Integer idChangePasswords) {
        this.idChangePasswords = idChangePasswords;
    }

    public String getHashId() {
        return hashId;
    }

    public void setHashId(String hashId) {
        this.hashId = hashId;
    }

    public Date getDateExpired() {
        return dateExpired;
    }

    public void setDateExpired(Date dateExpired) {
        this.dateExpired = dateExpired;
    }

    public Date getDateOrden() {
        return dateOrden;
    }

    public void setDateOrden(Date dateOrden) {
        this.dateOrden = dateOrden;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public PlatformDTO getPlatforms() {
        return platforms;
    }

    public void setPlatforms(PlatformDTO platforms) {
        this.platforms = platforms;
    }

    public SisModulesDTO getSisModules() {
        return sisModules;
    }

    public void setSisModules(SisModulesDTO sisModules) {
        this.sisModules = sisModules;
    }

    public SisStatusDTO getStatus() {
        return status;
    }

    public void setStatus(SisStatusDTO status) {
        this.status = status;
    }

    public UsersDTO getUsers() {
        return users;
    }

    public void setUsers(UsersDTO users) {
        this.users = users;
    }
    
}
