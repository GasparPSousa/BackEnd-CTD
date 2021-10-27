package Aula10Logging03ListaDeInteiros;


import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;


public class ListaDeInteiros {

    private static final Logger logger = Logger.getLogger(ListaDeInteiros.class);

    private List<Integer> listaDeInteiros = new ArrayList<>();


    public ListaDeInteiros(Integer ...inteiros) {
        for(int i = 0; i < inteiros.length; i++) {
            listaDeInteiros.add(inteiros[i]);
        }
    }

    public void verificarLista() throws Exception{
        if(listaDeInteiros.size() > 5  && listaDeInteiros.size() < 10) {
            logger.info("O comprimento da lista é maior que 5");
        }

        if (listaDeInteiros.size() > 10) {
            logger.info("O comprimento da lista é maior que 10");
        }

        if (listaDeInteiros.size() == 0) {
            logger.error("A lista é igual a zero");
            throw new Exception();
        }

    }

    public double calcularMedia() {
        double soma = 0;
        for(int i= 0; i < listaDeInteiros.size(); i++) {
            soma = soma + listaDeInteiros.get(i);
        }
        return soma / listaDeInteiros.size();
    }


}
