package com.cursojava.ifElse;

public class Switch {
    public static void main(String[] args){
        //ejemplo de uso de switch-case
        
        char grupo = 'C';
        
        switch(grupo){
            case 'A':
                System.out.println("Tienes una A, Gran trabajo");
                break;
            case 'B':
                System.out.println("Tienes una B, Buen trabajo");
                break;
            case 'C':
                System.out.println("Tienes una C, Hay que trabajar mas");
                break;
            default:
                System.out.println("Tienes una D, Necesitas un gran Cambio");
        }
    }
}
