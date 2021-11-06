package Aula15PadraoDAO02Odontologia.service;

import Aula15PadraoDAO02Odontologia.dao.impl.IDao;
import Aula15PadraoDAO02Odontologia.model.Endereco;

import java.util.List;
import java.util.Optional;

public class EnderecoService {

    private IDao<Endereco> enderecoIDao;

    public EnderecoService(IDao<Endereco> enderecoIDao) {
        this.enderecoIDao = enderecoIDao;
    }

    public Endereco salvar(Endereco endereco) {
        enderecoIDao.salvar(endereco);
        return endereco;
    }

    public Optional<Endereco> buscar(Integer id) {
        return enderecoIDao.buscar(id);
    }

    public List<Endereco> buscarTodos() {
        return enderecoIDao.buscarTodos();
    }

    public void excluir(Integer id) {
        enderecoIDao.exluir(id);
    }


}
