package Aula04ChainOfResponsability03ControleQualidade;

public class Main {

    public static void main(String[] args) {

        CheckQuality check = new CheckQuality();

        check.verificar(new Artigo("aspirina", 1500, 1250, "saudável"));
        System.out.println();

        check.verificar(new Artigo("aspirina", 900, 1250, "saudável"));
        System.out.println();

        check.verificar(new Artigo("aspirina", 1200, 950, "saudável"));
        System.out.println();

        check.verificar(new Artigo("aspirina", 1200, 1250, "testando"));
        System.out.println();

        check.verificar(new Artigo("aspirina", 1200, 1250, "quase saudável"));
        System.out.println();



    }
}
