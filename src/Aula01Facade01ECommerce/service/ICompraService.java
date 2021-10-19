package Aula01Facade01ECommerce.service;

import Aula01Facade01ECommerce.model.Cartao;
import Aula01Facade01ECommerce.model.Endereco;

public interface ICompraService {

    public void processarCompra(String produtoId,
                                Integer quantidade,
                                Cartao cartao,
                                Endereco endereco);
}
