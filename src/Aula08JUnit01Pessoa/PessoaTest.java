package Aula08JUnit01Pessoa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa0, pessoa1, pessoa2;


    @BeforeEach
    void doBefore() {
        pessoa0 = new Pessoa("Gaspar", "Sousa");
        pessoa0.setIdade(LocalDate.of(1990, 6, 23));

        pessoa1 = new Pessoa("Nathália", "Vieira");
        pessoa0.setIdade(LocalDate.of(1990, 10, 3));

        pessoa2 = new Pessoa("Caio", "Castro");
        pessoa0.setIdade(LocalDate.of(1978, 5, 4));

    }

    @Test
    void getNomeCompleto() {
        assertEquals("Gaspar, Sousa", pessoa0.calcularNomeCompleto());
        assertEquals("Nathália, Vieira", pessoa1.calcularNomeCompleto());
        assertEquals("Caio, Castro", pessoa2.calcularNomeCompleto());
    }

    @Test
    void getEMaiorDe18() {
        assertTrue(pessoa0.eMaiorDeIdade());
        assertTrue(pessoa1.eMaiorDeIdade());
        assertTrue(pessoa2.eMaiorDeIdade());
    }






}