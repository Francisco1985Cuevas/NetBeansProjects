/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.entidades;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author francisco
 */
@Entity
@Table(name = "tornillosxcliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tornillosxcliente.findAll", query = "SELECT t FROM Tornillosxcliente t")
    , @NamedQuery(name = "Tornillosxcliente.findByIdtornilloTornillo", query = "SELECT t FROM Tornillosxcliente t WHERE t.tornillosxclientePK.idtornilloTornillo = :idtornilloTornillo")
    , @NamedQuery(name = "Tornillosxcliente.findByIdclienteCliente", query = "SELECT t FROM Tornillosxcliente t WHERE t.tornillosxclientePK.idclienteCliente = :idclienteCliente")})
public class Tornillosxcliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TornillosxclientePK tornillosxclientePK;

    public Tornillosxcliente() {
    }

    public Tornillosxcliente(TornillosxclientePK tornillosxclientePK) {
        this.tornillosxclientePK = tornillosxclientePK;
    }

    public Tornillosxcliente(int idtornilloTornillo, int idclienteCliente) {
        this.tornillosxclientePK = new TornillosxclientePK(idtornilloTornillo, idclienteCliente);
    }

    public TornillosxclientePK getTornillosxclientePK() {
        return tornillosxclientePK;
    }

    public void setTornillosxclientePK(TornillosxclientePK tornillosxclientePK) {
        this.tornillosxclientePK = tornillosxclientePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tornillosxclientePK != null ? tornillosxclientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tornillosxcliente)) {
            return false;
        }
        Tornillosxcliente other = (Tornillosxcliente) object;
        if ((this.tornillosxclientePK == null && other.tornillosxclientePK != null) || (this.tornillosxclientePK != null && !this.tornillosxclientePK.equals(other.tornillosxclientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.py.entidades.Tornillosxcliente[ tornillosxclientePK=" + tornillosxclientePK + " ]";
    }
    
}
