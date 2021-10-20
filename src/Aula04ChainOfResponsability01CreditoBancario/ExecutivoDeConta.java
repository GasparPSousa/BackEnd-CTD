package Aula04ChainOfResponsability01CreditoBancario;

public class ExecutivoDeConta extends FuncionarioBanco{

    @Override
    public void processarSolicitacao(Integer valor) {
        if (valor < 60000) {
            System.out.println("Como Executivo, sou encarregado de administrar isso.");
        } else if (this.seguinteFuncionario != null) {
            this.seguinteFuncionario.processarSolicitacao(valor);
        }
    }
}
