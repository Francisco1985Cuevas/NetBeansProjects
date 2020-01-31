
package com.francisco.jsp.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.francisco.jsp.modelos.testModel;

public class testController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            

//            
//            
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet testController</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet testController at " + request.getContextPath() + "</h1>");
//            
//            out.println("<p>nombre " + nombre + "</p>");
//            out.println("<p>correo " + correo + "</p>");
//            out.println("<p>pais " + pais + "</p>");
//            out.println("<p>sexo " + sexo + "</p>");
//            
//            out.println("</body>");
//            out.println("</html>");
//        }
        
        
//CALCULOS Y PROCESOS SE HACEN AQUI

        String input_nombre;
        input_nombre = request.getParameter("nombre");
        String input_correo;
        input_correo = request.getParameter("correo");
        String input_pais;
        input_pais = request.getParameter("pais");
        String input_sexo;
        input_sexo = request.getParameter("sexo");


        testModel t = new testModel();
        
        t.setNombre(input_nombre);
        t.setCorreo(input_correo);
        t.setPais(input_pais);
        t.setSexo(input_sexo);
        
        request.setAttribute("t", t);
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
