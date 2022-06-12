/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.GeoStates;
import java.math.BigInteger;

/**
 *
 * @author Dario
 */
public class GeoStatesDTO {
    public Integer idStates;
    public String name;
    public String iso;
    public Integer postalCode;
    public String geoLocAltitude;
    public String geoLocLongitude;
    public GeoCitysDTO citys;
    public GeoStatesDTO geoStates;
    public GeoCountryDTO geoCountry;
    public SisStatusDTO sisStatus; 

    public Integer getIdStates() {
        return idStates;
    }

    public void setIdStates(Integer idStates) {
        this.idStates = idStates;
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

    public GeoCitysDTO getCitys() {
        return citys;
    }

    public void setCitys(GeoCitysDTO citys) {
        this.citys = citys;
    }

    public GeoStatesDTO getGeoStates() {
        return geoStates;
    }

    public void setGeoStates(GeoStatesDTO geoStates) {
        this.geoStates = geoStates;
    }

    public GeoCountryDTO getGeoCountry() {
        return geoCountry;
    }

    public void setGeoCountry(GeoCountryDTO geoCountry) {
        this.geoCountry = geoCountry;
    }

    public SisStatusDTO getSisStatus() {
        return sisStatus;
    }

    public void setSisStatus(SisStatusDTO sisStatus) {
        this.sisStatus = sisStatus;
    }
  
    

}
