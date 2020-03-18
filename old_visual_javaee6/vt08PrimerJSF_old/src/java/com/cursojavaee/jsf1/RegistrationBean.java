/*
 Managed Bean: RegistrationBean
19
 */
package com.cursojavaee.jsf1;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "registrationBean")
@RequestScoped
public class RegistrationBean {
    
    //atriburos
    private String saludo;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private String email;
    
    //metodos
    public RegistrationBean() {
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
