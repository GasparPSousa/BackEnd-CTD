package Aula01Facade01ECommerce.service;

import Aula01Facade01ECommerce.model.Cartao;

public class PgtoService {

    public Boolean processarPgto(Cartao cartao, String quantiaACobrar){
        Boolean pgtoRealizado = Boolean.FALSE;
        if(cartao != null && cartao.getNumerosFrente() != null && cartao.getCodSeguranca() != null)
            System.out.println("Processando o pagamento por "+ quantiaACobrar);
        pgtoRealizado = Boolean.TRUE;


        return pgtoRealizado;


    }
}
