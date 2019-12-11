package vt13;

class CastingVariables{
    public static void main(String args[]){
        
        // modo explicito, dentro de la operacion convertimos a float
        double x = 56.01;
        float y = (float)(2 * x); // de double a float 
        System.out.println(y);
        
        // modo explicito, el resultado que nos devuelve, lo guardamos como double
        double temp1 = 3.4 * y; // de float a double
        
        // modo explicito, 
        int temp2 = (int)(temp1); // de int a int
        System.out.println(temp2);
        
        
    }
}