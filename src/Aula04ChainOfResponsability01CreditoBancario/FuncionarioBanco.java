package Aula04ChainOfResponsability01CreditoBancario;

public abstract class FuncionarioBanco {

    protected FuncionarioBanco seguinteFuncionario;

    public abstract void processarSolicitacao(Integer valor);

    public FuncionarioBanco setSeguinteFuncionario(FuncionarioBanco seguinteFuncionario) {
        this.seguinteFuncionario = seguinteFuncionario;
        return this;
    }
}
