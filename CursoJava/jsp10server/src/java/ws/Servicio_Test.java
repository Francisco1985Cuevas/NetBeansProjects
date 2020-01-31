/*implementacion de nuestra clase, que va a ser utilizada
como Web Service*/

package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


//esta notacion es muy importante porque es el nombre
//que va a tener nuestro Web Service, entoces cuando
//lo busquemos desde una clase "cliente", lo vamos a 
//llamar a traves de este nombre.
@WebService(serviceName = "Servicio_Test")



public class Servicio_Test {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getEjemplo")
    public String getEjemplo(@WebParam(name = "texto1") String texto1, @WebParam(name = "texto2") String texto2) {
        
        return "texto1= "+texto1+"<br>texto2= "+texto2;
        
    }

    /**
     * Web service getEjemplo2
     */
    @WebMethod(operationName = "getEjemplo2") //notacion
    public String getEjemplo2(@WebParam(name = "texto1") String texto1) {
        
        return "Hola desde Web Service Servidor, metodo getEjemplo2(), <b>"+texto1+"</b>";
    }
}

