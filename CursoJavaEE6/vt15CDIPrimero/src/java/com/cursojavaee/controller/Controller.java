
package com.cursojavaee.controller;

import com.cursojavaee.model.Cliente;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class Controller {
    
    @Inject
    private Cliente cliente;
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public String navegarAConfirmacion(){
        //en una aplicacion real, deberiamos salvar los
        //nuevos clientes a la base de datos aqui.
        return "confirmacion";
    }
    
}
