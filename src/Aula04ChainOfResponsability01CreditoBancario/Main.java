package Aula04ChainOfResponsability01CreditoBancario;

public class Main {

    public static void main(String[] args) {

        FuncionarioBanco handleBase = new ExecutivoDeConta().setSeguinteFuncionario(new Gerente().setSeguinteFuncionario(new Diretor()));
        handleBase.processarSolicitacao(500000);
    }
}
