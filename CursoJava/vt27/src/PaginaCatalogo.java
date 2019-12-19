import java.net.*;

public class PaginaCatalogo {
    
    public static void main(String[] arguments) {
        
        PaginaInicial[] catalogo = new PaginaInicial[5];
        
        try {
            catalogo[0] = new PaginaInicial("Alfredo Belcacer",
                "http://www.ultimasnovedades.com", "actualidad");
            catalogo[1] = new PaginaInicial("Roberta Savino",
                "http://www.losmaspopulares.com", "musica");
            catalogo[2] = new PaginaInicial("Camilo Arrouca",
                "http://rubyonrailes.net", "programacion");
            catalogo[3] = new PaginaInicial("Julia Cabrera",
                "http://www.escolantes.com", "educativo");
            catalogo[4] = new PaginaInicial("Jaime Lendón",
                "http://www.awt.org");
            for (int i = 0; i < catalogo.length; i++) {
                System.out.println(catalogo[i].propietario + ": " +
                catalogo[i].direccion + " — " +
                catalogo[i].categoria);
            }
        } catch (MalformedURLException e) {//aqui sera recogida la exception
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
}