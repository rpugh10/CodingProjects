import java.sql.*;
import java.util.*;
public class LibraryDOA {

    String url = "jdbc:mysql://localhost:3306/libary_management";
    String dbUser = "root";
    String dbPass = "Hockey#10";

    public void addBook(Book b)throws SQLException
    {
        String sql = "INSERT INTO books (book_id, title, author, year_published, available) VALUES (?, ?, ?, ?, ?)";
        try(Connection conn = DriverManager.getConnection(url, dbUser, dbPass);
        PreparedStatement ps = conn.prepareStatement(sql);){ // This is a parameterized queries as there is user input and the use of ?. Use PreparedStatement

            ps.setInt(1, b.getBookID());
            ps.setString(2, b.getTitle());
            ps.setString(3, b.getAuthor());
            ps.setInt(4, b.getYearPublished());
            ps.setBoolean(5, b.getIsAvailable());
            ps.execute();
            System.out.println("Book information added");
        }
    }

    public List<Book> getAllBooks()throws SQLException
    {
        List<Book> b = new ArrayList<>();
        String sql = "SELECT * FROM books";
        try(Connection conn = DriverManager.getConnection(url, dbUser, dbPass);
        Statement state = conn.createStatement();
        ResultSet rs = state.executeQuery(sql)){ // No user input so this is a fixed Queries. Use Statement
           while(rs.next()){
            Book book = new Book();
            book.setBookID(rs.getInt("id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setYearPublished(rs.getInt("year_published"));
            book.setIsAvailable(rs.getBoolean("available"));
            b.add(book);
           }
        }
        return b;
    }

}
