/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author francisco
 */
@Entity
@Table(name = "sh_dbprueba01.ciudades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ciudades.findAll", query = "SELECT c FROM Ciudades c")
    , @NamedQuery(name = "Ciudades.findById", query = "SELECT c FROM Ciudades c WHERE c.id = :id")
    , @NamedQuery(name = "Ciudades.findByNombre", query = "SELECT c FROM Ciudades c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Ciudades.findByAlias", query = "SELECT c FROM Ciudades c WHERE c.alias = :alias")
    , @NamedQuery(name = "Ciudades.findByAbreviatura", query = "SELECT c FROM Ciudades c WHERE c.abreviatura = :abreviatura")})
public class Ciudades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 60)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 30)
    @Column(name = "alias")
    private String alias;
    @Size(max = 3)
    @Column(name = "abreviatura")
    private String abreviatura;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCiudades")
    private Collection<Personas> personasCollection;
    @JoinColumn(name = "id_paises", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Paises idPaises;

    public Ciudades() {
    }

    public Ciudades(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @XmlTransient
    public Collection<Personas> getPersonasCollection() {
        return personasCollection;
    }

    public void setPersonasCollection(Collection<Personas> personasCollection) {
        this.personasCollection = personasCollection;
    }

    public Paises getIdPaises() {
        return idPaises;
    }

    public void setIdPaises(Paises idPaises) {
        this.idPaises = idPaises;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ciudades)) {
            return false;
        }
        Ciudades other = (Ciudades) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Ciudades[ id=" + id + " ]";
    }
    
}
