/*
por lo "general" la clase abstracta se usa para heredar.
*/
package com.cursojava.claseabstracta;

public abstract class Vehiculo {
    
    private String color;
    private int cantRuedas;
    private int cantPuertas;
    private String nroChasis;
    private String nroChapa;

    public Vehiculo() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public String getNroChasis() {
        return nroChasis;
    }

    public void setNroChasis(String nroChasis) {
        this.nroChasis = nroChasis;
    }

    public String getNroChapa() {
        return nroChapa;
    }

    public void setNroChapa(String nroChapa) {
        this.nroChapa = nroChapa;
    }
    
    
    public void detenerse(){
        System.out.println("El Vehiculo debe detenerse!");
    }
    
    //aqui declaramos un metodo abstracto
    //un metodo abstracto, necesita ser implementado cuando
    //se vaya a instanciar
    public abstract void avanzar();
    
}
