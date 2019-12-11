package vt8;

import java.util.*; // hacer que el grupo de clases jav.util este disponible para este programa

class MedidorVelocidad{
    public static void main(String args[]){ // Bloque main del programa(lo iniciamos)
        
        Calendar start = Calendar.getInstance(); // Usamos la clase Calendar y creamos una variable de esta clase a la que llamamos start, 
        int startMinute = start.get(Calendar.MINUTE); //obtenemos el minuto
        int startSecond = start.get(Calendar.SECOND); // obtenemos el segundo, que lo utilizaremos para medir el tiempo
        
        start.roll(Calendar.MINUTE, true); // metodo roll, mueve el tiempo hacia adelante
        int nextMinute = start.get(Calendar.MINUTE);
        int nextSecond = start.get(Calendar.SECOND);
        
        int index = 0;
        // la cantidad de veces que es llevado a cabo el loop
        while(true){ //loop while
            double x = Math.sqrt(index); // la raiz cuadrada de index
            GregorianCalendar now = new GregorianCalendar(); // utilizando la clase GregorianCalendar, creamos una variable a la que llamamos now y es una instancia de esta clase
            if(now.get(Calendar.MINUTE) >= nextSecond){
                break;
            }
            index++;
        }
        System.out.println(index+" loops in one minute.");
    }
}