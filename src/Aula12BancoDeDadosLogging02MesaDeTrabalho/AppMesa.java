package Aula12BancoDeDadosLogging02MesaDeTrabalho;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AppMesa {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS funcionarios; " +
            "CREATE TABLE funcionarios (" +
            "id INT PRIMARY KEY," +
            "nome VARCHAR(16) NOT NULL," +
            "sobrenome VARCHAR(32) NOT NULL," +
            "idade INT NOT NULL," +
            "profissao VARCHAR(32) NOT NULL," +
            "eCLT boolean NOT NULL)";

    private static final String sqlInsert01 = "INSERT INTO funcionarios " +
            "(id, nome, sobrenome, idade, profissao, eCLT) VALUES " +
            "(1, 'Zezinho', 'Bandeira', 42, 'Baterista', false), "+
            "(2, 'Mariazinha', 'Feliz', 32, 'Gerente', true), "+
            "(1, 'Salchicha', 'Scoobe', 39, 'artista', false), " +
            "(4, 'Ronaldo', 'Fenômeno', 45, 'jogador de futebol', false)";

    private static final String sqlInsert02 = "INSERT INTO funcionarios " +
            "(id, nome, sobrenome, idade, profissao, eCLT) VALUES " +
            "(1, 'Zezinho', 'Bandeira', 42, 'Baterista', false), "+
            "(2, 'Mariazinha', 'Feliz', 32, 'Gerente', true), "+
            "(3, 'Salchicha', 'Scoobe', 39, 'artista', false), " +
            "(4, 'Ronaldo', 'Fenômeno', 45, 'jogador de futebol', false)";

    private static  final String sqlDelete01 = "DELETE FROM funcionarios WHERE id = 1";
    private static  final String sqlDelete02 = "DELETE FROM funcionarios WHERE sobrenome = 'Scoobe' ";


    private static final String sqlUpdate = "UPDATE funcionarios SET profissao = 'CTO' WHERE id = 2  ";


    //  Declaração do nosso Logger
    private static final Logger logger = Logger.getLogger(AppMesa.class);


    // Método Main

    public static void main(String[] args) throws Exception{

        // Configuração do Logging
        BasicConfigurator.configure();

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);
            try {
                statement.execute(sqlInsert01);
            } catch (Exception e) {
                logger.error("Unique index or primary key violation");
            }
            statement.execute(sqlInsert02);
            statement.execute(sqlUpdate);
            logger.debug("Alterando a profissao da Mariazinha de Gerente para CTO");
            statement.execute(sqlDelete01);
            logger.info("Excluímos o usuário com id = 3");
            statement.execute(sqlDelete02);
            logger.info("Excluímos o usuário com sobrenome = 'Scoobe' ");

        }
        catch (Exception e) {

            e.printStackTrace();
        }
        finally {
            if (connection == null) {
                return;
            } else {
                connection.close();
            }
        }

    }

    public static Connection getConnection() throws Exception {

        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
    }

}
