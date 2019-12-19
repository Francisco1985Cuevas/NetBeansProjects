public class Sumador {
    
    public static void main(String[] arguments) {
        float sum = 0;
        for (int i = 0; i < arguments.length; i++) {
            sum = sum + Float.parseFloat(arguments[i]);
        }
        
        System.out.println("Esos números suman un total de: " + sum);
    }
}
