package Aula07Flyweight01Receita;

public class Cliente {

    public static void main(String[] args) {

        ComidaFactory comida = new ComidaFactory();

        Comida feijoada = comida.getComida("feijoada");
        feijoada.setPreco(200);

        Comida salmao = comida.getComida("salmao");
        salmao.setPreco(150);

        System.out.println(feijoada.toString());
        System.out.println(salmao.toString());


        Comida carne = new Comida("carne");
        Comida pizza = new Comida("pizza");


        carne.setPreco(60);
        carne.setTemAlface(false);
        carne.descricaoDaComida();

        pizza.setPreco(90);
        pizza.setTemAlface(true);
        pizza.descricaoDaComida();

        System.out.println(carne.getTipoComida());
        System.out.println(carne.getPreco());
        System.out.println(carne.isTemAlface());
        System.out.println(feijoada.getTipoComida());








    }
}
