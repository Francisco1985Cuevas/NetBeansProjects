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
@Table(name = "ORDER_ITEM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderItem.findAll", query = "SELECT o FROM OrderItem o")
    , @NamedQuery(name = "OrderItem.findByAlumnoOrder", query = "SELECT o FROM OrderItem o WHERE o.alumnoOrder = :alumnoOrder")})
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ALUMNO_ORDER")
    private Integer alumnoOrder;
    @JoinColumn(name = "ALUMNO_ORDER_ID", referencedColumnName = "ALUMNO_ORDER_ID")
    @ManyToOne(optional = false)
    private AlumnoOrder alumnoOrderId;
    @JoinColumn(name = "ITEM_ID", referencedColumnName = "ITEM_ID")
    @ManyToOne(optional = false)
    private Item itemId;

    public OrderItem() {
    }

    public OrderItem(Integer alumnoOrder) {
        this.alumnoOrder = alumnoOrder;
    }

    public Integer getAlumnoOrder() {
        return alumnoOrder;
    }

    public void setAlumnoOrder(Integer alumnoOrder) {
        this.alumnoOrder = alumnoOrder;
    }

    public AlumnoOrder getAlumnoOrderId() {
        return alumnoOrderId;
    }

    public void setAlumnoOrderId(AlumnoOrder alumnoOrderId) {
        this.alumnoOrderId = alumnoOrderId;
    }

    public Item getItemId() {
        return itemId;
    }

    public void setItemId(Item itemId) {
        this.itemId = itemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alumnoOrder != null ? alumnoOrder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderItem)) {
            return false;
        }
        OrderItem other = (OrderItem) object;
        if ((this.alumnoOrder == null && other.alumnoOrder != null) || (this.alumnoOrder != null && !this.alumnoOrder.equals(other.alumnoOrder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cursojavaee.jpa.OrderItem[ alumnoOrder=" + alumnoOrder + " ]";
    }
    
}
