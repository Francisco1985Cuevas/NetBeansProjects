/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursojavaee.jpa;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author francisco
 */
@Entity
@Table(name = "TELEFONO_TYPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TelefonoType.findAll", query = "SELECT t FROM TelefonoType t")
    , @NamedQuery(name = "TelefonoType.findByTelefonoTypeId", query = "SELECT t FROM TelefonoType t WHERE t.telefonoTypeId = :telefonoTypeId")
    , @NamedQuery(name = "TelefonoType.findByTelefonoTypeCd", query = "SELECT t FROM TelefonoType t WHERE t.telefonoTypeCd = :telefonoTypeCd")
    , @NamedQuery(name = "TelefonoType.findByTelefonoTypeText", query = "SELECT t FROM TelefonoType t WHERE t.telefonoTypeText = :telefonoTypeText")})
public class TelefonoType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TELEFONO_TYPE_ID")
    private Integer telefonoTypeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TELEFONO_TYPE_CD")
    private String telefonoTypeCd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TELEFONO_TYPE_TEXT")
    private String telefonoTypeText;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "telefonoTypeId")
    private Collection<Telefono> telefonoCollection;

    public TelefonoType() {
    }

    public TelefonoType(Integer telefonoTypeId) {
        this.telefonoTypeId = telefonoTypeId;
    }

    public TelefonoType(Integer telefonoTypeId, String telefonoTypeCd, String telefonoTypeText) {
        this.telefonoTypeId = telefonoTypeId;
        this.telefonoTypeCd = telefonoTypeCd;
        this.telefonoTypeText = telefonoTypeText;
    }

    public Integer getTelefonoTypeId() {
        return telefonoTypeId;
    }

    public void setTelefonoTypeId(Integer telefonoTypeId) {
        this.telefonoTypeId = telefonoTypeId;
    }

    public String getTelefonoTypeCd() {
        return telefonoTypeCd;
    }

    public void setTelefonoTypeCd(String telefonoTypeCd) {
        this.telefonoTypeCd = telefonoTypeCd;
    }

    public String getTelefonoTypeText() {
        return telefonoTypeText;
    }

    public void setTelefonoTypeText(String telefonoTypeText) {
        this.telefonoTypeText = telefonoTypeText;
    }

    @XmlTransient
    public Collection<Telefono> getTelefonoCollection() {
        return telefonoCollection;
    }

    public void setTelefonoCollection(Collection<Telefono> telefonoCollection) {
        this.telefonoCollection = telefonoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (telefonoTypeId != null ? telefonoTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TelefonoType)) {
            return false;
        }
        TelefonoType other = (TelefonoType) object;
        if ((this.telefonoTypeId == null && other.telefonoTypeId != null) || (this.telefonoTypeId != null && !this.telefonoTypeId.equals(other.telefonoTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cursojavaee.jpa.TelefonoType[ telefonoTypeId=" + telefonoTypeId + " ]";
    }
    
}
