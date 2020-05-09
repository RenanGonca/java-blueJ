package DAO;

import interfaces.BancoArrayProdutoInterface;
import model.Produto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Renan
 * @version 1.0
 * @since 4/8/2020 7:33 pm
 */
public class BancoArrayProduto implements BancoArrayProdutoInterface {

    private List<Produto> produtos;

    public BancoArrayProduto() {
        this.produtos = new ArrayList<>();
    }

    /**
     * Metodo para cadastrar produto.
     * @param produto Produto- nome para dar ao produto.
     */
   @Override
    public void cadastrarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    /**
     * @return Meotodo busca produto.
     */
    @Override
    public List<Produto> buscarProdutos() {
        return this.produtos;
    }

    /**
     *  Metodo para remover produto.
     * @param index Index- posição do produto no array.
     */
    @Override
    public void excluirProduto(int index) {
        this.produtos.remove(index);
    }

    /**
     * Metodo para alterar dados de uma posição ou mais no array produto.
     * @param index Index- posição do produto no array.
     * @param produto Produto- nome do produto.
     */
    @Override
    public void alterarProduto(int index, Produto produto) {
        this.produtos.add(index, produto);
    }

    /**
     * @param produto Produto- nome do produto no array.
     * @param filtro Filtro- opção para filtrar array.
     * @return Metodo para filtragem de produtos por nome ou estoque.
     */
    @Override
    public List<Produto> filtrarProduto(Produto produto, int filtro) {
        List<Produto> produtosFiltrados = new ArrayList<Produto>();
        switch(filtro) {
            case 1:
                for (Produto produtoAuxiliar : this.produtos) {
                    if(produtoAuxiliar.getNomeProduto().contains(produto.getNomeProduto())) {
                        produtosFiltrados.add(produtoAuxiliar);
//                        System.out.println("Nome do produto: " + produtoAuxiliar.getNomeProduto() + " ");
                    }
                }
                break;

            case 2:
                for(Produto produtoAuxiliar : this.produtos) {
                    if(produtoAuxiliar.getEstoqueProduto() > 0) {
                        produtosFiltrados.add(produtoAuxiliar);
                    }
                }
                break;
        }
        return produtosFiltrados;
    }

    /**
     * @return Retorna quantidade de produtos no array.
     */
    @Override
    public int verificarQuantidadeProdutos() {
        return this.produtos.size();
    }

    /**
     * Metodo para limpar lista de produtos.
     */
    @Override
    public void apagarListaDeProdutos() {
        this.produtos.clear();
    }
}