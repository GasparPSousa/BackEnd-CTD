package Aula11BancoDeDados02Exemplo;

import java.sql.*;

public class App {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS animal; " +
            "CREATE TABLE animal (id INT AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(32), tipo VARCHAR(16))";

    private static final String sqlInsert = "INSERT INTO animal (nome, tipo) " +
            "VALUES ('Meg', 'Cachorro'), ('Mingau', 'Gato'), ('Dumbo', 'Elefante'), " +
            "('Pup', 'Cachorro'), ('Pé de Pano', 'Cavalo')";

//    private static final String sqlInsert2 = "INSERT INTO animal (nome, tipo) " +
//            "VALUES ('Mingau', 'Gato')";

    private static final String sqlDelete = "DELETE FROM animal WHERE id = 2";

    public static void main(String[] args) throws Exception{

        Class.forName("org.h2.Driver");


        Connection connection = null;

        try {

            connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);
            statement.execute(sqlInsert);

            ShowAnimal(connection);

            statement.execute(sqlDelete);

            ShowAnimal(connection);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection == null){
                return;
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    private static void ShowAnimal(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM animal";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " " + rs.getString(3));
        }
    }



}
