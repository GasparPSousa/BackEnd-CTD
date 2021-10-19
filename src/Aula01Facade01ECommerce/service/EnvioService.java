package Aula01Facade01ECommerce.service;

import Aula01Facade01ECommerce.model.Endereco;
import Aula01Facade01ECommerce.model.Produto;

import java.util.List;

public class EnvioService {

    public void processarEnvio(List<Produto> produtos, Endereco endereco){
        System.out.println("Enviando produtos a " + endereco.getRua() +" "+ endereco.getNro() +","+ endereco.getBairro());
    }
}
