package view;

import model.Posto;
/**
 * @author Renan Gonçalves, Guilherme Martins, Juliano Oliveira
 * since 4/9/20
 * version 1.0 15:42pm
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("\f");
        Scanner scanner = new Scanner(System.in);

        Posto posto = new Posto();
        int codigo = 0;
        do {
            System.out.println(posto.mostrarMenu());
            System.out.println("\nDigite o código de um produto: ");
            codigo = scanner.nextInt();
            System.out.println(posto.selecionarProduto(codigo));
            System.out.println("\nDigite a quantidade em litros do produto: ");
            posto.setQuantidadeLitros(scanner.nextInt());
            System.out.println(posto.verificarCodigo(codigo));
        } while(codigo != 5);
    }
}