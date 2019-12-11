package vt5;

class Incremento{
    public static void main(String[] args){
        int x = 3;
        //int valor = x++ * 10;   // Sufijo
        int valor = ++x * 10;   // Prefijo
        
        System.out.println(valor);
        System.out.println(x);
        
    }
}