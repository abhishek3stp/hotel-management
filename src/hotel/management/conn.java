package hotel.management;

import java.sql.*;

public class conn {

    Connection c;
    Statement s;

    public conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///hms", "dbms_pro", "dbmspass");

            s = c.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
