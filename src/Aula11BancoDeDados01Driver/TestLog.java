package Aula11BancoDeDados01Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestLog {

    public static void main(String[] args) throws Exception {

        Class.forName("org.h2.Driver");
        Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        Statement stmt = con.createStatement();

        String insertSql = "INSERT INTO TEST VALUES(7, 'Again2');\n" +
                "INSERT INTO TEST VALUES(8, 'Again too Again');\n";

        stmt.execute(insertSql);

        String sql = "SELECT * FROM TEST";

        ResultSet rd = stmt.executeQuery(sql);
        while(rd.next()) {
            System.out.println(rd.getInt(1) + " - " +rd.getString(2));
        }
    }



}
