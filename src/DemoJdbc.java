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

        int sid = 7;
        String sname = "Mark";
        int marks = 88;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "DiluPostgreSQL@2026";
        String sql = "insert into student values (?,?,?)";


        Connection con = DriverManager.getConnection(url, uname, pass);

        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);



        con.close();




    }
}
