/*
 Entidad JPA: Direccion.java
 */
package com.cursojavaee.model;

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


@Entity
@Table(name = "DIRECCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direccion.findAll", query = "SELECT d FROM Direccion d")
    , @NamedQuery(name = "Direccion.findByIddireccion", query = "SELECT d FROM Direccion d WHERE d.iddireccion = :iddireccion")
    , @NamedQuery(name = "Direccion.findByTextodireccion", query = "SELECT d FROM Direccion d WHERE d.textodireccion = :textodireccion")})
public class Direccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDIRECCION")
    private Integer iddireccion;
    @Size(max = 255)
    @Column(name = "TEXTODIRECCION")
    private String textodireccion;
    @JoinColumn(name = "IDALUMNO", referencedColumnName = "IDALUMNO")
    @ManyToOne(optional = false)
    private Alumno idalumno;
    @JoinColumn(name = "IDDIRECCIONTIPO", referencedColumnName = "IDDIRECCIONTIPO")
    @ManyToOne(optional = false)
    private Direcciontipo iddirecciontipo;

    public Direccion() {
    }

    public Direccion(Integer iddireccion) {
        this.iddireccion = iddireccion;
    }

    public Integer getIddireccion() {
        return iddireccion;
    }

    public void setIddireccion(Integer iddireccion) {
        this.iddireccion = iddireccion;
    }

    public String getTextodireccion() {
        return textodireccion;
    }

    public void setTextodireccion(String textodireccion) {
        this.textodireccion = textodireccion;
    }

    public Alumno getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(Alumno idalumno) {
        this.idalumno = idalumno;
    }

    public Direcciontipo getIddirecciontipo() {
        return iddirecciontipo;
    }

    public void setIddirecciontipo(Direcciontipo iddirecciontipo) {
        this.iddirecciontipo = iddirecciontipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddireccion != null ? iddireccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccion)) {
            return false;
        }
        Direccion other = (Direccion) object;
        if ((this.iddireccion == null && other.iddireccion != null) || (this.iddireccion != null && !this.iddireccion.equals(other.iddireccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cursojavaee.model.Direccion[ iddireccion=" + iddireccion + " ]";
    }
    
}
