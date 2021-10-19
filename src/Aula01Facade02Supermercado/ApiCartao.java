package Aula01Facade02Supermercado;

public class ApiCartao {

    public int desconto(Cartao cartao) {

        if(cartao.getBanco().compareTo("Star Bank") == 0) {
            return 20;
        } else {
            return 0;
        }
    }
}
