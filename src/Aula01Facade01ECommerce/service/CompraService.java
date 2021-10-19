package Aula01Facade01ECommerce.service;

import Aula01Facade01ECommerce.model.Cartao;
import Aula01Facade01ECommerce.model.Endereco;
import Aula01Facade01ECommerce.model.Produto;

import java.util.Arrays;

// Classe Facade
public class CompraService implements ICompraService{

    private ArmazemService armazemService;
    private PgtoService pgtoService;
    private EnvioService envioService;

    public CompraService(ArmazemService armazemService, PgtoService pgtoService, EnvioService envioService) {
        this.armazemService = armazemService;
        this.pgtoService = pgtoService;
        this.envioService = envioService;
    }

    @Override
    public void processarCompra(String produtoId, Integer quantidade, Cartao cartao, Endereco endereco) {
        Produto produto = armazemService.buscarProduto(produtoId, quantidade);
        if(produto != null) {
            // Se temos o produto, processamos o pagamento
            if(pgtoService.processarPgto(cartao, String.valueOf(produto.getValor() * quantidade))) {
                envioService.processarEnvio(Arrays.asList(produto), endereco);
            }
        }
    }



}
