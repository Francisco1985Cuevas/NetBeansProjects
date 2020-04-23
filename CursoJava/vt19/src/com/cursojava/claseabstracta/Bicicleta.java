package com.cursojava.claseabstracta;

public class Bicicleta extends Vehiculo{

    private String tipo; //urbana, deportiva

    public Bicicleta() {
        super();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public void avanzar() {
        System.out.println("Este tipo de Vehiculo debe avanzar Pedaleando!");
    }
    
}
