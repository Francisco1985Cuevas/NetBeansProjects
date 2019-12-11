package vt7;

class IfBloque{
    public static void main(String[] args){
        
        int puntuacion = 3;
        char grupo = 'C';
        /*
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
        */
        
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
