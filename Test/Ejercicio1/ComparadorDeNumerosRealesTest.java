package Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ComparadorDeNumerosRealesTest {
    @Test
    void testComparar() {
        int a = 5;
        int b = 3;
        ComparadorDeNumerosReales comparador = new ComparadorDeNumerosReales(a, b);
        if (a > b) {
            assertEquals(a, comparador.comparar());
        } else {
            assertEquals(b, comparador.comparar());
        }
    }

}
