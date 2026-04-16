package com.ejemplo;

/**
 * @author jhdezprez
 * @version 1.0.0
 * Clase que calculara las notas
 */
public class CalculadoraNotas {
    /**
     * Funcion que calcula la media
     * @param notas
     */
    public static double calcularMedia(int[] notas) {
        if(notas.length == 0){
            throw new IllegalArgumentException("Lista vacía");
        }
        int suma = 0;
        for(int nota : notas){
            if(nota < 0 || nota > 10){
                throw new IllegalArgumentException("Nota fuera de rango");
            }
            suma += nota;
        }
        return (double) suma / notas.length; 
    }
}