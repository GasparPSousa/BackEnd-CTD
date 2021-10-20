package Aula04ChainOfResponsability03ControleQualidade;

// Essa classe vai criar a corrente de responsabilidade
public class CheckQuality {

    // Primeiro elo da corrente
    Handler initial;

    public CheckQuality() {
        this.initial = new Lote();
        Handler peso = new Peso();
        Handler embalagem = new Embalagem();
        Handler aceito = new HandlerAceito();


        initial.setSeguinte(peso);
        peso.setSeguinte(embalagem);
        embalagem.setSeguinte(aceito);


    }

    public void verificar(Artigo artigo) {

        initial.verificar(artigo);
    }
}
