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
        nombreFuente = fuenteArg;
    }

    void convertir() {
        try {
            // Crear objetos file
            File fuente = new File(nombreFuente);
            File temp = new File("may" + nombreFuente + ".tmp");

            // Crear stream input
            FileReader fr = new FileReader(fuente);
            BufferedReader in = new BufferedReader(fr);

            // Crear stream output
            FileWriter fw = new FileWriter(temp);
            BufferedWriter out = new BufferedWriter(fw);

            boolean eof = false;
            int inChar = 0;
            do {
                inChar = in.read();
                if (inChar != -1) {
                    char outChar = Character.toUpperCase( (char)inChar );
                    out.write(outChar);
                } else
                    eof = true;
            } while (!eof);
            in.close();
            out.close();

            boolean borrado = fuente.delete();
            if (borrado)
                temp.renameTo(fuente);
        } 
    }
}
