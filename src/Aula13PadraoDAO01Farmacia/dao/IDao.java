package Aula13PadraoDAO01Farmacia.dao;

public interface IDao <T> {

    public T salvar(T t);
    public T buscar(Integer id);

}
