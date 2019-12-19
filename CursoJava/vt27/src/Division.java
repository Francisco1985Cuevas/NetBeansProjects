public class Division  {
    public static void main(String[] arguments) {
        if (arguments.length == 2) {
            int resultado = 0;
            try {
                resultado = Integer.parseInt(arguments[0]) /
                  Integer.parseInt(arguments[1]);
                System.out.println(arguments[0] + " dividido por "
                    + arguments[1] + " igual a " + resultado);
            } catch (NumberFormatException e) {
                System.out.println("Ambos argumentos deben ser números.");
                throw e;//no solo muestra el mensaje sino tambien el error informa
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                throw e;//no solo muestra el mensaje sino tambien el error informa
            }
           /* finally {
                   System.out.println("El bloque try-catch ha finalizado. Se ejecuta siempre finally");
               }*/
        }
    }
}
