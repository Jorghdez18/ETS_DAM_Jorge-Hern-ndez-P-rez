package com.docencia;

/**
 * Clase CalculadoraNotas
 * @author jhdezprez
 * @version 1.0.0
 */
public class CalculadoraNotas {

    /**
     * Funcion que calcula la media dada unas notas
     */
    public static double calcularMedia(int[] notas) {

        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException("Lista vacía");
        }

        double suma = 0;

        for (int nota : notas) {

            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("Nota fuera de rango");
            }

            suma += nota;
        }

        return suma / notas.length;
    }
}