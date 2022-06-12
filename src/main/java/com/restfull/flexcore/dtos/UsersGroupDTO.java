/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.Clients;
import com.restfull.flexcore.entities.SisModules;
import com.restfull.flexcore.entities.UsersGroups;
import com.restfull.flexcore.entities.UsersGroupsPermissions;

/**
 *
 * @author Dario
 */
public class UsersGroupDTO {
    
    public Integer idUsersGroups;
    public String description;
    public String name;
    public UsersDTO users;
    // convertir a dtos
    public UsersGroupsPermissionsDTO  usersGroupsPermissions;
    public Clients clients;
    public SisModules sisModule;
    public SisStatusDTO sisStatus;

    public Integer getIdUsersGroups() {
        return idUsersGroups;
    }

    public void setIdUsersGroups(Integer idUsersGroups) {
        this.idUsersGroups = idUsersGroups;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UsersDTO getUsers() {
        return users;
    }

    public void setUsers(UsersDTO users) {
        this.users = users;
    }

    public UsersGroupsPermissionsDTO getUsersGroupsPermissions() {
        return usersGroupsPermissions;
    }

    public void setUsersGroupsPermissions(UsersGroupsPermissionsDTO usersGroupsPermissions) {
        this.usersGroupsPermissions = usersGroupsPermissions;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public SisModules getSisModule() {
        return sisModule;
    }

    public void setSisModule(SisModules sisModule) {
        this.sisModule = sisModule;
    }

    public SisStatusDTO getSisStatus() {
        return sisStatus;
    }

    public void setSisStatus(SisStatusDTO sisStatus) {
        this.sisStatus = sisStatus;
    }
            
    
}
