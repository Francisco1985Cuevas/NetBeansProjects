package com.cursojavaee.controller;

import com.cursojavaee.model.Cliente;
import com.cursojavaee.model.ClientePremium;
import com.cursojavaee.qualifiers.Premium;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.jboss.logging.Logger;
import org.jboss.logging.Logger.Level;

@Named
@RequestScoped
public class ClientePremiumController {

    private static final Logger logger = Logger.getLogger(
            ClientePremiumController.class.getName());

    @Inject
    @Premium
    private Cliente cliente;

    public String salvarCliente() {
        ClientePremium clientePremium = (ClientePremium) cliente;
        logger.log(Level.INFO, "Salvando la siguiente informacion \n"
                + "{0}, {1}, codigo descuento = {2}",
                new Object[]{clientePremium.getNombre(),
                    clientePremium.getPrimerApellido(),
                    clientePremium.getCodigoDescuento()
                });
        return "cliente_premium_confirmacion";
    }

}
