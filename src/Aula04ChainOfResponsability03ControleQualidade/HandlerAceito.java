package Aula04ChainOfResponsability03ControleQualidade;

public class HandlerAceito extends Handler{
    @Override
    public void verificar(Artigo artigo) {
        System.out.println(">>>>> Aceito!");
        System.out.println("===================================");
    }
}
