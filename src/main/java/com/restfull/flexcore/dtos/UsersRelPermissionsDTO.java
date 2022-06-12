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
public class UsersRelPermissionsDTO {
    public Integer idUserRelPermissions;
    public Boolean add;
    public Boolean edit;
    public Boolean delete;
    public Boolean readOnly;
    public UsersDTO users;
    public UsersPermissionsDTO usersPermissions;
    public SisStatusDTO status;

    public Integer getIdUserRelPermissions() {
        return idUserRelPermissions;
    }

    public void setIdUserRelPermissions(Integer idUserRelPermissions) {
        this.idUserRelPermissions = idUserRelPermissions;
    }

    public Boolean getAdd() {
        return add;
    }

    public void setAdd(Boolean add) {
        this.add = add;
    }

    public Boolean getEdit() {
        return edit;
    }

    public void setEdit(Boolean edit) {
        this.edit = edit;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public UsersDTO getUsers() {
        return users;
    }

    public void setUsers(UsersDTO users) {
        this.users = users;
    }

    public UsersPermissionsDTO getUsersPermissions() {
        return usersPermissions;
    }

    public void setUsersPermissions(UsersPermissionsDTO usersPermissions) {
        this.usersPermissions = usersPermissions;
    }

    public SisStatusDTO getStatus() {
        return status;
    }

    public void setStatus(SisStatusDTO status) {
        this.status = status;
    }
    
            
            
}
