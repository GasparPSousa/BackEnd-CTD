package Aula08JUnit02Figura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    IFigura circulo;

    @BeforeEach
      void doBefore() {
        circulo = new Circulo(2);
    }

    @Test
      void getPerimetro() {
        assertEquals(12.56, circulo.calcularPerimetro());
    }




}