package Aula15PadraoDAO02Odontologia.dao.impl;

import Aula15PadraoDAO02Odontologia.dao.configuracao.ConfiguracaoJDBC;
import Aula15PadraoDAO02Odontologia.model.Endereco;
import Aula15PadraoDAO02Odontologia.model.Paciente;
import Aula15PadraoDAO02Odontologia.util.Util;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PacienteDaoH2 implements IDao<Paciente> {

    private ConfiguracaoJDBC configuracaoJDBC;
    private EnderecoDaoH2 enderecoDaoH2;

    final static Logger log = Logger.getLogger(PacienteDaoH2.class);


    public PacienteDaoH2(EnderecoDaoH2 enderecoDaoH2) {
        this.configuracaoJDBC = new ConfiguracaoJDBC();
        this.enderecoDaoH2 = enderecoDaoH2;
    }


    @Override
    public Paciente salvar(Paciente paciente) {
        log.debug("Registrando paciente : " + paciente.toString());

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
        catch(SQLException throwables) {
            throwables.printStackTrace();
        }

        return paciente;


    }

    @Override
    public Optional<Paciente> buscar(Integer id) {

        log.debug("Buscando paciente com id : " + id );

        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = String.format("SELECT id, nome, sobrenome, rg, dataCadastro, enderecoId FROM paciente WHERE id = '%s'", id);
        Paciente paciente = null;

        try{
            stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            while (resultado.next()) {
                paciente = criarObjetoPaciente(resultado);
            }

            stmt.close();
            conexao.close();

        } catch(SQLException throwables) {
            throwables.printStackTrace();
        }

        return paciente != null ? Optional.of(paciente) : Optional.empty();

    }


    @Override
    public void exluir(Integer id) {

        log.debug("Excluindo paciente com id: " + id);
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = String.format("DELETE FROM paciente WHERE id = '%s'", id);

        try {
            stmt = conexao.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            conexao.close();

        } catch(SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public List<Paciente> buscarTodos() {

        log.debug("Buscando todos os pacientes.");

        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = "SELECT * FROM paciente";
        List<Paciente> pacientes = new ArrayList<>();

        try {
            stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            while(resultado.next()) {
                pacientes.add(criarObjetoPaciente(resultado));
            }
            stmt.close();
            conexao.close();

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return pacientes;
    }

    private Paciente criarObjetoPaciente(ResultSet resultado) throws SQLException{

        Integer idPaciente = resultado.getInt("id");
        String nome = resultado.getString("nome");
        String sobrenome = resultado.getString("sobrenome");
        String rg = resultado.getString("rg");
        Date dataCadastro = resultado.getDate("dataCadastro");
        Endereco endereco = enderecoDaoH2.buscar(resultado.getInt("enderecoId")).orElse(null);

        return new Paciente(idPaciente, nome, sobrenome, rg, dataCadastro, endereco);
    }

}
