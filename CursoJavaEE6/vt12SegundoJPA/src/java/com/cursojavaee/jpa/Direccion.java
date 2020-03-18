/*
 Entity JPA: Direccion.java
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
@Table(name = "DIRECCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direccion.findAll", query = "SELECT d FROM Direccion d")
    , @NamedQuery(name = "Direccion.findByDireccionId", query = "SELECT d FROM Direccion d WHERE d.direccionId = :direccionId")})
public class Direccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DIRECCION_ID")
    private Integer direccionId;
    @JoinColumn(name = "ALUMNO_ID", referencedColumnName = "ALUMNO_ID")
    @ManyToOne(optional = false)
    private Alumno alumnoId;
    @JoinColumn(name = "DIRECCION_TYPE_ID", referencedColumnName = "DIRECCION_TYPE_ID")
    @ManyToOne(optional = false)
    private DireccionType direccionTypeId;

    public Direccion() {
    }

    public Direccion(Integer direccionId) {
        this.direccionId = direccionId;
    }

    public Integer getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(Integer direccionId) {
        this.direccionId = direccionId;
    }

    public Alumno getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(Alumno alumnoId) {
        this.alumnoId = alumnoId;
    }

    public DireccionType getDireccionTypeId() {
        return direccionTypeId;
    }

    public void setDireccionTypeId(DireccionType direccionTypeId) {
        this.direccionTypeId = direccionTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (direccionId != null ? direccionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccion)) {
            return false;
        }
        Direccion other = (Direccion) object;
        if ((this.direccionId == null && other.direccionId != null) || (this.direccionId != null && !this.direccionId.equals(other.direccionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cursojavaee.jpa.Direccion[ direccionId=" + direccionId + " ]";
    }
    
}
