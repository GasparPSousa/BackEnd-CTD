package Aula15PadraoDAO02Odontologia.dao.impl;

import Aula15PadraoDAO02Odontologia.dao.configuracao.ConfiguracaoJDBC;
import Aula15PadraoDAO02Odontologia.model.Endereco;
import Aula15PadraoDAO02Odontologia.model.Paciente;
import Aula15PadraoDAO02Odontologia.util.Util;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class PacienteDaoH2 implements IDao<Paciente> {

    private ConfiguracaoJDBC configuracaoJDBC;
    private IDao<Endereco> enderecoDaoH2;


    public PacienteDaoH2(ConfiguracaoJDBC configuracaoJDBC) {

        this.configuracaoJDBC = configuracaoJDBC;
    }


    @Override
    public Paciente salvar(Paciente paciente) {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        paciente.setEndereco(enderecoDaoH2.salvar(paciente.getEndereco()));

        String query = String.format(
                "INSERT INTO paciente (nome, sobrenome, rg, dataCadastro, endereco_id)" +
                        "VALUES ('%s', '%s', '%s', '%s', '%s')",
                paciente.getNome(),
                paciente.getSobrenome(),
                paciente.getRg(),
                Util.dateToTimestamp((Date) paciente.getDataCadastro()),
                paciente.getEndereco().getId()
        );

        try{
            stmt = conexao.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stmt.getGeneratedKeys();
            if(keys.next()) {
                paciente.setId(keys.getInt(1));
            }
            stmt.close();
            conexao.close();

        }
        catch(SQLException e) {
            e.printStackTrace();
        }

        return paciente;


    }

    @Override
    public Optional<Paciente> buscar(Integer id) {
        return Optional.empty();
    }

    @Override
    public void exluir(Integer id) {

    }

    @Override
    public List<Paciente> buscarTodos() {
        return null;
    }
}
