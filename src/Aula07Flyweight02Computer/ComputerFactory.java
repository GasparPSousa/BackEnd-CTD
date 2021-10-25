package Aula07Flyweight02Computer;

import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {

    private static Map<String, Computer> mapFlyweight = new HashMap<>();

    public Computer getComputer(int ram, int disco) {
        String id = "id: " + ram + ":" + disco;
        System.out.println(id);

        if(!mapFlyweight.containsKey(id)) {
            mapFlyweight.put(id, new Computer(ram, disco));
            System.out.println("PC foi criado");
            return mapFlyweight.get(id);

        }

        System.out.println("PC foi obtido");
        return mapFlyweight.get(id);

     }
}
