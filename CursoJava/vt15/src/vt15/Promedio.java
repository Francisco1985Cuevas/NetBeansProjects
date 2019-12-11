package vt15;

class Promedio{
    public static void main(String[] arguments){
        int sum = 0;
        if (arguments.length > 0) {
            for (int i = 0; i < arguments.length; i++) {
                sum += Integer.parseInt(arguments[i]);
            }
            
            System.out.println("Suma es: "+sum);
            System.out.println("Promedio es: "+ (float) sum / arguments.length );
        }
    }
}