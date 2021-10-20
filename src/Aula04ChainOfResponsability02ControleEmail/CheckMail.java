package Aula04ChainOfResponsability02ControleEmail;

// Essa classe vai criar a corrente de responsabilidade
public class CheckMail {

    // Primeiro elo da corrente
    Handler initial;

    public CheckMail(){
        this.initial = new DepartamentoGerencial();
        Handler tecnico = new DepartamentoTecnico();
        Handler comercial = new DepartamentoComercial();
        Handler spam = new HandlerSpam();

        initial.setSeguinte(tecnico);
        tecnico.setSeguinte(comercial);
        comercial.setSeguinte(spam);

    }

    public void verificar(Mail eMail) {
        initial.verificar(eMail);
    }

}
