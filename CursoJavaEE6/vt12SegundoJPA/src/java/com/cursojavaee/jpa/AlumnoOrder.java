/*
 Entity JPA: AlumnoOrder.java
 */
package com.cursojavaee.jpa;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author francisco
 */
@Entity
@Table(name = "ALUMNO_ORDER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlumnoOrder.findAll", query = "SELECT a FROM AlumnoOrder a")
    , @NamedQuery(name = "AlumnoOrder.findByAlumnoOrderId", query = "SELECT a FROM AlumnoOrder a WHERE a.alumnoOrderId = :alumnoOrderId")
    , @NamedQuery(name = "AlumnoOrder.findByOrderNumero", query = "SELECT a FROM AlumnoOrder a WHERE a.orderNumero = :orderNumero")
    , @NamedQuery(name = "AlumnoOrder.findByOrderDescription", query = "SELECT a FROM AlumnoOrder a WHERE a.orderDescription = :orderDescription")})
public class AlumnoOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ALUMNO_ORDER_ID")
    private Integer alumnoOrderId;
    @Size(max = 255)
    @Column(name = "ORDER_NUMERO")
    private String orderNumero;
    @Size(max = 255)
    @Column(name = "ORDER_DESCRIPTION")
    private String orderDescription;
    @JoinColumn(name = "ALUMNO_ID", referencedColumnName = "ALUMNO_ID")
    @ManyToOne(optional = false)
    private Alumno alumnoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alumnoOrderId")
    private Collection<OrderItem> orderItemCollection;

    public AlumnoOrder() {
    }

    public AlumnoOrder(Integer alumnoOrderId) {
        this.alumnoOrderId = alumnoOrderId;
    }

    public Integer getAlumnoOrderId() {
        return alumnoOrderId;
    }

    public void setAlumnoOrderId(Integer alumnoOrderId) {
        this.alumnoOrderId = alumnoOrderId;
    }

    public String getOrderNumero() {
        return orderNumero;
    }

    public void setOrderNumero(String orderNumero) {
        this.orderNumero = orderNumero;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public Alumno getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(Alumno alumnoId) {
        this.alumnoId = alumnoId;
    }

    @XmlTransient
    public Collection<OrderItem> getOrderItemCollection() {
        return orderItemCollection;
    }

    public void setOrderItemCollection(Collection<OrderItem> orderItemCollection) {
        this.orderItemCollection = orderItemCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alumnoOrderId != null ? alumnoOrderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlumnoOrder)) {
            return false;
        }
        AlumnoOrder other = (AlumnoOrder) object;
        if ((this.alumnoOrderId == null && other.alumnoOrderId != null) || (this.alumnoOrderId != null && !this.alumnoOrderId.equals(other.alumnoOrderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cursojavaee.jpa.AlumnoOrder[ alumnoOrderId=" + alumnoOrderId + " ]";
    }
    
}
