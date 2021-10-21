package Aula05Proxy03Spotify;

public class Usuario {

    private String nome;
    private String identificador;
    private String tipoDeUsuario;

    public Usuario(String nome, String identificador, String tipoDeUsuario) {
        this.nome = nome;
        this.identificador = identificador;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }
}
