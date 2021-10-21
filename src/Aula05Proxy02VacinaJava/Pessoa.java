package Aula05Proxy02VacinaJava;

import java.util.Date;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String RG;
    private String nomeVacina;
    private Date data;

    public Pessoa(String nome, String sobrenome, String RG, String nomeVacina, Date data) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.nomeVacina = nomeVacina;
        this.data = data;
    }

    // Objeto que contém os dados de registro da vacina: RG e data
    public Object[] dados() {
        Object[] informacao = new Object[2];
        informacao[0] = RG;
        informacao[1] = data;

        return informacao;
    }


}
