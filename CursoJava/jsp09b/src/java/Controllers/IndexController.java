/*
    Servlet(Controlador/Controller): IndexController


Implementando el patrón MVC
----------------------------

* Primer paso, crear Proyecto Java Web.

* Segundo paso, crear Paquete donde vamos a guardar el/los Servlet 
que creemos para el Proyecto. Una de las convenciones es que el 
Paquete de Controladores lo nombremos en ingles "Controllers".

* Tercer paso, creamos los Servlets: indexController.java, NosotrosController.java,
MisionController.java, ContactoController.java, y los guardamos 
dentro del nuevo Paquete creado(Controllers).

Para los Servlets, Añadimos la información al archivo de escritor 
web XML y le damos un Path a cada uno. 

Definimos que el Servlet "indexController.java" sea el que se 
carga por default.

* Cuarto paso, crear los archivos indexview.jsp, nosotrosview.jsp, 
contactoview.jsp, misionview.jsp, que seran las Vistas de 
nuestra aplicación. 

*/

package Controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class IndexController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        request.getRequestDispatcher("indexview.jsp").forward(request, response);
        
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
