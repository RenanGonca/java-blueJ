package model;

import abstracts.Escola;

/**
 * @author Renan Gonçalves
 * since 4/9/20
 * @version 1.0
 */
public class Aluno extends Escola {

    public double calcularMedia() {
        return (this.getNota1() + this.getNota2() + this.getNota3()) / 3;
    }

    public String verConceito() {
        if(calcularMedia() >= 9 && calcularMedia() <= 10) {
            return "Aprovado, Conceito A";
        } else if(calcularMedia() >= 7 && calcularMedia() <= 8.9) {
            return "Aprovado, Conceito B";
        } else if(calcularMedia() >= 5 && calcularMedia() <= 6.9) {
            return "Reprovado, Conceito C";
        } else {
            return "Reprovado, Conceito D";
        }
    }

    @Override
    public String toString() {
        return "\nAluno: " + this.getNome()
                + "\nNota 1: " + this.getNota1()
                + "\nNota 2: " + this.getNota2()
                + "\nNota 3: " + this.getNota3()
                + "\nVer Média Aritmética: " + this.calcularMedia()
                + "\nConceito do Aluno: " + this.verConceito();
    }
}