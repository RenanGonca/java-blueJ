package interfaces;

import model.Produto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Renan
 * @version 1.0
 * @since 4/8/2020 7:30 pm
 */
public interface BancoArrayProdutoInterface {
    public void cadastrarProduto(Produto Produto);
    public List<Produto> buscarProdutos();
    public void excluirProduto(int index);
    public void alterarProduto(int index, Produto Produto);
    public List<Produto> filtrarProduto(Produto Produto, int filtro);
    public int verificarQuantidadeProdutos();
    public void apagarListaDeProdutos();

}