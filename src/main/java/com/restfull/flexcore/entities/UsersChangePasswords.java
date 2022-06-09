/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dario
 */
@Entity
@Table(name = "users_change_passwords")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsersChangePasswords.findAll", query = "SELECT u FROM UsersChangePasswords u"),
    @NamedQuery(name = "UsersChangePasswords.findByIdChangePasswords", query = "SELECT u FROM UsersChangePasswords u WHERE u.idChangePasswords = :idChangePasswords"),
    @NamedQuery(name = "UsersChangePasswords.findByHashId", query = "SELECT u FROM UsersChangePasswords u WHERE u.hashId = :hashId"),
    @NamedQuery(name = "UsersChangePasswords.findByDateExpired", query = "SELECT u FROM UsersChangePasswords u WHERE u.dateExpired = :dateExpired"),
    @NamedQuery(name = "UsersChangePasswords.findByDateOrder", query = "SELECT u FROM UsersChangePasswords u WHERE u.dateOrder = :dateOrder"),
    @NamedQuery(name = "UsersChangePasswords.findByUsed", query = "SELECT u FROM UsersChangePasswords u WHERE u.used = :used")})
public class UsersChangePasswords implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_change_passwords")
    private Integer idChangePasswords;
    @Basic(optional = false)
    @Column(name = "hashId")
    private String hashId;
    @Column(name = "dateExpired")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateExpired;
    @Column(name = "dateOrder")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOrder;
    @Column(name = "used")
    private Boolean used;
    @JoinColumn(name = "id_platform", referencedColumnName = "id_platform")
    @ManyToOne(fetch = FetchType.LAZY)
    private Platforms idPlatform;
    @JoinColumn(name = "id_module", referencedColumnName = "id_module")
    @ManyToOne(fetch = FetchType.LAZY)
    private SisModules idModule;
    @JoinColumn(name = "status", referencedColumnName = "id_status")
    @ManyToOne(fetch = FetchType.LAZY)
    private SisStatus status;
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users idUser;

    public UsersChangePasswords() {
    }

    public UsersChangePasswords(Integer idChangePasswords) {
        this.idChangePasswords = idChangePasswords;
    }

    public UsersChangePasswords(Integer idChangePasswords, String hashId) {
        this.idChangePasswords = idChangePasswords;
        this.hashId = hashId;
    }

    public Integer getIdChangePasswords() {
        return idChangePasswords;
    }

    public void setIdChangePasswords(Integer idChangePasswords) {
        this.idChangePasswords = idChangePasswords;
    }

    public String getHashId() {
        return hashId;
    }

    public void setHashId(String hashId) {
        this.hashId = hashId;
    }

    public Date getDateExpired() {
        return dateExpired;
    }

    public void setDateExpired(Date dateExpired) {
        this.dateExpired = dateExpired;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public Platforms getIdPlatform() {
        return idPlatform;
    }

    public void setIdPlatform(Platforms idPlatform) {
        this.idPlatform = idPlatform;
    }

    public SisModules getIdModule() {
        return idModule;
    }

    public void setIdModule(SisModules idModule) {
        this.idModule = idModule;
    }

    public SisStatus getStatus() {
        return status;
    }

    public void setStatus(SisStatus status) {
        this.status = status;
    }

    public Users getIdUser() {
        return idUser;
    }

    public void setIdUser(Users idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idChangePasswords != null ? idChangePasswords.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersChangePasswords)) {
            return false;
        }
        UsersChangePasswords other = (UsersChangePasswords) object;
        if ((this.idChangePasswords == null && other.idChangePasswords != null) || (this.idChangePasswords != null && !this.idChangePasswords.equals(other.idChangePasswords))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.restfull.flexcore.entities.UsersChangePasswords[ idChangePasswords=" + idChangePasswords + " ]";
    }
    
}
