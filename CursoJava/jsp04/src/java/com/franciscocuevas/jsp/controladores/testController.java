/*
    Servlet: testController

    Description: Desde este Servlet vamos a hacer el envio de la
    informacion.
*/
package com.franciscocuevas.jsp.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.franciscocuevas.jsp.modelos.testModel;

public class testController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        testModel t = new testModel();
        //vamos a utilizar dos metodos que nos van a permitir
        //retornar todo lo que tiene la clase testModel()
        //dentro de nuestra vista(index.jsp)
        
        /*//la idea es que en vez de asignar/setear recibamos
        //este valor de alguna base de datos.
        t.setCorreo("hhh@hola.com");*/
        
        request.setAttribute("t", t);
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
        //getRequestDispatcher: Es un metodo de Java que nos permite
        //hacer la configuracion y hacer la comunicacion desde el EJB
        //a traves del Servlet hacia la Vista.
        
        //Los Servlet para poder pasarle valores desde aqui
        //a un EJB, necesariamente tengo que recibirlos a traves
        //del metodo: doGet(), o doPost()
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

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
