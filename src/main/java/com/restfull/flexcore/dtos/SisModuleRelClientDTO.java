/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.SisModuleRelClient;
import java.math.BigInteger;

/**
 *
 * @author Dario
 */
public class SisModuleRelClientDTO {
    public Integer idModuleRelClient;
    public String domain;
    public String geoLocAltitude;
    public String geoLocLongitude;
    public GeoCountryDTO geoCountry;
    public ClientsDTO clients;
    public SisModulesDTO idModule;
    public SisStatusDTO sisStatus; 

    public Integer getIdModuleRelClient() {
        return idModuleRelClient;
    }

    public void setIdModuleRelClient(Integer idModuleRelClient) {
        this.idModuleRelClient = idModuleRelClient;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
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

    public GeoCountryDTO getGeoCountry() {
        return geoCountry;
    }

    public void setGeoCountry(GeoCountryDTO geoCountry) {
        this.geoCountry = geoCountry;
    }

    public ClientsDTO getClients() {
        return clients;
    }

    public void setClients(ClientsDTO clients) {
        this.clients = clients;
    }

    public SisModulesDTO getIdModule() {
        return idModule;
    }

    public void setIdModule(SisModulesDTO idModule) {
        this.idModule = idModule;
    }

    public SisStatusDTO getSisStatus() {
        return sisStatus;
    }

    public void setSisStatus(SisStatusDTO sisStatus) {
        this.sisStatus = sisStatus;
    }
    
    
  
    

}
