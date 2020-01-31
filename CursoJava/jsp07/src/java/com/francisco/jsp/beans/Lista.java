
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
    }

    public List getListadeNombres() {
        return listadeNombres;
    }
    
    
    
}
