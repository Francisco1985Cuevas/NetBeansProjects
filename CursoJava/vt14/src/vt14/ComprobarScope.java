package vt14;

class ComprobarScope{
    int test = 10; //variable instancia, variable que se define dentro de la propia clase
    
    void imprimirTest(){
        int test = 20; //variable local porque esta dentro de un metodo
        
        //System.out.println("Test: "+test); //imprime la variable local, java siempre busca de abajo a arriba
        System.out.println("Test: "+this.test); // imprime la variable instancia
    }
    
    public static void main(String[] arguments){
        ComprobarScope st = new ComprobarScope();
        st.imprimirTest();
    } 
}