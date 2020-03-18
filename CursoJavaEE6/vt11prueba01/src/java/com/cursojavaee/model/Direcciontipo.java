/*
 Entidad JPA: Direcciontipo.java
 */
package com.cursojavaee.model;

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


@Entity
@Table(name = "DIRECCIONTIPO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direcciontipo.findAll", query = "SELECT d FROM Direcciontipo d")
    , @NamedQuery(name = "Direcciontipo.findByIddirecciontipo", query = "SELECT d FROM Direcciontipo d WHERE d.iddirecciontipo = :iddirecciontipo")
    , @NamedQuery(name = "Direcciontipo.findByCodigotipodireccion", query = "SELECT d FROM Direcciontipo d WHERE d.codigotipodireccion = :codigotipodireccion")
    , @NamedQuery(name = "Direcciontipo.findByTextotipodireccion", query = "SELECT d FROM Direcciontipo d WHERE d.textotipodireccion = :textotipodireccion")})
public class Direcciontipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDIRECCIONTIPO")
    private Integer iddirecciontipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "CODIGOTIPODIRECCION")
    private String codigotipodireccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TEXTOTIPODIRECCION")
    private String textotipodireccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddirecciontipo")
    private Collection<Direccion> direccionCollection;

    public Direcciontipo() {
    }

    public Direcciontipo(Integer iddirecciontipo) {
        this.iddirecciontipo = iddirecciontipo;
    }

    public Direcciontipo(Integer iddirecciontipo, String codigotipodireccion, String textotipodireccion) {
        this.iddirecciontipo = iddirecciontipo;
        this.codigotipodireccion = codigotipodireccion;
        this.textotipodireccion = textotipodireccion;
    }

    public Integer getIddirecciontipo() {
        return iddirecciontipo;
    }

    public void setIddirecciontipo(Integer iddirecciontipo) {
        this.iddirecciontipo = iddirecciontipo;
    }

    public String getCodigotipodireccion() {
        return codigotipodireccion;
    }

    public void setCodigotipodireccion(String codigotipodireccion) {
        this.codigotipodireccion = codigotipodireccion;
    }

    public String getTextotipodireccion() {
        return textotipodireccion;
    }

    public void setTextotipodireccion(String textotipodireccion) {
        this.textotipodireccion = textotipodireccion;
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
        hash += (iddirecciontipo != null ? iddirecciontipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direcciontipo)) {
            return false;
        }
        Direcciontipo other = (Direcciontipo) object;
        if ((this.iddirecciontipo == null && other.iddirecciontipo != null) || (this.iddirecciontipo != null && !this.iddirecciontipo.equals(other.iddirecciontipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cursojavaee.model.Direcciontipo[ iddirecciontipo=" + iddirecciontipo + " ]";
    }
    
}
