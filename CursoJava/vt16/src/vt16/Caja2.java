package vt16;
import java.awt.Point;

class Caja2 {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    Caja2(int x1 , int y1 , int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    Caja2(Point supIzq, Point infDer){
        x1 = supIzq.x;
        y1 = supIzq.y;
        x2 = infDer.x;
        y2 = infDer.y;
    }

    Caja2(Point supIzq, int an, int al){
        x1 = supIzq.x;
        y1 = supIzq.y;
        x2 = (x1 + an) ;
        y2 = (y1 + al) ;
    }

    void imprimirCaja(){
        System.out.print( "Caja2: <" + x1 + " , " + y1 );
        System.out.println( ", " + x2 + " , " + y2 + " >" );
    }

    public static void main(String[] arguments){
        Caja2 rect;

        System.out.println("Llamando a Caja2 con coordenadas "+ " (25, 25) and (50, 50) : ");
        rect = new Caja2(25, 25, 50, 50);
        rect.imprimirCaja() ;

        System.out.println( "\nLlamando a Caja2 con puntos "+ " (10, 10) and (20, 20) : ");
        rect = new Caja2(new Point( 10, 10) , new Point(20, 20));
        rect.imprimirCaja();

        System.out.println( "\nLlamando a Caja2 con 1 punto "+ " (10, 10), ancho 50 y alto 50:" );
        rect = new Caja2(new Point(10, 10), 50, 50);
        rect.imprimirCaja();
    }
}