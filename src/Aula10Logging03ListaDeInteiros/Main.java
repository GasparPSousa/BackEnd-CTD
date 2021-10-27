package Aula10Logging03ListaDeInteiros;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;


public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();

        ListaDeInteiros lista01 = new ListaDeInteiros(1, 2, 3, 4, 5, 6);
        ListaDeInteiros lista02 = new ListaDeInteiros(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        ListaDeInteiros lista03 = new ListaDeInteiros();



        try {
            lista01.verificarLista();
        } catch (Exception e) {
            logger.error("A lista não tem números", e);
        }

        try {
            System.out.println("A média da lista é: " + lista01.calcularMedia());
        } catch (Exception e) {
            logger.error("A lista não tem números", e);
        }



        try {
            lista02.verificarLista();
        } catch (Exception e) {
            logger.error("A lista não tem números", e);
        }

        try {
            System.out.println("A média da lista é: " + lista02.calcularMedia());
        } catch (Exception e) {
            logger.error("A lista não tem números", e);
        }



        try {
            lista03.verificarLista();
        } catch (Exception e) {
            logger.error("A lista não tem números", e);
        }

        try {
            lista03.calcularMedia();
        } catch (Exception e) {
            logger.error("A lista não tem números", e);
        }





















    }
}
