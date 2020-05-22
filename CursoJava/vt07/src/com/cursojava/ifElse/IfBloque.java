package com.cursojava.ifElse;

class IfBloque{
    public static void main(String[] args){
        
        int puntuacion = 3;
        char grupo = 'C';
        
        if(puntuacion >= 5){
            System.out.println("¡Enhorabuena, has aprobado!");
            System.out.println("Tu nota final es: "+puntuacion);
            grupo = 'A';
        }else{
            System.out.println("¡Lo Siento, has suspendido!");
            System.out.println("Tu nota final es: "+puntuacion);
            grupo = 'B';
        }
        System.out.println("Formas parte del Grupo: "+grupo);
        
        
        /*
        if(grupo == 'A'){
            System.out.println("¡Formas parte del Grupo A, enhorabuena!");
        }else if(grupo == 'B'){
            System.out.println("Estas dentro del grupo de los aprobados!");
        }else if(grupo == 'C'){
            System.out.println("Estas dentro del grupo de los suspensos!");
        }else{
            System.out.println("Formas parte del grupo D");
        }
        */
        
    }
}
