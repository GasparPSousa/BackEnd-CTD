package Aula02Template02FastFood;

public class CardapioAdulto extends Cardapio {

    public CardapioAdulto(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void montarEmbalagem() {
        System.out.println("Montando cardápio adulto");
    }

    @Override
    public double calcularPrecoVenda() {

        return getPreco();
    }
}
