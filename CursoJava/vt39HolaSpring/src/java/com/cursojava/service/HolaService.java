/*
este servicio(esta clase HolaService) va a llevar a cabo un servicio
muy sencillo, toma un nombre como parametro y prepara y devuelve
un String que "incluye" ese nombre, asi que vamos a crear un 
metodo(diHola) que retorna el String
 */
package com.cursojava.service;


public class HolaService {
    
   public String diHola(String nombre){
       return "Hola "+nombre+"!";
   }
}
