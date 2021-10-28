package Aula11BancoDeDados01Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

    public static void main(String[] args) throws Exception{

        Connection c = null;

        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
            System.exit(0);
        }

        try{
            String url = "jdbc:h2:tcp//localhost/./test";
            c = DriverManager.getConnection(url, "sa", "");
            c.setAutoCommit(false);
        } catch (SQLException e){
            e.printStackTrace();
            System.exit(0);
        }

        try {
            Statement s = c.createStatement();
            s.execute("SELECT * FROM TEST");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                c.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
