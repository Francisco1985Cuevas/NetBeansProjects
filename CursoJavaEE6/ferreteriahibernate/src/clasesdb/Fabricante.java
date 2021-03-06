package clasesdb;
// Generated 18/04/2020 03:22:18 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Fabricante generated by hbm2java
 */
public class Fabricante  implements java.io.Serializable {


     private int idfabricante;
     private String nombre;
     private String direccion;
     private String telefono;
     private String fax;
     private String email;
     private String contacto;
     private Set<Tornillo> tornillos = new HashSet<Tornillo>(0);

    public Fabricante() {
    }

	
    public Fabricante(int idfabricante) {
        this.idfabricante = idfabricante;
    }
    public Fabricante(int idfabricante, String nombre, String direccion, String telefono, String fax, String email, String contacto, Set<Tornillo> tornillos) {
       this.idfabricante = idfabricante;
       this.nombre = nombre;
       this.direccion = direccion;
       this.telefono = telefono;
       this.fax = fax;
       this.email = email;
       this.contacto = contacto;
       this.tornillos = tornillos;
    }
   
    public int getIdfabricante() {
        return this.idfabricante;
    }
    
    public void setIdfabricante(int idfabricante) {
        this.idfabricante = idfabricante;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContacto() {
        return this.contacto;
    }
    
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    public Set<Tornillo> getTornillos() {
        return this.tornillos;
    }
    
    public void setTornillos(Set<Tornillo> tornillos) {
        this.tornillos = tornillos;
    }




}


