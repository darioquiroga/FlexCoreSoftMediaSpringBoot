/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.Geocitys;
import java.math.BigInteger;

/**
 *
 * @author Dario
 */
public class GeoCitysDTO {
    public Integer idCity;
    public String name;
    public String iso;
    public Integer postalCode;
    public String geoLocAltitude;
    public String geoLocLongitude;
    public ClientsDTO clients;
    public GeoStatesDTO geoStates;
    public SisStatusDTO sisStatus; 
    public UsersDetailsDTO userDetail;

    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
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

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getGeoLocAltitude() {
        return geoLocAltitude;
    }

    public void setGeoLocAltitude(String geoLocAltitude) {
        this.geoLocAltitude = geoLocAltitude;
    }

    public String getGeoLocLongitude() {
        return geoLocLongitude;
    }

    public void setGeoLocLongitude(String geoLocLongitude) {
        this.geoLocLongitude = geoLocLongitude;
    }

    public ClientsDTO getClients() {
        return clients;
    }

    public void setClients(ClientsDTO clients) {
        this.clients = clients;
    }

    public GeoStatesDTO getGeoStates() {
        return geoStates;
    }

    public void setGeoStates(GeoStatesDTO geoStates) {
        this.geoStates = geoStates;
    }

    public SisStatusDTO getSisStatus() {
        return sisStatus;
    }

    public void setSisStatus(SisStatusDTO sisStatus) {
        this.sisStatus = sisStatus;
    }

    public UsersDetailsDTO getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UsersDetailsDTO userDetail) {
        this.userDetail = userDetail;
    }
    

}
