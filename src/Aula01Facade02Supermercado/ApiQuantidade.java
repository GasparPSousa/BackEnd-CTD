package Aula01Facade02Supermercado;

public class ApiQuantidade {

    public int desconto(int quantidade) {
        if (quantidade > 12) {
            return 15;
        } else {
            return 0;
        }
    }
}
