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
public class UsersTokensDTO {
    public Integer idUsersTokens;
    public String hashId;
    public Date dateFrom;
    public Date dateTo;
    public String soruce;
    public String agent;
    public UsersDTO users;
    public SisStatusDTO status;
    public PlatformDTO platform;

    public Integer getIdUsersTokens() {
        return idUsersTokens;
    }

    public void setIdUsersTokens(Integer idUsersTokens) {
        this.idUsersTokens = idUsersTokens;
    }

    public String getHashId() {
        return hashId;
    }

    public void setHashId(String hashId) {
        this.hashId = hashId;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getSoruce() {
        return soruce;
    }

    public void setSoruce(String soruce) {
        this.soruce = soruce;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public UsersDTO getUsers() {
        return users;
    }

    public void setUsers(UsersDTO users) {
        this.users = users;
    }

    public SisStatusDTO getStatus() {
        return status;
    }

    public void setStatus(SisStatusDTO status) {
        this.status = status;
    }

    public PlatformDTO getPlatform() {
        return platform;
    }

    public void setPlatform(PlatformDTO platform) {
        this.platform = platform;
    }
            
           
}
