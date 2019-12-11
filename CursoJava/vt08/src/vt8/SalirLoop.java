package vt8;

class SalirLoop{
    public static void main(String args[]){
        int index = 0;
        while(index <= 1000){
            index = index +5;
            System.out.println(index);
            
            if(index == 400){
                System.out.println("index = 400. Saliendo...");
                break; // Fuerza la salida del if y del Loop while
            }
        }
    }
}