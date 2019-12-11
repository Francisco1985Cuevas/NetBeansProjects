package vt16;

class Circulo{
    //Creamos tres variables de instancia
    int x, y, radio;
    
    //Metodo Constructor con tres parametros
    Circulo(int puntoX, int puntoY, int tamRadio){
        this.x = puntoX;
        this.y = puntoY;
        this.radio = tamRadio;
        
    }
    
    //Metodo Constructor con dos parametros
    Circulo(int puntoX, int puntoY){
        this(puntoX, puntoY, 1); //es la forma de referenciar al constructor de arriba
    }
    
    void Resultado(){
        int resultado = x*y*radio;
        System.out.println(resultado);
    }
    
    
    public static void main(String[] args){
        //Para saber a cual de los metodos constructor estamos llamando hay que
        //especificarle la cantidad de parametros.
        //Circulo z = new Circulo(2, 3, 4);
        Circulo z = new Circulo(2, 3);
        z.Resultado();
    }
}
