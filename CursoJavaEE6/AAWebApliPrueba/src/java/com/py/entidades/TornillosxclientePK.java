/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author francisco
 */
@Embeddable
public class TornillosxclientePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idtornillo_tornillo")
    private int idtornilloTornillo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcliente_cliente")
    private int idclienteCliente;

    public TornillosxclientePK() {
    }

    public TornillosxclientePK(int idtornilloTornillo, int idclienteCliente) {
        this.idtornilloTornillo = idtornilloTornillo;
        this.idclienteCliente = idclienteCliente;
    }

    public int getIdtornilloTornillo() {
        return idtornilloTornillo;
    }

    public void setIdtornilloTornillo(int idtornilloTornillo) {
        this.idtornilloTornillo = idtornilloTornillo;
    }

    public int getIdclienteCliente() {
        return idclienteCliente;
    }

    public void setIdclienteCliente(int idclienteCliente) {
        this.idclienteCliente = idclienteCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idtornilloTornillo;
        hash += (int) idclienteCliente;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TornillosxclientePK)) {
            return false;
        }
        TornillosxclientePK other = (TornillosxclientePK) object;
        if (this.idtornilloTornillo != other.idtornilloTornillo) {
            return false;
        }
        if (this.idclienteCliente != other.idclienteCliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.py.entidades.TornillosxclientePK[ idtornilloTornillo=" + idtornilloTornillo + ", idclienteCliente=" + idclienteCliente + " ]";
    }
    
}
