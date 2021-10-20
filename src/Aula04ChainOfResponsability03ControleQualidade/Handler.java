package Aula04ChainOfResponsability03ControleQualidade;

public abstract class Handler {

    private Handler seguinteManipulador;

    public Handler getSeguinte() {

        return this.seguinteManipulador;
    }

    public void setSeguinte(Handler s){

        this.seguinteManipulador = s;
    }

    public abstract void verificar(Artigo artigo);
}
