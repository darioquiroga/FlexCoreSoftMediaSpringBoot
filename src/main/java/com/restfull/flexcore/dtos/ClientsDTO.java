/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.Companys;
import java.math.BigInteger;

/**
 *
 * @author Dario
 */
public class ClientsDTO {
    public Integer idClient;
    public String name;
    public String description;
    public String adress;
    public BigInteger  phoneNumber;
    public String email;
    public String web;
    public ClientsSubCategoriesDTO clientsSubCategories;
    public CompanysDTO company;
    public GeoCitysDTO geoCity;
    public SisModuleRelClientDTO sisModuleRelClient;
    public UsersGroupDTO usersGroup;

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public BigInteger getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(BigInteger phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public ClientsSubCategoriesDTO getClientsSubCategories() {
        return clientsSubCategories;
    }

    public void setClientsSubCategories(ClientsSubCategoriesDTO clientsSubCategories) {
        this.clientsSubCategories = clientsSubCategories;
    }

    public CompanysDTO getCompany() {
        return company;
    }

    public void setCompany(CompanysDTO company) {
        this.company = company;
    }

    public GeoCitysDTO getGeoCity() {
        return geoCity;
    }

    public void setGeoCity(GeoCitysDTO geoCity) {
        this.geoCity = geoCity;
    }

    public SisModuleRelClientDTO getSisModuleRelClient() {
        return sisModuleRelClient;
    }

    public void setSisModuleRelClient(SisModuleRelClientDTO sisModuleRelClient) {
        this.sisModuleRelClient = sisModuleRelClient;
    }

    public UsersGroupDTO getUsersGroup() {
        return usersGroup;
    }

    public void setUsersGroup(UsersGroupDTO usersGroup) {
        this.usersGroup = usersGroup;
    }
    
    
    
}
