package Aula04ChainOfResponsability01CreditoBancario;

public class Diretor extends FuncionarioBanco{

    @Override
    public void processarSolicitacao(Integer valor) {
        if (valor > 200000) {
            System.out.println("Como Diretor, sou encarregado de administrar isso.");
        } else if (this.seguinteFuncionario != null) {
            this.seguinteFuncionario.processarSolicitacao(valor);
        }

    }
}
