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
        String sql = "delete from student where sid=4";

        //Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connected to database successfully");
        Statement st = con.createStatement();
        st.execute(sql);



        con.close();
        System.out.println("Connection closed successfully");



    }
}
