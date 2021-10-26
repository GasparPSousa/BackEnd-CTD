package Aula09Flyweight04Triangulo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightFactoryTest {

    @Test
    void  getTrianguloComTamanho2() {
        Triangulo triangulo = FlyweightFactory.obterTriangulo("vermelho");
        triangulo.setTamanho(2);

        Triangulo triangulo1 = FlyweightFactory.obterTriangulo("vermelho");
        triangulo1.setTamanho(4);

        assertEquals(triangulo.getCor(), "vermelho");
        assertEquals(triangulo1.getTamanho(), 4);
        assertEquals(FlyweightFactory.trianguloMap.size() == 1, true);
    }

}