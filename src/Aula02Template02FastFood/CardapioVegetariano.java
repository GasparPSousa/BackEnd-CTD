package Aula02Template02FastFood;

public class CardapioVegetariano extends Cardapio {

    private double precoEmbagagemEspecial;
    private double sobretaxa = 1.01;


    public CardapioVegetariano(String nome, double preco, double precoEmbagagemEspecial) {
        super(nome, preco);
        this.precoEmbagagemEspecial = precoEmbagagemEspecial;

    }

    @Override
    public void montarEmbalagem() {
        System.out.println("Montando cardápio vegetariano com embalagem especial");
    }

    @Override
    public double calcularPrecoVenda() {
        return getPreco() * sobretaxa + this.precoEmbagagemEspecial;
    }
}
