package Aula09Flyweight04Triangulo;

public class Triangulo {

    private String cor;
    private int tamanho;

    public Triangulo(String cor) {
        this.cor = cor;

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
