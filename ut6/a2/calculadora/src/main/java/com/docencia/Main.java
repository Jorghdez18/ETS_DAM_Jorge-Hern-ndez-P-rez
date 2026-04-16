package com.docencia;

/**
 * Clase Main
 * @author jhdezprez
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Media [4,6,8] = " +
                CalculadoraNotas.calcularMedia(new int[]{4, 6, 8}));

        System.out.println("Media [9,9,9] = " +
                CalculadoraNotas.calcularMedia(new int[]{9, 9, 9}));

        System.out.println("Media [1,2,3,4] = " +
                CalculadoraNotas.calcularMedia(new int[]{1, 2, 3, 4}));

        try {
            CalculadoraNotas.calcularMedia(new int[]{});
        } catch (Exception e) {
            System.out.println("Error correcto: lista vacía");
        }

        try {
            CalculadoraNotas.calcularMedia(new int[]{3, -2, 7});
        } catch (Exception e) {
            System.out.println("Error correcto: nota inválida");
        }
    }
}