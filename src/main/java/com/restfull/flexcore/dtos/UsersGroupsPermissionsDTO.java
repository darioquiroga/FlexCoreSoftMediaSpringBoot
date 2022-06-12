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
public class UsersGroupsPermissionsDTO {
    public Integer idGroupsPermissions;
    public String name;
    public String iso;
    public Boolean add;
    public Boolean edit;
    public Boolean delete;
    public Boolean readOnly;
    public UsersGroupDTO usersGroups;
    public SisStatusDTO status;

    public Integer getIdGroupsPermissions() {
        return idGroupsPermissions;
    }

    public void setIdGroupsPermissions(Integer idGroupsPermissions) {
        this.idGroupsPermissions = idGroupsPermissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
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

    public UsersGroupDTO getUsersGroups() {
        return usersGroups;
    }

    public void setUsersGroups(UsersGroupDTO usersGroups) {
        this.usersGroups = usersGroups;
    }

    public SisStatusDTO getStatus() {
        return status;
    }

    public void setStatus(SisStatusDTO status) {
        this.status = status;
    }

    
    
}
