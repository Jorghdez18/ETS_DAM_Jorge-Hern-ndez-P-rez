

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.docencia.CalculadoraNotas;

public class CalculadoraNotasTest {


    @Test
    void testMediaNormal() {
        assertEquals(6.0, CalculadoraNotas.calcularMedia(new int[]{4, 6, 8}), 0.0001);
    }

    @Test
    void testMediaSimple() {
        assertEquals(9.0, CalculadoraNotas.calcularMedia(new int[]{9, 9, 9}), 0.0001);
    }


    @Test
    void testUnaNota() {
        assertEquals(7.0, CalculadoraNotas.calcularMedia(new int[]{7}), 0.0001);
    }


    @Test
    void testListaVacia() {
        assertThrows(IllegalArgumentException.class,
                () -> CalculadoraNotas.calcularMedia(new int[]{}));
    }

    @Test
    void testNotaInvalida() {
        assertThrows(IllegalArgumentException.class,
                () -> CalculadoraNotas.calcularMedia(new int[]{5, 12}));
    }
}