package vt7;

class Ternario{
    public static void main(String[] args){
        int puntuacion = 7;
        char grupo = 'C';
        String mensaje;
        
        mensaje = (puntuacion >= 5)?"Enhorabuena, has aprobado Tu nota final es "+puntuacion: "Lo siento, has suspendido Tu nota final es "+puntuacion;
        System.out.println(mensaje);
    }
}