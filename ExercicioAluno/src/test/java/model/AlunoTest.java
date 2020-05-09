package model;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Renan Gonçalves
 * since 4/9/20
 * @version 1.0
 */
class AlunoTest {

    private Aluno aluno = new Aluno();

    public AlunoTest() {
        aluno.setNota1(10);
        aluno.setNota2(10);
        aluno.setNota3(10);
    }
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
        public void testcalcularMedia() {
        assertEquals(10.0, aluno.calcularMedia(), 0.0);
    }

    @org.junit.jupiter.api.Test
    public void testverConceito() {
        assertEquals("Aprovado, Conceito A", aluno.verConceito());
        aluno.setNota1(8);
        aluno.setNota2(8);
        aluno.setNota3(8);
        assertEquals("Aprovado, Conceito B", aluno.verConceito());
        aluno.setNota1(6);
        aluno.setNota2(6);
        aluno.setNota3(6);
        assertEquals("Reprovado, Conceito C", aluno.verConceito());
        aluno.setNota1(1);
        aluno.setNota2(1);
        aluno.setNota3(1);
        assertEquals("Reprovado, Conceito D", aluno.verConceito());
    }
}