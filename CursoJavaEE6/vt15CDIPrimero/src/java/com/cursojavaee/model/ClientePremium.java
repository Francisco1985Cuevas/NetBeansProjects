
package com.cursojavaee.model;

import com.cursojavaee.qualifiers.Premium;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
@Premium
public class ClientePremium extends Cliente {
    
    private Integer codigoDescuento;

    public Integer getCodigoDescuento() {
        return codigoDescuento;
    }

    public void setCodigoDescuento(Integer codigoDescuento) {
        this.codigoDescuento = codigoDescuento;
    }
    
    
    
}
