/*
 * JSF Managed Beans
 */
package com.francisco.models;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "saludo")
@RequestScoped
public class Saludo {
    
    private String texto = "Hola te saludo desde el Managed Beans con Ñandu";
    

    /**
     * Creates a new instance of Saludo
     */
    public Saludo() {
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    
}
