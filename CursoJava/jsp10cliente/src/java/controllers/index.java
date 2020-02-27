/*
    Servlet(Controlador/controller): index

    - Desde este Servlet, o tambien puede ser de cualquier otro
    Servlet que creemos..., llamamos a lo que tenemos en el 
    proyecto jsp10server, osea al Web Service.


Generamos este proyecto para poder "Consumir" un Web Service.

- Generamos una implementacion normal de un proyecto web.
- Primer paso, creamos un paquete donde vamos a guardar nuestros
Servlets que van a actuar como Controladores(controllers).
- Segundo paso, creamos un Servlet llamado index.java y lo
guardamos dentro de nuestro nuevo paquete creado controllers.
Desde ese Servlet llamamos a lo que tenemos en el proyecto
jsp10server, osea al Web Service.
- Tercer paso, creamos la vista asociada a este Servlet, llamada:
index.jsp
Configuramos el archivo web.xml, para que cuando no se cargue nada
en la URL se cargue este Servlet por default.
- Cuarto paso, para llamar al Web Service desde este Proyecto
debemos crear un nuevo "Web Service Client".
para esto... al crear el nuevo "Web Service Client" debemos buscar
el Web Service al cual haremos referencia, debemos guardarlo dentro
de un Paquete (Para este ejemplo se guardo dentro del paquete "ws").
*Se crean automaticamente: una carpeta oculta(Generated Sources[jax-ws])
y dentro de esta carpeta se creo el paquete donde guardamos el 
Web Service, es aqui donde se realiza una implementacion interna de la
Clase(del Web Service) a la cual esta siendo referenciado y ademas
realiza una implementacion por cada uno de los metodos que tenemos en
el Web Service.
*Se crean automaticamente: una carpeta llamada "Web Service References"
crea una implementacion bastante similar al Servidor, pero ahora
desde el Cliente

*/

package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import ws.ServicioTest_Service;


public class index extends HttpServlet {
    
    //Aqui utilizamos los recursos del Web Service.
    
    //Generamos dentro de esta clase Servlet, un metodo de tipo
    //private con el retorno del metodo del Servicio Web, osea
    //realiza una implementacion.
    //Con esto ya podemos utilizar el Servicio..
    
    
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/jsp10server/Servicio_Test.wsdl")
    private ServicioTest_Service service;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        //Invocamos al metodo del Web Service.
        //Cargamos lo que retorno el metodo del Web Service 
        //al parametro "mensaje" y le pasamos este parametro
        //a la vista para ver los resultados.
        String mensaje = getEjemplo("primer texto", "segundo parrafo");
        
        request.setAttribute("mensaje", mensaje);
        
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
    
    
    //con esto ya podemos utilizar el servicio
    private String getEjemplo(java.lang.String texto1, java.lang.String texto2) {
        
        ws.ServicioTest port = service.getServicioTestPort();
        return port.getEjemplo(texto1, texto2);
    }

}
