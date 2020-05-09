package model;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Renan Gonçalves
 * @version 1.0
 * @since 4/8/20 4:54 pm
 */
class AlgoritmoTest {

        private Algoritmo algoritmo = new Algoritmo();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        algoritmo.setX1(-3);
        algoritmo.setX2(2);
        algoritmo.setY1(-11);
        algoritmo.setY2(1);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void calcularDistanciaDoisPontos() {
        assertEquals(13, algoritmo.calcularDistanciaDoisPontos(), 0.0);
    }
}