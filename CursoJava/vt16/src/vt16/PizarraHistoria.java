package vt16;

class PizarraHistoria{
    String estatus;
    int numeroPregunta;
    int puntuacion;
    
    // Metodo Constructor
    PizarraHistoria(String entrada1, int entrada2, int entrada3){
        //Vamos a darle valor a las tres variables.
        estatus = entrada1;
        numeroPregunta = entrada2;
        puntuacion = entrada3;
        
        //this.estatus = entrada1;
        //this.numeroPregunta = entrada2;
        //this.puntuacion = entrada3;
    }
    
    public static void main(String[] arguments){
        PizarraHistoria grecia = new PizarraHistoria("activa", 3, 6);
        
        System.out.println(grecia.estatus);
        System.out.println(grecia.numeroPregunta);
        System.out.println(grecia.puntuacion);
    }
}