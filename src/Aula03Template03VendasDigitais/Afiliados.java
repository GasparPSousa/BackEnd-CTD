package Aula03Template03VendasDigitais;

public class Afiliados extends Vendedores{

    private int qtdVenda;


    public Afiliados(String nome, int pontos, int qtdVenda) {
        super(nome, pontos);
        this.qtdVenda = qtdVenda;
    }

    @Override
    public int calcularPontos() {
        return getPontos() + qtdVenda * 15;
    }




}
