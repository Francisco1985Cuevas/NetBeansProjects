package vt8;

class ContinueLoop{
    public static void main(String args[]){
        int index = 0;
        while(index <= 1000){
            index = index +5;
            
            if(index == 400)
                continue; //salta en 400 no ejecuta cuando == 400
           
            System.out.println("El index es "+index);
            
        }
    }
}