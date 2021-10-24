package Aula07Flyweight01Receita;

import java.util.HashMap;

public class ComidaFactory {

    private static final HashMap<String, Comida> comidaMap = new HashMap<>();

    public static Comida getComida(String tipoComida) {
        Comida comida = (Comida) comidaMap.get(tipoComida);

        if (comida == null) {
            comida = new Comida(tipoComida);
            comidaMap.put(tipoComida, comida);
            System.out.println("Criando objeto comida de tipo: " + tipoComida);
        }

        return comida;
    }
}
