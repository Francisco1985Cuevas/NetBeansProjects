
import java.io.*;

public class TodoAMayusculas {
    public static void main(String[] arguments) {
        TodoMayusculas may = new TodoMayusculas(arguments[0]);
        may.convertir();
    }
}

class TodoMayusculas {
    String nombreFuente;

    TodoMayusculas(String fuenteArg) {
        //inicializamos variable = argumento que se le pase cuando
        //se crea una nueva instancia del objeto
        nombreFuente = fuenteArg;
    }
    

    void convertir() {
        
        try {
            
            //Empezamos por crear dos objetos file(fuente, temp)
            File fuente = new File(nombreFuente);
            File temp = new File("may" + nombreFuente + ".tmp");
            
            // Crear stream input
            //creamos stream de entrada, el stream de lectura
            //es el encargado de leer el contenido del archivo
            //para eso usamos FileReader que asociamos con el 
            //archivo "fuente" que creamos mas arriba.
            FileReader fr = new FileReader(fuente);
            
            //se lo pasamos a BufferedReader con lo que tenemos en 
            //el Buffer al que hemos llamado "in" el contenido
            //del archivo "fuente"
            BufferedReader in = new BufferedReader(fr);

            
            
            // Crear stream output
            //creamos el stream de salida con el uso de FileWriter
            //al que pasamos como archivo "temp" que creamos
            //mas arriba, que es ese archivo temporal donde queremos
            //escribir el resultado de la conversion a mayusculas
            FileWriter fw = new FileWriter(temp);
            
            //y se lo asignamos a un Buffer, al que llamamos "out"
            BufferedWriter out = new BufferedWriter(fw);

            
            
            boolean eof = false;//sirve para determinar el final del loop
            int inChar = 0;
            do {
                //empezamos por aplicar el metodo read() a la 
                //variable "in", que es donde tenemos el buffer 
                //de lectura y de este modo vamos a ir leyendo
                //el contenido del archivo fuente caracter
                //a caracter.
                inChar = in.read();
                
                //si inChar no es -1
                if (inChar != -1) {
                    //cast a inChar, con lo cual convertimos a Mayuscula
                    char outChar = Character.toUpperCase( (char)inChar );//lectura
                    
                    //write de out: escribimos la informacion
                    out.write(outChar);//escritura
                } else{
                    eof = true;
                }
                
            } while (!eof);
            
            //aplicar el metodo close a entrada-salida
            //para detener los dos procesos
            in.close();
            out.close();
            
            //borrar el archivo fuente
            boolean borrado = fuente.delete();
            
            //aplicar al archivo temp el metodo renameTo(), con lo
            //que podremos renombrar ese archivo y darle el nombre
            //del archivo fuente, y lo renombramos con el nombre
            //que tenia fuente.
            if (borrado){
                temp.renameTo(fuente);
            }
            
        }catch(IOException e){
            System.out.println("Error -- " + e.toString());
        }catch(SecurityException se){
            System.out.println("Error -- " + se.toString());
        }
        
    }
}

//creamos este programa que convierte todo el texto de un archivo
//a caracteres en mayuscula, para utilizamos un streamBuffered y 
//leemos los caracteres de uno en uno, despues que el caracter 
//es convertido a mayuscula es convertido a un archivo temporal
//usando un streamOutputBuffered y utilizamos objetos file
