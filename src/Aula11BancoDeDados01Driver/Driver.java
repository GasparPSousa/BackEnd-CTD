package Aula11BancoDeDados01Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {

    public static void main(String[] args) {

        Connection c = null;

        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }

        try {
            String url = "jdbc:h2:tcp://localhost//D:/banco-de-dados/exemplo";
            c = DriverManager.getConnection(url, "sa", "");
            c.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(0);
        }

        try {
            Statement s = c.createStatement();
            s.execute("SUA INSTRUÇÃO SQL");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
