package com.tienda;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CarritoTest {

    CarritoService service = new CarritoService();

    // ---------------- SUBTOTAL ----------------

    @Test
    void testSubtotalVariosProductos() {
        List<Producto> carrito = List.of(
                new Producto("teclado", 30, 2),
                new Producto("raton", 10, 1)
        );

        assertEquals(70, service.calcularSubtotal(carrito));
    }

    @Test
    void testSubtotalUnProducto() {
        List<Producto> carrito = List.of(
                new Producto("monitor", 100, 1));

        assertEquals(100, service.calcularSubtotal(carrito));
    }

    @Test
    void testSubtotalCarritoVacio() {
        List<Producto> carrito = List.of();

        assertEquals(0, service.calcularSubtotal(carrito));
    }

    // ---------------- DESCUENTOS ----------------

    @Test
    void testDescuento0() {
        assertEquals(100, service.aplicarDescuento(100, 0));
    }

    @Test
    void testDescuentoValido() {
        assertEquals(90, service.aplicarDescuento(100, 10));
    }

    @Test
    void testDescuento100() {
        assertEquals(0, service.aplicarDescuento(100, 100));
    }

    @Test
    void testDescuentoInvalidoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> service.aplicarDescuento(100, -10));
    }

    @Test
    void testDescuentoInvalidoMayor100() {
        assertThrows(IllegalArgumentException.class, () -> service.aplicarDescuento(100, 150));
    }

    // ---------------- ENVÍO ----------------

    @Test
    void testEnvioMenor100() {
        assertEquals(5, service.calcularEnvio(50));
    }

    @Test
    void testEnvioMayor100() {
        assertEquals(0, service.calcularEnvio(150));
    }

    @Test
    void testEnvioJusto100() {
        assertEquals(0, service.calcularEnvio(100));
    }

    @Test
    void testTotalSinDescuento() {
        List<Producto> carrito = List.of(
                new Producto("teclado", 50, 1)
        );
        assertEquals(55, service.calcularTotal(carrito, 0));
    }

    @Test
    void testTotalConDescuento() {
        List<Producto> carrito = List.of(
                new Producto("teclado", 100, 1));

        assertEquals(95, service.calcularTotal(carrito, 10));
    }

    @Test
    void testTotalConEnvioGratis() {
        List<Producto> carrito = List.of(
                new Producto("teclado", 200, 1));
        assertEquals(200, service.calcularTotal(carrito, 0));
    }
}