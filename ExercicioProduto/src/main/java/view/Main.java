package view;

import DAO.BancoArrayProduto;
import model.Produto;

import java.util.List;
import java.util.Scanner;

/**
 * @author Renan
 * @version 1.0
 * @since 4/8/2020 7:44 pm
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao sistema!");

        Scanner scanner = new Scanner(System.in);
        BancoArrayProduto produtos = new BancoArrayProduto();
        int opcao = 0;
        Produto produto = null;
        do {
            System.out.println("1-Cadastrar produto \n2-Procurar produto \n3-Deletar produto \n4-Filtrar produto por nome  \n5-Filtro por quantidade em estoque \n6-Verificar quantidade de produtos \n7-Limpar lista de produtos \n999-Sair");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    produto = new Produto();
                    System.out.println("Digite o nome do produto: ");
                    produto.setNomeProduto(scanner.next());
                    System.out.println("Digite a quantidade em estoque do produto");
                    produto.setEstoqueProduto(scanner.nextInt());
                    System.out.println("Digite o valor do produto");
                    produto.setValorProduto(scanner.nextDouble());
                    produtos.cadastrarProduto(produto);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    List<Produto> produtoss = produtos.buscarProdutos();

                    if(produtoss.isEmpty()) {
                        System.out.println("Não há produto(s)!");
                    } else {
                        for (Produto produtoAuxiliar : produtoss) {
                            System.out.println(produtoAuxiliar.toString());
                        }
                    }
                    break;

                case 3:
                    produto = new Produto();
                    System.out.println("Digite qual posição deseja excluir: ");
                    produtos.excluirProduto(scanner.nextInt());
                    System.out.println("Produto excluido com sucesso!");
                    break;

                case 4:
                    produto = new Produto();
                    System.out.println("Digite o nome do produto: ");
                    produto.setNomeProduto(scanner.next());
                    List<Produto> produtosFiltrados = produtos.filtrarProduto(produto, 1);
                    if(produtosFiltrados.size() == 0) {
                        System.out.println("Nenhum produto encontrado");
                    } else {
                        for(Produto produtoAuxiliar : produtosFiltrados) {
                            System.out.println(produtoAuxiliar.toString());
                        }
//                    System.out.println(produtosFiltrados.size() != 0 ? produto.toString() : "Produto não encontrado!");
                    }
                    break;

                case 5:
                    produto = new Produto();
                    List<Produto> produtosFiltradosPorEstoque = produtos.filtrarProduto(produto, 2);
                    if(produtosFiltradosPorEstoque.size() == 0) {
                        System.out.println("Nenhum produto encontrado");
                    } else {
                        for(Produto produtoAuxiliar : produtosFiltradosPorEstoque) {
                            System.out.println(produtoAuxiliar.toString());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Quantidade de produtos " + produtos.verificarQuantidadeProdutos() + " produto(s).");
                    break;

                case 7:
                    produtos.apagarListaDeProdutos();
                    System.out.println("Sua agenda foi apagada!");
                    break;

                case 999: System.exit(0);
                    break;

                default: System.exit(0);
                    break;
            }

        } while(opcao != 999);
    }
}