package Aula01Facade01ECommerce;

import Aula01Facade01ECommerce.model.Cartao;
import Aula01Facade01ECommerce.model.Endereco;
import Aula01Facade01ECommerce.model.Produto;
import Aula01Facade01ECommerce.service.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("1",5, 1000, "Mouse");
        Produto produto2 = new Produto("2", 5, 3000, "Teclado");
        Cartao cartao = new Cartao("11112223334444", "012", "2025/07/09");

        Endereco endereco = new Endereco("Av Morumbi", "1500", "142800000", "Morumbi", "São Paulo");
        ICompraService compraService = new CompraService(new ArmazemService(Arrays.asList(produto1, produto2)), new PgtoService(), new EnvioService());

        compraService.processarCompra("1", 3, cartao, endereco);

    }
}
