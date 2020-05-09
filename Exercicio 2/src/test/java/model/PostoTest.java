package model;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Renan Gonçalves, Guilherme Martins, Juliano Oliveira
 * since 4/9/20
 * version 1.0 15:42pm
 */
class PostoTest {

    private Posto posto = new Posto();

    public PostoTest() {
        posto.setQuantidadeLitros(1);
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

    }

    @org.junit.jupiter.api.Test
    void calcularValorGasolina() {
        posto.setValor(4.49);
        assertEquals(4.49, posto.calcularValorGasolina(), 0.0);
        }

    @org.junit.jupiter.api.Test
    void calcularValorAlcool() {
        posto.setValor(3.68);
        assertEquals(3.68, posto.calcularValorAlcool(), 0.0);
    }

    @org.junit.jupiter.api.Test
    void calcularValorDiesel() {
        posto.setValor(3.71);
        assertEquals(3.71, posto.calcularValorDiesel(), 0.0);
    }

    @org.junit.jupiter.api.Test
    void calcularValorFlex() {
        posto.setValor(4.49 + 3.68);
        assertEquals((4.49 + 3.68), posto.calcularValorFlex(), 0.0);
    }

    @org.junit.jupiter.api.Test
    void selecionarProduto() {
        posto.setNome("Gasolina");
        posto.setValor(4.49);
       assertEquals("\n1 > Gasolina", posto.selecionarProduto(1));
        posto.setNome("Álcool");
        posto.setValor(3.68);
        assertEquals("\n2 > Álcool", posto.selecionarProduto(2));
        posto.setNome("Diesel");
        posto.setValor(3.71);
        assertEquals("\n3 > Diesel", posto.selecionarProduto(3));
        posto.setNome("Flex");
        posto.setValor(4.49 + 3.68);
        assertEquals("\n4 > Flex", posto.selecionarProduto(4));
        assertEquals("\nNenhuma opção  válida selecionada!", posto.selecionarProduto(0));

    }

    @org.junit.jupiter.api.Test
    void verificarCodigo() {
        assertEquals("\nOpção Inválida Selecionada!", posto.verificarCodigo(0));
        assertEquals("\n" + posto.selecionarProduto(1) + " valor final R$" + posto.calcularValorGasolina(), posto.verificarCodigo(1));
        assertEquals("\n" + posto.selecionarProduto(2) + " valor final R$" + posto.calcularValorAlcool(), posto.verificarCodigo(2));
        assertEquals("\n" + posto.selecionarProduto(3) + " valor final R$" + posto.calcularValorDiesel(), posto.verificarCodigo(3));
        assertEquals("\n" + posto.selecionarProduto(4) + " valor final R$" + posto.calcularValorFlex(), posto.verificarCodigo(4));
    }

}