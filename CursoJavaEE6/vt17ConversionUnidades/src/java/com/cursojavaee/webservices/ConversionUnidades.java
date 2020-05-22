/*
 Web Service: ConversionUnidades

Nuestro Servicio Web ha sido creado. 
*/
package com.cursojavaee.webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/*La Anotacion: @WebService es la que marca nuestra Clase 
como un Servicio Web.*/
@WebService(serviceName = "ConversionUnidades")
public class ConversionUnidades {

    /**
     * This is a sample web service operation
     * 
     * La Anotacion: @WebMethod es la que marca el metodo 
     * que este Anotado como una operación de Web 
     * Service(Servicio Web)
     */
    
    @WebMethod(operationName = "pulgadasACentimetros")
    public double pulgadasACentimetros(@WebParam(name = "pulgadas") double pulgadas) {
        //incluimos nuestra Logica propia en el metodo
        return pulgadas * 2.54;
    }
    
    
    @WebMethod(operationName = "centimetrosAPulgadas")
    public double centimetrosAPulgadas(@WebParam(name = "centimetros") double centimetros) {
        return centimetros / 2.54;
    }
    
}
