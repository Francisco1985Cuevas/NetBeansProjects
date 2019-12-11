package vt7;

import java.util.*;
// 

class Reloj{
    public static void main(String[] args){
        
        // Obtener fecha y hora actual
        // Uso de metodos preConstruidos de la clase Calendar
        // ahora: Variable de tipo Calendar
        Calendar ahora = Calendar.getInstance();
        int hora = ahora.get(Calendar.HOUR_OF_DAY);
        int minuto = ahora.get(Calendar.MINUTE);
        int mes = ahora.get(Calendar.MONTH) + 1;
        int dia = ahora.get(Calendar.DAY_OF_MONTH);
        int an = ahora.get(Calendar.YEAR);
        
        // Mostrar saludo
        if(hora < 12){
            System.out.println("Buenos días.\n");
        }else if(hora < 17){
            System.out.println("Buenos tardes.\n");
        }else{
            System.out.println("Buenos noches.\n");
        }
        
        // Iniciar el mensaje horario mostrando las horas
        System.out.print("Son las");
        System.out.println(" ");
        System.out.println( (hora > 12)?(hora-12):hora );
        System.out.println(" horas ");
        
        // Mostrando los minutos
        if(minuto != 0){
            System.out.println(minuto+" ");
            System.out.println( (minuto != 1) ? "minutos ":"minuto " );
        }
        
        // Mostrar el día
        System.out.println("del día "+dia+" de ");
        
        // Mostrar el nombre del mes
        switch(mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
        }
        
        // Mostrar año
        System.out.println(" de "+an+".");
        
    }
}
