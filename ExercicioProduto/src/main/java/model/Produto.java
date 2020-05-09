package model;

/**
 * @author Renan
 * @version 1.0
 * @since 4/8/2020 6:00 pm
 */
public class Produto {

    private String nomeProduto;
    private int estoqueProduto;
    private double valorProduto;

    public Produto() {
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getEstoqueProduto() {
        return estoqueProduto;
    }

    public void setEstoqueProduto(int estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    /**
     * @return Retorna valor estoque do produto.
     */
    public double calcularValorEstoque() {
        return this.estoqueProduto * this.valorProduto;
    }

    @Override
    public String toString() {
        return  "\nProduto: " + this.nomeProduto
                + "\nEstoque do produto: " + this.estoqueProduto
                + "\nValor estoque do produto: " + this.calcularValorEstoque();
    }
}