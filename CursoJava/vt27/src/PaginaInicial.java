import java.net.*;

//base para catalogo online

public class PaginaInicial {
    
    String propietario;
    URL direccion;
    String categoria = "ninguna";

    public PaginaInicial(String enPropietario, String enDireccion)
        throws MalformedURLException {
        propietario = enPropietario;
        direccion = new URL(enDireccion);
    }

    public PaginaInicial(String enPropietario, String enDireccion, String enCategoria)
       throws MalformedURLException {
        this(enPropietario, enDireccion);
        categoria = enCategoria;
    }
    
    //se lanza la exception pero se captura en PaginaCatalogo.java 
    //en el catch
}