package Aula07Flyweight01Receita;

public class Comida {

    private String tipoComida;
    private int preco;
    private boolean temAlface;

    public Comida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public boolean isTemAlface() {
        return temAlface;
    }

    public void setTemAlface(boolean temAlface) {
        this.temAlface = temAlface;
    }

    public void descricaoDaComida() {
        System.out.println("É um/uma " + getTipoComida() + " que custa R$" + getPreco() + ",00 reais.");
    }

    @Override
    public String toString() {
        return "Comida [tipoComida=" + tipoComida + ", preco=" + preco + ", temAlface=" + temAlface + ']';
    }
}
