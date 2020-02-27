/*
    Enterprise Java Bean(EJB): Lista.java

    Description: Creamos este Java Bean con la siguiente
    estructura, una Clase con un atributo publico(listadeNombres)
    lo inicializamos dentro de un Constructor(), y le vamos dando
    algunos valores.
    Luego creamos el metodo publico de salida, getListadeNombres().
*/
package com.francisco.jsp.beans;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class Lista {
    public List listadeNombres;
    
    public Lista() {
        listadeNombres = new ArrayList();
        listadeNombres.add("Francisco Cuevas");
        listadeNombres.add("Marcelo Ñandú");
        listadeNombres.add("Alberto Perez");
        listadeNombres.add("Lucía Méndez");
        listadeNombres.add("Cesar Cancino");
        listadeNombres.add("Jesus Conde");
    }
    
    public List getListadeNombres() {
        return listadeNombres;
    }
    
}
