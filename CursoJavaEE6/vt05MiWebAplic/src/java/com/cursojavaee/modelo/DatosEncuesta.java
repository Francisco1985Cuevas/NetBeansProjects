/*
 * JavaBean(Model): DatosEncuesta
 * 
 * Incluimos este JavaBean que es, el que el Servlet tendra que
    instanciar... y aqui(JavaBean) estan los valores que se pasan
    como parametros(desde el formulario) en la HTTP Request, estos 
    parametros ahora seran almacenados... se poblara este JavaBean 
    con ellos y posteriormente se accedera a ellos a traves de este 
    JavaBean.

 */
package com.cursojavaee.modelo;


public class DatosEncuesta {
    
    private String nombreCompleto;
    private String[] progLeng;
    
    
    //metodos Setters & Getters que le permiten al Servlet 
    //acceder a los datos.
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String[] getProgLeng() {
        return progLeng;
    }

    public void setProgLeng(String[] progLeng) {
        this.progLeng = progLeng;
    }
    
    
}
