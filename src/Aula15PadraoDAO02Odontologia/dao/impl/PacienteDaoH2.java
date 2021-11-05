package Aula15PadraoDAO02Odontologia.dao.impl;

import Aula15PadraoDAO02Odontologia.dao.configuracao.ConfiguracaoJDBC;
import Aula15PadraoDAO02Odontologia.model.Paciente;
import Aula15PadraoDAO02Odontologia.util.Util;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

public class PacienteDaoH2 implements IDao<PacienteDaoH2> {

    private ConfiguracaoJDBC configuracaoJDBC;

    public PacienteDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }


    @Override
    public PacienteDaoH2 salvar(Paciente paciente) {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        paciente.setEndereco(enderecoDaoH2.salvar(paciente.getEndereco()));

        String query = String.format(
                "INSERT INTO paciente (nome, sobrenome, rg, dataCadastro, endereco_id)" +
                        "VALUES ('%s', '%s', '%s', '%s', '%s')",
                paciente.getNome(),
                paciente.getSobrenome(),
                paciente.getRg(),
                Util.dateToTimestamp(),
                paciente.getEndereco();


        );
    }

    @Override
    public Optional<PacienteDaoH2> buscar(Integer id) {
        return Optional.empty();
    }

    @Override
    public void exluir(Integer id) {

    }

    @Override
    public List<PacienteDaoH2> buscarTodos() {
        return null;
    }
}
