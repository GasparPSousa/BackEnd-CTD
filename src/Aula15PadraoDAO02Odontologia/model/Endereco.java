package Aula15PadraoDAO02Odontologia.model;

public class Endereco {

    private Integer id;
    private Integer rua;
    private Integer numero;
    private Integer bairro;
    private Integer cidade;

    // Construtor com todos os parâmetros
    public Endereco(Integer id, Integer rua, Integer numero, Integer bairro, Integer cidade) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Endereco(Integer rua, Integer numero, Integer bairro, Integer cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRua() {
        return rua;
    }

    public void setRua(Integer rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getBairro() {
        return bairro;
    }

    public void setBairro(Integer bairro) {
        this.bairro = bairro;
    }

    public Integer getCidade() {
        return cidade;
    }

    public void setCidade(Integer cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", rua=" + rua +
                ", numero=" + numero +
                ", bairro=" + bairro +
                ", cidade=" + cidade +
                '}';
    }
}
