import java.sql.*;
import java.util.*;
public class JdbcExample {
   public static void main(String[] args)
   {
        String url = "jdbc:mysql://localhost:3306/myDB";
        String dbUser = "root";
        String dbPassword = "Hockey#10";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = scan.nextLine();

        System.out.println("Enter your password");
        String password = scan.nextLine();

        try{
            Connection conn = DriverManager.getConnection(url, dbUser, dbPassword);
            System.out.println("Connected to MySQL");

            String sql = "INSERT INTO users (username , password) VALUES (?, ?)";
            PreparedStatement state = conn.prepareStatement(sql);
            state.setString(1, username);
            state.setString(2, password);

            int rowsInserted = state.executeUpdate();
            if(rowsInserted > 0)
            {
                System.out.println("User information stored successfully ");
            }
            conn.close();

            
        }catch (SQLException e)
        {
            e.printStackTrace();
        }

        scan.close();
   }
}

