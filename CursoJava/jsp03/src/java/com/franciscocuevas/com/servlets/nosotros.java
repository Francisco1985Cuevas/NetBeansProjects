/*
    Servlet: nosotros
*/
package com.franciscocuevas.com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class nosotros extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            
            
            //recuperamos un parametro pasado desde la URL
            String id;
            id = request.getParameter("id");
            if(id==null){
                id = "0";
            }else{
                id = id;
            }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            //AQUI SE PUEDE LLAMAR AL CSS SIN PROBLEMA
            out.println("<title>Servlet Nosotros</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            out.println("<h1>Hola desde el Servlet Nosotros</h1>");
            out.println("<p>el valor de id es: </p>"+id);
            
            
            //out.println("<ul>");
            //out.println("<li><a href=\"index.jsp\">index</a></li>");//se devuelve desde el servlet al index.jsp
            //out.println("<li><a href=\"nosotros\">nosotros</a></li>");
            //out.println("<li><a href=\"mision\">mision</a></li>");
            //out.println("<ul/>");
            
            out.println("<br><a href=\"index.jsp\">Volver</a>");
            
            
            out.println("</body>");
            out.println("</html>");
            
        }
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
