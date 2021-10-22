package Aula06Proxy05NetflixSeries;

public class Serie {

    // Informações de Serie
    private String nome;
    private String link;

    // Construtor de Serie
    public Serie(String nome, String link) {
        this.nome = nome;
        this.link = link;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
