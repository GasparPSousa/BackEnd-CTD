package Aula04ChainOfResponsability03ControleQualidade;

public class Embalagem extends Handler{


    @Override
    public void verificar(Artigo artigo) {


        if(artigo.getEmbalagem().equalsIgnoreCase("saudável")
                || artigo.getEmbalagem().equalsIgnoreCase("quase saudável")) {
            System.out.println("A embalagem está dentro do padrão.");
            this.getSeguinte().verificar(artigo);
        } else {
            if(this.getSeguinte() != null) {
                System.out.println("Mas a embalagem está fora do padrão.");
                System.out.println(">>>>> Rejeitado!");
                System.out.println("===================================");

            }
        }
    }
}
