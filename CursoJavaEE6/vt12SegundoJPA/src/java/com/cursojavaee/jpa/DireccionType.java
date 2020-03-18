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
@Table(name = "DIRECCION_TYPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DireccionType.findAll", query = "SELECT d FROM DireccionType d")
    , @NamedQuery(name = "DireccionType.findByDireccionTypeId", query = "SELECT d FROM DireccionType d WHERE d.direccionTypeId = :direccionTypeId")
    , @NamedQuery(name = "DireccionType.findByDireccionTypeCode", query = "SELECT d FROM DireccionType d WHERE d.direccionTypeCode = :direccionTypeCode")
    , @NamedQuery(name = "DireccionType.findByDireccionTypeText", query = "SELECT d FROM DireccionType d WHERE d.direccionTypeText = :direccionTypeText")})
public class DireccionType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DIRECCION_TYPE_ID")
    private Integer direccionTypeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "DIRECCION_TYPE_CODE")
    private String direccionTypeCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "DIRECCION_TYPE_TEXT")
    private String direccionTypeText;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "direccionTypeId")
    private Collection<Direccion> direccionCollection;

    public DireccionType() {
    }

    public DireccionType(Integer direccionTypeId) {
        this.direccionTypeId = direccionTypeId;
    }

    public DireccionType(Integer direccionTypeId, String direccionTypeCode, String direccionTypeText) {
        this.direccionTypeId = direccionTypeId;
        this.direccionTypeCode = direccionTypeCode;
        this.direccionTypeText = direccionTypeText;
    }

    public Integer getDireccionTypeId() {
        return direccionTypeId;
    }

    public void setDireccionTypeId(Integer direccionTypeId) {
        this.direccionTypeId = direccionTypeId;
    }

    public String getDireccionTypeCode() {
        return direccionTypeCode;
    }

    public void setDireccionTypeCode(String direccionTypeCode) {
        this.direccionTypeCode = direccionTypeCode;
    }

    public String getDireccionTypeText() {
        return direccionTypeText;
    }

    public void setDireccionTypeText(String direccionTypeText) {
        this.direccionTypeText = direccionTypeText;
    }

    @XmlTransient
    public Collection<Direccion> getDireccionCollection() {
        return direccionCollection;
    }

    public void setDireccionCollection(Collection<Direccion> direccionCollection) {
        this.direccionCollection = direccionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (direccionTypeId != null ? direccionTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DireccionType)) {
            return false;
        }
        DireccionType other = (DireccionType) object;
        if ((this.direccionTypeId == null && other.direccionTypeId != null) || (this.direccionTypeId != null && !this.direccionTypeId.equals(other.direccionTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cursojavaee.jpa.DireccionType[ direccionTypeId=" + direccionTypeId + " ]";
    }
    
}
