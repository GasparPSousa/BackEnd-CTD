package Aula04ChainOfResponsability02ControleEmail;

public abstract class Handler {

    // seguinteDepartamento
    protected Handler seguinteManipulador;


    public Handler getSeguinte(){
        return this.seguinteManipulador;
    }

    public void setSeguinte(Handler s) {
        this.seguinteManipulador = s;
    }

    public abstract void verificar(Mail eMail);
}
