package Aula10Logging02Exemplo02;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();

        Leao leao = new Leao();
        leao.setIdade(4);
        leao.setNome("Gaspar");
        leao.seteAlfa(true);
        leao.correr();

        try {
            leao.eMaiorQue10();
        } catch (Exception e) {
            logger.error("A idade do Leão " + leao.getNome() + " está incorreta", e);
        }

        Leao leao2 = new Leao();
        leao2.setNome("Bom");
        leao2.seteAlfa(false);
        leao.setIdade(-5);
        leao2.correr();

        try {
            leao.eMaiorQue10();
        } catch (Exception e) {
            logger.error("A idade do Leão " + leao2.getNome() + " está incorreta", e);
        }

    }
}
