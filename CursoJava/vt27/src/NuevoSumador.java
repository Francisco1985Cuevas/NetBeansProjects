public class NuevoSumador {
    public static void main(String[] arguments) {
        float sum = 0;
        for (int i = 0; i < arguments.length; i++) {
            
            try {
                sum = sum + Float.parseFloat(arguments[i]);
            } catch (NumberFormatException e) {
                System.out.println(arguments[i] + " no es un número.");
            }
            
        }
        System.out.println("Esos números suman un total de " + sum);
    }
}
