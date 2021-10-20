package Aula04ChainOfResponsability03ControleQualidade;

public class Lote extends Handler{

    @Override
    public void verificar(Artigo artigo) {
        System.out.println("===================================");
        if(artigo.getLote() >= 1000 && artigo.getLote() <= 2000) {
            System.out.println("O lote está dentro do padrão.");
            this.getSeguinte().verificar(artigo);
        } else {
            if(this.getSeguinte() != null) {
                System.out.println("O lote está fora do padrão.");
                System.out.println(">>>>> Rejeitado!");
                System.out.println("===================================");
            }

        }
    }
}
