package vt8;

class NombrarLoops{
    public static void main(String args[]){
        
        //nombrar o etiquetar un loop.
        
        int points = 0;
        int target = 100;
        targetLoop: //Asi se nombra(etiquetar) a un loop
        while(target <= 100){
            for(int i = 0; i < target; i++){
                if(points > 50){
                    System.out.println("points = "+points);
                    System.out.println("Saliendo de los dos loops");
                    break targetLoop;//rompe el loop etiquetado
                }
                points = points + 1;
            }
        }
    }
}