package com.ejemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 * Clase con las pruebas/test para probar la seguridad del codigo
 * @author jhdezprez
 * @version 1.0.0
 */
public class CalculadoraNotasTest {
    
    @Test
    void testMediaSimple() {
        assertEquals(7.0, CalculadoraNotas.calcularMedia(new int[]{6, 7, 8}));
    }
    
    @Test
    void testMediaDecimal() {
        assertEquals(8.5, CalculadoraNotas.calcularMedia(new int[]{10, 9, 8, 7}));
    }
    
    @Test
    void testVacia() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraNotas.calcularMedia(new int[]{});
        });
    }
    
    @Test
    void testFueraDeRango() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraNotas.calcularMedia(new int[]{5, 12, 8});
        });
    }
}
