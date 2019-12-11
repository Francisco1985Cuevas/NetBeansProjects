package vt15;

class Execute_Convertidor{
    
    public static void main(String[] argumentos){
        Convertidor convertidor = new Convertidor();
        convertidor.aMayusculas(argumentos); //pasamos como parametro a este metodo un objeto, el array String argumentos[]
        
        for (int i = 0; i < argumentos.length; i++) {
            System.out.print(argumentos[i]+" ");
        }
    }
    //11
}