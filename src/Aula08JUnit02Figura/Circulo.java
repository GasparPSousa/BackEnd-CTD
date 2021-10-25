package Aula08JUnit02Figura;

public class Circulo implements IFigura {

    private double PI = 3.14;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularPerimetro() {
        return 2 * PI * this.raio;
    }
}
