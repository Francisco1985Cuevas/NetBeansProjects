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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author francisco
 */
@Entity
@Table(name = "TELEFONO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefono.findAll", query = "SELECT t FROM Telefono t")
    , @NamedQuery(name = "Telefono.findByTelefonoId", query = "SELECT t FROM Telefono t WHERE t.telefonoId = :telefonoId")})
public class Telefono implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TELEFONO_ID")
    private Integer telefonoId;
    @JoinColumn(name = "ALUMNO_ID", referencedColumnName = "ALUMNO_ID")
    @ManyToOne(optional = false)
    private Alumno alumnoId;
    @JoinColumn(name = "TELEFONO_TYPE_ID", referencedColumnName = "TELEFONO_TYPE_ID")
    @ManyToOne(optional = false)
    private TelefonoType telefonoTypeId;

    public Telefono() {
    }

    public Telefono(Integer telefonoId) {
        this.telefonoId = telefonoId;
    }

    public Integer getTelefonoId() {
        return telefonoId;
    }

    public void setTelefonoId(Integer telefonoId) {
        this.telefonoId = telefonoId;
    }

    public Alumno getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(Alumno alumnoId) {
        this.alumnoId = alumnoId;
    }

    public TelefonoType getTelefonoTypeId() {
        return telefonoTypeId;
    }

    public void setTelefonoTypeId(TelefonoType telefonoTypeId) {
        this.telefonoTypeId = telefonoTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (telefonoId != null ? telefonoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefono)) {
            return false;
        }
        Telefono other = (Telefono) object;
        if ((this.telefonoId == null && other.telefonoId != null) || (this.telefonoId != null && !this.telefonoId.equals(other.telefonoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cursojavaee.jpa.Telefono[ telefonoId=" + telefonoId + " ]";
    }
    
}
