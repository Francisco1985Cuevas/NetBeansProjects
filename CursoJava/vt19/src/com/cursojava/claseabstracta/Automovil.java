package com.cursojava.claseabstracta;


public class Automovil extends Vehiculo {
    private String marca;
    private String modelo;

    public Automovil(String marca, String modelo) {
        
        super();
        
        this.marca = marca;
        this.modelo = modelo;
    }

   
    public void avanzar() {
        System.out.println("El Vehiculo debe avanzar encendiendolo!");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
