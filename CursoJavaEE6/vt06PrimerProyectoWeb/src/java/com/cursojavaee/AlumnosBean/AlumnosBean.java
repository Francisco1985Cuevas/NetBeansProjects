/*
javaBean: AlumnosBean
 */
package com.cursojavaee.AlumnosBean;


public class AlumnosBean {
    
    private String nombre;
    private String apellidos;

    public AlumnosBean() {
    }

    public AlumnosBean(String nombre, String apellidos) {
        //this.nombre = nombre;
        //this.apellidos = apellidos;
        setNombre(nombre);
        setApellidos(apellidos);
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
    
    
    
    

}
