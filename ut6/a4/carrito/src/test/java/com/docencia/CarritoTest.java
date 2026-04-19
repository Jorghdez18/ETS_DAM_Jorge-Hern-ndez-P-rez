package com.docencia;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CarritoTest {


    @Test
    void testSubtotalVariosProductos() {
        List<Producto> carrito = List.of(
                new Producto("teclado", 30, 2),
                new Producto("raton", 10, 1)
        );
        assertEquals(70, Carrito.calcularSubtotal(carrito));
    }

    @Test
    void testSubtotalUnProducto() {
        List<Producto> carrito = List.of(
                new Producto("monitor", 100, 1)
        );
        assertEquals(100, Carrito.calcularSubtotal(carrito));
    }

    @Test
    void testSubtotalCarritoVacio() {
        List<Producto> carrito = List.of();
        assertEquals(0, Carrito.calcularSubtotal(carrito));
    }


    @Test
    void testDescuentoCero() {
        assertEquals(100, Carrito.aplicarDescuento(100, 0));
    }

    @Test
    void testDescuentoValido() {
        assertEquals(90, Carrito.aplicarDescuento(100, 10));
    }

    @Test
    void testDescuentoCien() {
        assertEquals(0, Carrito.aplicarDescuento(100, 100));
    }

    @Test
    void testDescuentoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            Carrito.aplicarDescuento(100, -10);
        });
    }

    @Test
    void testDescuentoMayor100() {
        assertThrows(IllegalArgumentException.class, () -> {
            Carrito.aplicarDescuento(100, 150);
        });
    }



    @Test
    void testEnvioMenor100() {
        assertEquals(5, Carrito.calcularEnvio(50));
    }

    @Test
    void testEnvioMayorIgual100() {
        assertEquals(0, Carrito.calcularEnvio(100));
        assertEquals(0, Carrito.calcularEnvio(150));
    }


    @Test
    void testTotalSinDescuento() {
        List<Producto> carrito = List.of(
                new Producto("teclado", 50, 1)
        );
        assertEquals(55, Carrito.calcularTotal(carrito, 0));
    }

    @Test
    void testTotalConDescuento() {
        List<Producto> carrito = List.of(
                new Producto("teclado", 100, 1)
        );
        assertEquals(90, Carrito.calcularTotal(carrito, 10));
    }

    @Test
    void testTotalEnvioGratis() {
        List<Producto> carrito = List.of(
                new Producto("monitor", 120, 1)
        );
        assertEquals(120, Carrito.calcularTotal(carrito, 0));
    }
}