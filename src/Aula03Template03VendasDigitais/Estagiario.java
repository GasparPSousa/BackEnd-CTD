package Aula03Template03VendasDigitais;

public class Estagiario extends Vendedores{

    private int qtdVenda;

    public Estagiario(String nome, int pontos, int qtdVenda) {
        super(nome, pontos);
        this.qtdVenda = qtdVenda;
    }


    public void mostrarCategoriaEstagiario() {
        int pontos = calcularPontos();
        System.out.print(getNome());
        System.out.print(" tem um total de " + pontos + " pontos e categoriza como estagiário ");
        System.out.print(categorizarEstagiario(pontos)+".");
        System.out.println();
    }

    public String categorizarEstagiario(int pontos) {
        if (pontos < 50) {
            return "novato";
        } else {
            return "experiente";
        }
    }

    @Override
    public int calcularPontos() {
        return getPontos() + qtdVenda * 5;
    }
}
