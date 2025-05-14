import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
       
        String url = "jdbc:mysql://localhost:3306/myDB";
        String user = "root";
        String password = "Hockey#10";

        try {
            
            Connection conn = DriverManager.getConnection(url, user, password);

           
            String sql = "SELECT username, password FROM users";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

           
            while (rs.next()) {
                String name = rs.getString("username");
                String email = rs.getString("password");
                System.out.println(name + " - " + email);
            }

           
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}

