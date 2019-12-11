package vt_17;

class ContadorInstancias{
    private static int numInstancias = 0;
    
    protected static int getCuenta(){
        return numInstancias;
    }
    
    private static void addInstancia(){
        numInstancias++;
    }
    
    ContadorInstancias(){
       ContadorInstancias.addInstancia();
    }
    
    public static void main(String[] arguments){
        System.out.println("Empezamos con "+ContadorInstancias.getCuenta()+" instancias");
        for (int i = 0; i < 500; i++) {
            new ContadorInstancias();
            System.out.println("Creadas "+ContadorInstancias.getCuenta()+" instancias");
        }
    }
    
}