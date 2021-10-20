package Aula04ChainOfResponsability01CreditoBancario;

public class Gerente extends FuncionarioBanco{

    @Override
    public void processarSolicitacao(Integer valor) {
        if (valor >= 60000 && valor <= 200000) {
            System.out.println("Como Gerente, sou encarregado de administrar isso.");
        } else if (this.seguinteFuncionario != null) {
            this.seguinteFuncionario.processarSolicitacao(valor);
        }
    }
}
