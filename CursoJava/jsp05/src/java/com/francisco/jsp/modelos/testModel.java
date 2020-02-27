//EJB, un EJB no es mas que una clase que nos va a permitir
//enviar datos hacia el Controlador(Servlet) y ese Controlador
//a su vez va a mostrar esa informacion, que nosotros le enviamos
//desde el EJB en la vista(.jsp)

//PROCESO DE CARGA DE BASE DE DATOS, AQUI...

package com.francisco.jsp.modelos;

import javax.ejb.Stateless;


@Stateless
public class testModel {
    private String nombre;
    private String correo;
    private String pais;
    private String sexo;

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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
