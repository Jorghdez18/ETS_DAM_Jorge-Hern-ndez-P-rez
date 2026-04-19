package com.docencia;

/**
 * @author jhdezprez
 * @version 1.0.0
 * Clase carrito
 */
import java.util.List;

public class Carrito {


    /**
     * Funcion que calcula el subtotal del carrito
     * @param carrito
     * @return subtotal
     */
    public static double calcularSubtotal(List<Producto> carrito) {
        double subtotal = 0;

        for (Producto p : carrito) {
            subtotal += p.getPrecio() * p.getCantidad();
        }

        return subtotal;
    }

    /**
     * Funcion que aplica el descuento al subtotal
     * @param subtotal
     * @param descuento
     * @return el total aplicando descuento
     */
    public static double aplicarDescuento(double subtotal, double descuento) {
        if (descuento < 0 || descuento > 100) {
            throw new IllegalArgumentException("Descuento inválido");
        }

        return subtotal - (subtotal * descuento / 100);
    }

    public static double calcularEnvio(double subtotal) {
        if (subtotal >= 100) {
            return 0;
        } else {
            return 5;
        }
    }

    /**
     * FUncion que calcula el total con descuento y envio
     * @param carrito
     * @param descuento
     * @return total
     */
    public static double calcularTotal(List<Producto> carrito, double descuento) {
        double subtotal = calcularSubtotal(carrito);
        double conDescuento = aplicarDescuento(subtotal, descuento);
        double envio = calcularEnvio(conDescuento);

        return conDescuento + envio;
    }
}