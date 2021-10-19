package Aula02Template02FastFood;

public class Main {

    public static void main(String[] args) {

        Cardapio cardapio = new CardapioAdulto("Ribs on the barbie", 500);
        cardapio.prepararMenu();

        cardapio = new CardapioInfantil("pipoca",90, 10);
        cardapio.prepararMenu();

        cardapio = new CardapioVegetariano("salada", 200, 60 );
        cardapio.prepararMenu();
    }
}
