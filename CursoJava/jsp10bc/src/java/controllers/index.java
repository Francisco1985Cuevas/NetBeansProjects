/*
    Servlet(Controlador/Controller): index

    Description:Siguiendo con la creación de Web Service, creamos 
    un nuevo Proyecto Web(Cliente) para poder "Consumir" este 
    Web Service. 

    - Quinto paso, creamos un nuevo Proyecto Web y generamos una 
    implementación normal de un Proyecto Web, como lo  veníamos 
    haciendo.

    - Sexto paso, creamos un Paquete donde vamos a guardar nuestros 
    Servlets que van a actuar como Controladores(controllers) en 
    este proyecto.

    - Séptimo paso, creamos un Servlet y lo guardamos dentro de 
    nuestro nuevo Paquete creado “controllers”. Desde este Servlet 
    llamamos al Web Service.
    Configuramos el archivo web.xml, para que cuando se carga la 
    aplicación y no se escriba nada en la URL se cargue este Servlet 
    por default.

    - Octavo paso, creamos la Vista(JSP) asociada a este Servlet.

    - Noveno paso, desde nuestro Proyecto para que podamos llamar al 
    Web Service debemos crear un nuevo "Web Service Client".

    Pasos para crear el Web Service Client: Cuando creamos el nuevo 
    "Web Service Client" debemos buscar el Web Service al cual 
    haremos referencia, y lo guardaremos dentro de un Paquete “ws”.
    Al crearse el nuevo Web Service Client, se crean también 
    automáticamente dos cosas:
    * Una carpeta oculta llamada “Generated Sources(jax-ws)” y dentro 
    de esta carpeta se creo el paquete donde guardamos el Web Service, 
    es aquí donde se realiza una implementación interna de la 
    Clase(del Web Service) a la cual esta siendo referenciado y 
    ademas realiza una implementación por cada uno de los métodos 
    que tenemos en el Web Service. 
    * Una carpeta llamada "Web Service References" crea una 
    implementación bastante similar al Servidor, pero ahora desde el 
    Cliente.

    - Decimo paso, desde nuestro Servlet que esta en el Proyecto Cliente… podemos utilizar esos recursos del Web Service.

 */

package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import ws.TestWebService_Service;


public class index extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/jsp10bs/TestWebService.wsdl")
    private TestWebService_Service service;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //arrastrar aqui el metodo del Web Service.
        
        String nombre = hello("Francisco");
        request.setAttribute("variable_nombre", nombre);
        
        int suma = getSuma(5, 3);
        request.setAttribute("variable_suma", suma);
        
        int resta = getResta(20, 15);
        request.setAttribute("variable_resta", resta);
        
        int producto = getProducto(6, 8);
        request.setAttribute("variable_producto", producto);
        
        int division = getDivision(20, 2);
        request.setAttribute("variable_division", division);
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
    
    
    private String hello(java.lang.String name) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.TestWebService port = service.getTestWebServicePort();
        return port.hello(name);
    }

    private int getSuma(int p1Sumando, int p2Sumando) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.TestWebService port = service.getTestWebServicePort();
        return port.getSuma(p1Sumando, p2Sumando);
    }

    private int getResta(int minuendo, int sustraendo) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.TestWebService port = service.getTestWebServicePort();
        return port.getResta(minuendo, sustraendo);
    }

    private int getProducto(int multiplicando, int multiplicador) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.TestWebService port = service.getTestWebServicePort();
        return port.getProducto(multiplicando, multiplicador);
    }

    private int getDivision(int dividendo, int divisor) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.TestWebService port = service.getTestWebServicePort();
        return port.getDivision(dividendo, divisor);
    }

}
