/*
 este proyecto actua como un Cliente para consumir 
el web service
 */
package vt17clienteconversionunidades;


public class Vt17ClienteConversionUnidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Resultado = "+pulgadasACentimetros(1));
    }
    
    //este metodo se arrastro del web service...
    private static double pulgadasACentimetros(double pulgadas) {
        com.cursojavaee.webservices.ConversionUnidades_Service service = new com.cursojavaee.webservices.ConversionUnidades_Service();
        com.cursojavaee.webservices.ConversionUnidades port = service.getConversionUnidadesPort();
        return port.pulgadasACentimetros(pulgadas);
    }
    
}
