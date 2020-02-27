/*
 * Aplicacion Java SE para "consumir" nuestro Web Service 
   de prueba.
*/

package vt36wsclienteclass;


public class Vt36WSClienteClass {

    
    public static void main(String[] args) {
        
        String nombre = hello("Francisco");
        int total = add(4, 8);
        
        System.out.println("hello "+nombre);
        System.out.println("add "+total);
    }

    private static int add(int i, int j) {
        com.cursojava.ws.CalculadoraWS_Service service = new com.cursojava.ws.CalculadoraWS_Service();
        com.cursojava.ws.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.add(i, j);
    }

    private static String hello(java.lang.String name) {
        com.cursojava.ws.CalculadoraWS_Service service = new com.cursojava.ws.CalculadoraWS_Service();
        com.cursojava.ws.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.hello(name);
    }
    
}
