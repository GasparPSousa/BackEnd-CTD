package Aula02Template01PagamentoSalario;

public class Contratado extends Funcionario{

    private double valorHora;
    private int hora;

    public Contratado(String nome, String sobrenome, String numeroConta, double valorHora, int hora) {
        super(nome, sobrenome, numeroConta);
        this.valorHora = valorHora;
        this.hora = hora;
    }


    @Override
    public double calcularSalario() {
        return valorHora * hora;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Foi gerado um recibo digital: R$ "  + quantia);
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("Foi depositado a quantia de : R$ " + quantia);
    }
}
