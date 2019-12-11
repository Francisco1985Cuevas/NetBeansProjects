class Prioridad2{
    public static void main(String[] args){
        // Ejemplo de prioridades matematicas en Java
        int x = 7;
        int z = x++ * 6 + 4 * 10 / 2; //Se comienza a resolver de izquierda a derecha
        // El incremento es "Sufijo", lo primero que va a hacer es mantener su valor
        // y despues de llevar a cabo la operacion cambiarlo.
        
        // Primero resuelve MULTIPLICACIONES y DIVISIONES y si hay mas de 
        // una(Multiplicacion o division) de izquierda a derecha.
        
        // Por ultimo paso se resuelve las sumas y restas.
        
        System.out.println(x);
        System.out.println(z);
    }
}

// multiplicar 7 * 6 a continuacion va a multiplicar 4 * 10
// y a continuacion lo divide por 2 y el resultado que tengan estos dos
// es el que va posteriormente a sumar.
//z = x++ * 6 + 4 * 10 / 2;
//z = 7 * 6 + 4 * 10 / 2
//z = 42 + 40/2
//z = 42 + 20
//z = 62