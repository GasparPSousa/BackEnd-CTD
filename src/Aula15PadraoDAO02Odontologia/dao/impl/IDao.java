package Aula15PadraoDAO02Odontologia.dao.impl;

import java.util.List;
import java.util.Optional;

public interface IDao<T> {

    public T salvar(T t);
    public Optional<T> buscar(Integer id);
    public void exluir(Integer id);
    public List<T> buscarTodos();
}
