package model;

import interfaces.InterfaceProduto;
/**
 * @author Renan Gonçalves, Guilherme Martins, Juliano Oliveira
 * since 4/9/20
 * version 1.0 15:42pm
 */

public class Posto implements InterfaceProduto {

    private String nome;
    private double valor;
    private int quantidadeLitros;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeLitros() {
        return this.quantidadeLitros;
    }

    public void setQuantidadeLitros(int quantidade) {
        this.quantidadeLitros = quantidade;
    }

    public double calcularValorGasolina() {
        return this.valor * this.getQuantidadeLitros();
    }

    public double calcularValorAlcool() {
        return this.valor * this.getQuantidadeLitros();
    }

    public double calcularValorDiesel() {
        return this.valor * this.getQuantidadeLitros();
    }

    public double calcularValorFlex() {
        return this.valor * this.getQuantidadeLitros();
    }

    /**
     * @return Método para selecionar o produto,setando já os seus valores.
     */

    @Override
    public String selecionarProduto(int codigo) {
        switch(codigo) {
            case 1:
                this.setNome("Gasolina");
                this.setValor(4.49);
                return "\n1 > Gasolina";
            case 2:
                this.setNome("Álcool");
                this.setValor(3.68);
                return "\n2 > Álcool";
            case 3:
                this.setNome("Diesel");
                this.setValor(3.71);
                return "\n3 > Diesel";
            case 4:
                this.setNome("Flex");
                this.setValor(4.49 + 3.68);
                return "\n4 > Flex";
            case 5:
                System.exit(0);
                return null;
            default:
                return "\nNenhuma opção  válida selecionada!";
        }
    }

    /**
     * @return Método para verificar o código.
     */

    @Override
    public String verificarCodigo(int codigo){
        switch(codigo) {
            case 1:
                return "\n"+ this.selecionarProduto(codigo) + " valor final R$" + this.calcularValorGasolina();
            case 2:
                return "\n"+ this.selecionarProduto(codigo) + " valor final R$" + this.calcularValorAlcool();
            case 3:
                return "\n"+ this.selecionarProduto(codigo) + " valor final R$" + this.calcularValorDiesel();
            case 4:
                return "\n"+ this.selecionarProduto(codigo) + " valor final R$" + this.calcularValorFlex();
            default:
                return "\nOpção Inválida Selecionada!";
        }
    }

    @Override
    public String mostrarMenu() {
        return "**********MENU POSTO GASOLINA**********"
             + "\n1 > Gasolina (R$4.49)"
             + "\n2 > Álcool (R$3.68)"
             + "\n3 > Diesel (R$3,71)"
             + "\n4 > Flex (Valor Gasolina + Valor Álcool)"
             + "\n5 > Sair"
             + "\n**********MENU POSTO GASOLINA**********";
    }
}