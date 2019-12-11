package vt13;

class RaizNuevo{
    public static void main(String args[]){
        int numero = 100;
        
        if(args.length > 0){
            numero = Integer.parseInt(args[0]);
        }
        
        System.out.println("La raiz cuadrada de "+numero+" es "+Math.sqrt(numero));
        
    }
}