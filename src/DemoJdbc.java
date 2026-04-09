import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
            import package
            load and register
            create connection
            create statement
            execute statement
            process the results
            close
        */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "DiluPostgreSQL@2026";
        String sql = "SELECT * FROM student where sid = 1";

        //Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connected to database successfully");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString("sname");
        System.out.println("Name of a student is " + name);

        con.close();
        System.out.println("Connection closed successfully");



    }
}
