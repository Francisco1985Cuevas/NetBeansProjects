/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author francisco
 */
@Entity
@Table(name = "fabricante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fabricante.findAll", query = "SELECT f FROM Fabricante f")
    , @NamedQuery(name = "Fabricante.findByIdfabricante", query = "SELECT f FROM Fabricante f WHERE f.idfabricante = :idfabricante")
    , @NamedQuery(name = "Fabricante.findByNombre", query = "SELECT f FROM Fabricante f WHERE f.nombre = :nombre")
    , @NamedQuery(name = "Fabricante.findByDireccion", query = "SELECT f FROM Fabricante f WHERE f.direccion = :direccion")
    , @NamedQuery(name = "Fabricante.findByTelefono", query = "SELECT f FROM Fabricante f WHERE f.telefono = :telefono")
    , @NamedQuery(name = "Fabricante.findByFax", query = "SELECT f FROM Fabricante f WHERE f.fax = :fax")
    , @NamedQuery(name = "Fabricante.findByEmail", query = "SELECT f FROM Fabricante f WHERE f.email = :email")
    , @NamedQuery(name = "Fabricante.findByContacto", query = "SELECT f FROM Fabricante f WHERE f.contacto = :contacto")})
public class Fabricante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfabricante")
    private Integer idfabricante;
    @Size(max = 150)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 300)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 9)
    @Column(name = "telefono")
    private String telefono;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 9)
    @Column(name = "fax")
    private String fax;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 150)
    @Column(name = "email")
    private String email;
    @Size(max = 150)
    @Column(name = "contacto")
    private String contacto;

    public Fabricante() {
    }

    public Fabricante(Integer idfabricante) {
        this.idfabricante = idfabricante;
    }

    public Integer getIdfabricante() {
        return idfabricante;
    }

    public void setIdfabricante(Integer idfabricante) {
        this.idfabricante = idfabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfabricante != null ? idfabricante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fabricante)) {
            return false;
        }
        Fabricante other = (Fabricante) object;
        if ((this.idfabricante == null && other.idfabricante != null) || (this.idfabricante != null && !this.idfabricante.equals(other.idfabricante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.py.entidades.Fabricante[ idfabricante=" + idfabricante + " ]";
    }
    
}
