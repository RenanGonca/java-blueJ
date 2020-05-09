package model;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Renan
 * @version 1.0
 * @since 4/8/2020 7:40 pm
 */
class ProdutoTest {

    private Produto produto = new Produto();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        produto.setEstoqueProduto(2);
        produto.setValorProduto(4.00);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void calcularValorEstoque() {
        assertEquals(8.00, produto.calcularValorEstoque(), 0.0);
    }
}