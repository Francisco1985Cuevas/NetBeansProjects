/*
para esta clase creamos un campo al que vamos a llamar "valor"
y posteriormente creamos metodos accesor(Setter&&Getter).

 */
package com.cursojava.controller;


public class Nombre {
    
    private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    String getValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
