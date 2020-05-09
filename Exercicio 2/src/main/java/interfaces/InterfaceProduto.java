package interfaces;

/**
 * @author Renan Gonçalves, Guilherme Martins, Juliano Oliveira
 * since 4/9/20
 * version 1.0 15:42pm
 */
public interface InterfaceProduto {

    public String verificarCodigo(int codigo);
    public String selecionarProduto(int codigo);
    public String mostrarMenu();
}