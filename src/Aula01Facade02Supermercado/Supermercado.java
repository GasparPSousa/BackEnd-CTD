package Aula01Facade02Supermercado;

public class Supermercado {

    public static void main(String[] args) {

        //Instânciando o objeto facade da classe FacadeDesconto
        FacadeDesconto facade = new FacadeDesconto();

        Cartao cartao = new Cartao("524587985632", "Star Bank");
        Produto produto = new Produto("Feijão", "Lata");

        System.out.println("O valor do desconto será: " + facade.desconto(cartao, produto, 13));

        Cartao cartao02 = new Cartao("1234", "PagBank");
        Produto produto02 = new Produto("ventilador", "Plástico");

        System.out.println("O valor do desconto será: " + facade.desconto(cartao02, produto02, 1));
    }
}
