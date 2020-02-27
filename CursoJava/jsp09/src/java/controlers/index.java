/*
    Servlet(Controlador/controller): index

    Description: le indicamos a este Servlet que el contenido que
    nos entregue como respueta nos permita mostrarlo a traves de
    un archivo JSP(vista) que va a quedar asociado a esto.

    - Implementando el patron MVC en Java.
    *Primer paso, crear proyecto Java Web.
    *Segundo paso, crear paquete donde vamos a guardar el/los Servlet
    que creemos para el proyecto.
    Una de las convenciones es que el 
    paquete de Controladores lo nombremos en ingles "controllers".
    *Tercer paso, crear un Servlet llamado index.java y lo guardamos
    dentro del nuevo paquete creado(controllers).
    Para el Servlet: Añadimos la informacion al archivo de escritor web
    XML y le damos un Path.
    Definimos que este Servlet sea el que se carga por default.
    En el Servlet que acabamos de crear indicamos que el contenido 
    que nos entregue como respuesta nos permita mostrarlo a traves de
    un archivo JSP(vista) que va a quedar asociado a esto.
    *Cuarto paso, crear el archivo index.jsp que sera la Vista de nuestra
    aplicacion.
    *Generamos otro Servlet de prueba llamado Nosotros, lo guardamos
    dentro del paquete controllers.
*/

package controlers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class index extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //Asociamos la Vista(.jsp) asociada a este Servlet
        //cuando cargo este Servlet desde la URL me va a cargar
        //el contenido a traves de un archivo llamado index.jsp
        
        //tambien podemos pasar parametros desde aqui a nuestras Vistas.
        String saludo = "Hola desde el Servlet index";
        //request.setAttribute("saludo", saludo);
        request.setAttribute("texto", saludo);
        
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
    }

}
