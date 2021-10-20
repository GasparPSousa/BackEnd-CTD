package Aula04ChainOfResponsability03ControleQualidade;

public class Peso extends Handler{


    @Override
    public void verificar(Artigo artigo) {
        if(artigo.getPeso() >= 1200 && artigo.getPeso() <= 1300) {
            System.out.println("O peso está dentro do padrão.");
            this.getSeguinte().verificar(artigo);
        } else {
            if(this.getSeguinte() != null) {
                System.out.println("Mas o peso está fora do padrão.");
                System.out.println(">>>>> Rejeitado!");
                System.out.println("===================================");

            }
        }
    }
}
