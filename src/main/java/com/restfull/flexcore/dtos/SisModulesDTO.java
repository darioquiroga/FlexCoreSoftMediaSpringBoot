/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.SisModules;
import java.math.BigInteger;

/**
 *
 * @author Dario
 */
public class SisModulesDTO {
    public Integer idModule;
    public String name;
    public String description;
    public UsersChangePasswordsDTO usersChangePasswords;
    public UsersPermissionsDTO usersPermissions;
    public SisModuleRelClientDTO sisModulerelClient;
    public SisStatusDTO sisStatus; 

    public Integer getIdModule() {
        return idModule;
    }

    public void setIdModule(Integer idModule) {
        this.idModule = idModule;
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

    public UsersChangePasswordsDTO getUsersChangePasswords() {
        return usersChangePasswords;
    }

    public void setUsersChangePasswords(UsersChangePasswordsDTO usersChangePasswords) {
        this.usersChangePasswords = usersChangePasswords;
    }

    public UsersPermissionsDTO getUsersPermissions() {
        return usersPermissions;
    }

    public void setUsersPermissions(UsersPermissionsDTO usersPermissions) {
        this.usersPermissions = usersPermissions;
    }

    public SisModuleRelClientDTO getSisModulerelClient() {
        return sisModulerelClient;
    }

    public void setSisModulerelClient(SisModuleRelClientDTO sisModulerelClient) {
        this.sisModulerelClient = sisModulerelClient;
    }

    public SisStatusDTO getSisStatus() {
        return sisStatus;
    }

    public void setSisStatus(SisStatusDTO sisStatus) {
        this.sisStatus = sisStatus;
    }
    
    
  
    

}
