/*
@Named Bean: Controller.java
*/
package com.cursojavaee.controller;

import com.cursojavaee.model.Cliente;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class Controller {
    
    //instancia de la Clase Cliente
    @Inject
    private Cliente cliente;
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public String navegarAConfirmacion(){
        //este metodo es invocado cuando el usuario pulsa en 
        //enviar datos del formulario(index.xhtml).
        
        //en una aplicacion real, deberiamos salvar los
        //nuevos clientes a la base de datos aqui.
        return "confirmacion";
    }
    
}
