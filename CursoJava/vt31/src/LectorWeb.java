//importamos los paquetes que necesitamos
import javax.swing.*;//
import java.awt.*;//para la parte grafica GUI's
import java.awt.event.*;//agregar un vigilante event
import java.net.*;
import java.io.*;//input-output de datos

//12
//20

//creamos la clase LectorWeb y la hacemos subclase de JFrame
//1)creamos la interface de usuario
public class LectorWeb extends JFrame {
    
    //creamos un componente JTextArea
    JTextArea caja = new JTextArea("Obteniendo datos ...");
    
    //llamamos al constructor de la superclase con el uso de super()
    public LectorWeb() {
        
        //asignamos el titulo del marco/contenedor
        super("Obtener Archivo Aplicación");
        
        //configuramos el comportamiento del boton de cierre del marco/contenedor
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //configuramos el tamanho del marco/contenedor
        setSize(600, 300);
        
        //creamos una nueva instancia de JScrollPane(scroll)
        //hacemos scrollable el area de texto(JTextArea)
        JScrollPane panel = new JScrollPane(caja);
        
        //anhadimos el scroll al marco/contenedor
        add(panel);
        
        //hacemos visible el marco/contenedor
        setVisible(true);
    } //1)creamos la interface de usuario

    
    void obtenerDatos(String direccion) throws MalformedURLException {

        setTitle(direccion);
        
        //2) creamos un objeto URL (pagina)
        URL pagina = new URL(direccion);//(proceso 4 pasos para cargar documento texto y leer)1º Objeto URL * Direccion web
        StringBuffer texto = new StringBuffer();
        
        try {
            //2) conectamos el objeto URL(pagina) a internet
            //2º Objeto HttpURLConnection * Lleva a cabo la conexion
            HttpURLConnection con = (HttpURLConnection) pagina.openConnection();
            con.connect();
            
            //3) vamos a cargar ese contenido de la pagina web
            //dentro de un Stream
            //3º Metodo getContent() * Lee Stream Datos.
            InputStreamReader in = new InputStreamReader((InputStream) con.getContent());
            
            //4º Objeto BufferedReader * Lee caracteres
            BufferedReader buff = new BufferedReader(in);
            
            
            //ahora podemos decidir que hacer con esa
            //informacion que tenemos almacenada en el buffer.
            //utilizamos setText de caja para mostrar ese texto
            //en pantalla, mientras se lleva a cabo la recuperacion
            //de la informacion
            caja.setText("Obteniendo datos ...");
            
            //4) mostrar ese texto dentro de un area de texto
            String linea;
            do {
                //readLine(): anhadimos las lineas que vayamos 
                //leyendo dentro de la caja de texto
                linea = buff.readLine();
                texto.append(linea + "\n");
            } while (linea != null);
            /* String key;
            String header;
            int i = 0;
            do {
                key = con.getHeaderFieldKey(i);
                header = con.getHeaderField(i);
                if (key == null) {
                    key = "";
                } else {
                    key = key + ": ";
                }
                  
                if (header != null) {
                    texto.append(key + header + "\n");
                }
            
                i++;
            } while (header != null);
            texto.append("\n"); */
            
            //convertir el texto en string
            caja.setText(texto.toString());
            
        } catch (IOException ioe) {
            System.out.println("IO Error:" + ioe.getMessage());
        }
    }
    
    
    
    public static void main(String[] arguments) {
        if (arguments.length < 1) {//comprobar que se ha pasado alguna informacion
            System.out.println("Uso: url java LectorWebReader");
            System.exit(1);
        }
        
        
        try {
            //creamos objeto de LectorWeb
            LectorWeb apli = new LectorWeb();
            apli.obtenerDatos(arguments[0]);
            //apli.obtenerDatos("http://illasaron.com/index.php");
            //apli.obtenerDatos("http://www.example.com/docs/resource1.html");
        } catch (MalformedURLException mue) {
            System.out.println("URL incorrecto: " + arguments[0]);
        }
    }
    
    
}

//en esta aplicacion utilizamos la tecnica de los 4 pasos a seguir
//para abrir una conexion con un sitio web, leer un documento 
//de texto desde el y cuando el documento este cargado completamente
//lo mostraremos en nuestra aplicacion dentro de un area
//de texto.

