/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.UsersRelPermissions;

/**
 *
 * @author Dario
 */
public class UsersPermissionsDTO {
    
    public Integer idUsersPermissions;
    public String name;
    public String description;
    public UsersRelPermissionsDTO usersRelPermissions;
    public SisModulesDTO sisModules;
    public SisStatusDTO status;

    public Integer getIdUsersPermissions() {
        return idUsersPermissions;
    }

    public void setIdUsersPermissions(Integer idUsersPermissions) {
        this.idUsersPermissions = idUsersPermissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UsersRelPermissionsDTO getUsersRelPermissions() {
        return usersRelPermissions;
    }

    public void setUsersRelPermissions(UsersRelPermissionsDTO usersRelPermissions) {
        this.usersRelPermissions = usersRelPermissions;
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
    
    
}
