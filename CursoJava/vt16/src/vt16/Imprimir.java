package vt16;

class Imprimir{
    int x = 0;
    int y = 1;
    
    void imprimeme(){
        System.out.println("X es "+x);
        System.out.println("Y es "+y);
        System.out.println("Soy una instancia de la clase "+this.getClass().getName());
    }
}

class SubImprimir extends Imprimir{
    int z = 3;
    
    //SobreEscribimos el metodo imprimeme()
    void imprimeme(){
        System.out.println("X es "+x);
        System.out.println("Y es "+y);
        System.out.println("Z es "+z);
        System.out.println("Soy una instancia de la clase "+this.getClass().getName());
    }
    
    public static void main(String[] arguments){
        SubImprimir obj = new SubImprimir();
        obj.imprimeme();
    }
}

