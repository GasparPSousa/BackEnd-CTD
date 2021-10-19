package Aula02Template01PagamentoSalario;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Efetivo("Nelson", "Kobayashi", "1234567890", 6000.0, 850, 2500);
        funcionario.pagamentSalario();

        //Usando o mesmo objeto e instanciando com um novo Construtor
        funcionario = new Contratado("Jennifer", "Mayumi", "0987654321", 350, 150);
        funcionario.pagamentSalario();

    }
}
