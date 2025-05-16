import java.sql.*;
import java.util.*;
public class RequestingData {
   public static void main(String[] args) throws SQLException
   {
        String url = "jdbc:mysql://localhost:3306/user_system";
        String dbUser ="root";
        String dbPassword = "Hockey#10";
        Scanner scan = new Scanner(System.in);

        try(Connection conn = DriverManager.getConnection(url, dbUser, dbPassword)){
            System.out.println("Connected to database");

            while(true)
            {
                System.out.println("1. Register");
                System.out.println("2. View all users");
                System.out.println("3. Exit");
                int choice = scan.nextInt();
                scan.nextLine();

                if(choice == 1)
                {
                    System.out.println("Enter your your username");
                    String username = scan.nextLine();
                    System.out.println("Enter your email");
                    String email = scan.nextLine();
                    System.out.println("Enter your password");
                    String password = scan.nextLine();

                    String sql = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
                    try(PreparedStatement state = conn.prepareStatement(sql))
                    {
                        state.setString(1, username);
                        state.setString(2, email);
                        state.setString(3, password);
                        state.executeUpdate();
                        System.out.println("User registered");
                    }
                }
                else if(choice == 2){
                String sql = "SELECT username, email, password FROM users";
                try(Statement state = conn.createStatement(); 
                    ResultSet rs = state.executeQuery(sql)){
                        System.out.println("Registered users");
                        while(rs.next())
                        {
                            System.out.println("Username: " + rs.getString("username"));
                            System.out.println("Email: " + rs.getString("email"));
                            System.out.println("Password: " + rs.getString("password"));
                        }
                    }
                }else{
                    System.out.println("Exiting");
                    break;
                }
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        scan.close();
   }
}

