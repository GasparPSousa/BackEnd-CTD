package Aula03Template03VendasDigitais;

public class Funcionarios extends Vendedores{

    private int qtdAfiliado;
    private int qtdVenda;
    private int qtdAnos;

    public Funcionarios(String nome, int pontos, int qtdAfiliado, int qtdVenda, int qtdAnos) {
        super(nome, pontos);
        this.qtdAfiliado = qtdAfiliado;
        this.qtdVenda = qtdVenda;
        this.qtdAnos = qtdAnos;
    }

    @Override
    public int calcularPontos() {
        return getPontos() + qtdAfiliado * 10 + qtdVenda * 5 + qtdAnos * 5;
    }




}
