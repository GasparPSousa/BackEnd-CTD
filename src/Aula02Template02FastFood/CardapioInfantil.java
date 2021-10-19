package Aula02Template02FastFood;

public class CardapioInfantil extends Cardapio {


    private double custoAdicional;

    public CardapioInfantil(String nome, double preco, double custoAdicional) {
        super(nome, preco);
        this.custoAdicional = custoAdicional;
    }

    @Override
    public void montarEmbalagem() {
        System.out.println("Montando cardápio Infantil com presente surpresa");
    }

    @Override
    public double calcularPrecoVenda() {

        return getPreco() +  this.custoAdicional;
    }
}
