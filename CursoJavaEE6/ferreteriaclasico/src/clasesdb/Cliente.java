/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesdb;

/**
 *
 * @author francisco
 */
public class Cliente {
    private Integer idcliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private String fax;
    private String email;
    private String contacto;

    public Cliente(Integer idcliente, String nombre, String direccion, String telefono, String fax, String email, String contacto) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fax = fax;
        this.email = email;
        this.contacto = contacto;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
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
    
    
    
}
