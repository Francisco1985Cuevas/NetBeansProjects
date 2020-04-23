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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author francisco
 */
@Entity
@Table(name = "tornillo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tornillo.findAll", query = "SELECT t FROM Tornillo t")
    , @NamedQuery(name = "Tornillo.findByIdtornillo", query = "SELECT t FROM Tornillo t WHERE t.idtornillo = :idtornillo")
    , @NamedQuery(name = "Tornillo.findByCabeza", query = "SELECT t FROM Tornillo t WHERE t.cabeza = :cabeza")
    , @NamedQuery(name = "Tornillo.findByCuello", query = "SELECT t FROM Tornillo t WHERE t.cuello = :cuello")
    , @NamedQuery(name = "Tornillo.findByDiametro", query = "SELECT t FROM Tornillo t WHERE t.diametro = :diametro")
    , @NamedQuery(name = "Tornillo.findByTiporosca", query = "SELECT t FROM Tornillo t WHERE t.tiporosca = :tiporosca")
    , @NamedQuery(name = "Tornillo.findByPaso", query = "SELECT t FROM Tornillo t WHERE t.paso = :paso")
    , @NamedQuery(name = "Tornillo.findByLongitud", query = "SELECT t FROM Tornillo t WHERE t.longitud = :longitud")
    , @NamedQuery(name = "Tornillo.findByIdfabricanteFabricante", query = "SELECT t FROM Tornillo t WHERE t.idfabricanteFabricante = :idfabricanteFabricante")
    , @NamedQuery(name = "Tornillo.findByCodigo", query = "SELECT t FROM Tornillo t WHERE t.codigo = :codigo")})
public class Tornillo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtornillo")
    private Integer idtornillo;
    @Size(max = 50)
    @Column(name = "cabeza")
    private String cabeza;
    @Column(name = "cuello")
    private Integer cuello;
    @Column(name = "diametro")
    private Integer diametro;
    @Size(max = 75)
    @Column(name = "tiporosca")
    private String tiporosca;
    @Column(name = "paso")
    private Short paso;
    @Column(name = "longitud")
    private Integer longitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfabricante_fabricante")
    private int idfabricanteFabricante;
    @Size(max = 10)
    @Column(name = "codigo")
    private String codigo;

    public Tornillo() {
    }

    public Tornillo(Integer idtornillo) {
        this.idtornillo = idtornillo;
    }

    public Tornillo(Integer idtornillo, int idfabricanteFabricante) {
        this.idtornillo = idtornillo;
        this.idfabricanteFabricante = idfabricanteFabricante;
    }

    public Integer getIdtornillo() {
        return idtornillo;
    }

    public void setIdtornillo(Integer idtornillo) {
        this.idtornillo = idtornillo;
    }

    public String getCabeza() {
        return cabeza;
    }

    public void setCabeza(String cabeza) {
        this.cabeza = cabeza;
    }

    public Integer getCuello() {
        return cuello;
    }

    public void setCuello(Integer cuello) {
        this.cuello = cuello;
    }

    public Integer getDiametro() {
        return diametro;
    }

    public void setDiametro(Integer diametro) {
        this.diametro = diametro;
    }

    public String getTiporosca() {
        return tiporosca;
    }

    public void setTiporosca(String tiporosca) {
        this.tiporosca = tiporosca;
    }

    public Short getPaso() {
        return paso;
    }

    public void setPaso(Short paso) {
        this.paso = paso;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public int getIdfabricanteFabricante() {
        return idfabricanteFabricante;
    }

    public void setIdfabricanteFabricante(int idfabricanteFabricante) {
        this.idfabricanteFabricante = idfabricanteFabricante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtornillo != null ? idtornillo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tornillo)) {
            return false;
        }
        Tornillo other = (Tornillo) object;
        if ((this.idtornillo == null && other.idtornillo != null) || (this.idtornillo != null && !this.idtornillo.equals(other.idtornillo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.py.entidades.Tornillo[ idtornillo=" + idtornillo + " ]";
    }
    
}
