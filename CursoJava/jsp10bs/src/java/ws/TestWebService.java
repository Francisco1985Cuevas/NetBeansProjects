/*
    Web Service: TestWebService
 */

package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "TestWebService")
public class TestWebService {

    /**
     * This is a sample web service operation
     * Este es un metodo de ejemplo que retorna una cadena.
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * retorna la suma de dos numeros pasados a este metodo.
     */
    @WebMethod(operationName = "getSuma")
    public int getSuma(@WebParam(name = "p1sumando") int p1sumando, @WebParam(name = "p2sumando") int p2sumando) {
        int suma;
        suma = p1sumando + p2sumando;
        return suma;
    }

    /**
     * Web service operation
     * retorna la resta de dos numeros pasados a este metodo.
     */
    @WebMethod(operationName = "getResta")
    public int getResta(@WebParam(name = "minuendo") int minuendo, @WebParam(name = "sustraendo") int sustraendo) {
        int resta;
        resta = minuendo - sustraendo;
        return resta;
    }

    /**
     * Web service operation
     * retorna la multiplicacion de dos numeros pasados a este metodo.
     */
    @WebMethod(operationName = "getProducto")
    public int getProducto(@WebParam(name = "multiplicando") int multiplicando, @WebParam(name = "multiplicador") int multiplicador) {
        int producto;
        producto = multiplicando * multiplicador;
        return producto;
    }

    /**
     * Web service operation
     * retorna la division de dos numeros pasados a este metodo.
     */
    @WebMethod(operationName = "getDivision")
    public int getDivision(@WebParam(name = "dividendo") int dividendo, @WebParam(name = "divisor") int divisor) {
        int cociente;
        cociente = dividendo / divisor;
        return cociente;
    }

}
