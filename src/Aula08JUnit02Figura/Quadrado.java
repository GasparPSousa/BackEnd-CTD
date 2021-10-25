package Aula08JUnit02Figura;

public class Quadrado implements IFigura {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }
}
