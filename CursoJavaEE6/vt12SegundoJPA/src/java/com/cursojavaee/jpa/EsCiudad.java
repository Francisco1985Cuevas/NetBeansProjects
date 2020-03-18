/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursojavaee.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author francisco
 */
@Entity
@Table(name = "ES_CIUDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EsCiudad.findAll", query = "SELECT e FROM EsCiudad e")
    , @NamedQuery(name = "EsCiudad.findByEsCiudadId", query = "SELECT e FROM EsCiudad e WHERE e.esCiudadId = :esCiudadId")
    , @NamedQuery(name = "EsCiudad.findByEsCiudadNm", query = "SELECT e FROM EsCiudad e WHERE e.esCiudadNm = :esCiudadNm")
    , @NamedQuery(name = "EsCiudad.findByCp", query = "SELECT e FROM EsCiudad e WHERE e.cp = :cp")})
public class EsCiudad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ES_CIUDAD_ID")
    private Integer esCiudadId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ES_CIUDAD_NM")
    private String esCiudadNm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "CP")
    private String cp;
    @JoinColumn(name = "ES_PROV_ID", referencedColumnName = "ES_PROV_ID")
    @ManyToOne(optional = false)
    private EsProv esProvId;

    public EsCiudad() {
    }

    public EsCiudad(Integer esCiudadId) {
        this.esCiudadId = esCiudadId;
    }

    public EsCiudad(Integer esCiudadId, String esCiudadNm, String cp) {
        this.esCiudadId = esCiudadId;
        this.esCiudadNm = esCiudadNm;
        this.cp = cp;
    }

    public Integer getEsCiudadId() {
        return esCiudadId;
    }

    public void setEsCiudadId(Integer esCiudadId) {
        this.esCiudadId = esCiudadId;
    }

    public String getEsCiudadNm() {
        return esCiudadNm;
    }

    public void setEsCiudadNm(String esCiudadNm) {
        this.esCiudadNm = esCiudadNm;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public EsProv getEsProvId() {
        return esProvId;
    }

    public void setEsProvId(EsProv esProvId) {
        this.esProvId = esProvId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (esCiudadId != null ? esCiudadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EsCiudad)) {
            return false;
        }
        EsCiudad other = (EsCiudad) object;
        if ((this.esCiudadId == null && other.esCiudadId != null) || (this.esCiudadId != null && !this.esCiudadId.equals(other.esCiudadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cursojavaee.jpa.EsCiudad[ esCiudadId=" + esCiudadId + " ]";
    }
    
}
