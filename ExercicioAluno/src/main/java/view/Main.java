package view;

/**
 * @author Renan Gonçalves
 * since 4/9/20
 * @version 1.0
 */
import model.Aluno;

import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        System.out.println("\f");
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.println("Digite seu nome: ");
        aluno.setNome(scanner.nextLine());
        System.out.println("Digite seu Nota 1: ");
        aluno.setNota1(scanner.nextDouble());
        System.out.println("Digite seu Nota 2: ");
        aluno.setNota2(scanner.nextDouble());
        System.out.println("Digite seu Nota 3: ");
        aluno.setNota3(scanner.nextDouble());
        System.out.println("Média do Aluno: ");
        System.out.println(aluno.calcularMedia());
        System.out.println(aluno);
    }
}
