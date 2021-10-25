package Aula08JUnit02Figura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    IFigura quadrado;

    @BeforeEach
    void doBefore() {
        quadrado = new Quadrado(2);
    }

    @Test
    void getPerimetro() {
        assertEquals(8.0, quadrado.calcularPerimetro());
    }

}