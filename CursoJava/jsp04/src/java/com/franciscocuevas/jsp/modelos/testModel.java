/*
    Enterprise Java Bean(EJB): testModel.java
*/
//Este es mi Enterprise Java Bean (EJB), osea mi Modelo: testModel.java


package com.franciscocuevas.jsp.modelos;

import javax.ejb.Stateless;

@Stateless
public class testModel {
    private String nombre;
    private String correo;
    
    //public testModel(String nombre, String correo) {
    //    this.nombre = "Pedro Ñandu";
    //    this.correo = "yo@correo.com";
    //}
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
