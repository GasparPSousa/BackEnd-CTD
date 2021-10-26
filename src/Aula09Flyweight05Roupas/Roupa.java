package Aula09Flyweight05Roupas;

public class Roupa {

    private String tipo;
    private String tamanho;
    private boolean eNovo;
    private boolean importado;

    public Roupa(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean iseNovo() {
        return eNovo;
    }

    public void seteNovo(boolean eNovo) {
        this.eNovo = eNovo;
    }

    public boolean isImportado() {
        return importado;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }
}
