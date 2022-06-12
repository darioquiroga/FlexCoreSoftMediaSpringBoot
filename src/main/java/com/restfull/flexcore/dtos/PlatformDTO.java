/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

/**
 *
 * @author Dario
 */
public class PlatformDTO {
    public Integer idPlatform;
    public String name;
    public String description;
    public UsersChangePasswordsDTO usersChangePasswords;
    public UsersTokensDTO usersTokens;

    public Integer getIdPlatform() {
        return idPlatform;
    }

    public void setIdPlatform(Integer idPlatform) {
        this.idPlatform = idPlatform;
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

    public UsersTokensDTO getUsersTokens() {
        return usersTokens;
    }

    public void setUsersTokens(UsersTokensDTO usersTokens) {
        this.usersTokens = usersTokens;
    }
    
}
