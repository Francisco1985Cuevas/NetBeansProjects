package vt8;

class NombrarLoops{
    public static void main(String args[]){
        int points = 0;
        int target = 100;
        targetLoop: //Asi se nombra a un loop
        while(target <= 100){
            for(int i = 0; i < target; i++){
                if(points > 50){
                    System.out.println("points = "+points);
                    System.out.println("Saliendo de los dos loops");
                    break targetLoop;
                }
                points = points + 1;
            }
        }
    }
}