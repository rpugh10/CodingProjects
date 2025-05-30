import java.sql.*;
import java.util.*;

public class StudentDAO {

    String url = "jdbc:mysql://localhost:3306/user_system";
    String dbUser = "root";
    String dbPass = "Hockey#10";

    public void addStudent(Student s) throws SQLException{
        String sql = "INSERT INTO students (first_name, last_name, email, enrollment_date) VALUES(?, ?, ?, ?)";
        try(Connection conn = DriverManager.getConnection(url, dbUser, dbPass);
            PreparedStatement ps = conn.prepareStatement(sql)){
                
                ps.setString(1, s.getFName());
                ps.setString(2, s.getLName());
                ps.setString(3, s.getEmail());
                ps.setDate(4, java.sql.Date.valueOf(s.getDate()));
                ps.execute();
                System.out.println("Students added");
            
        }
    }

    public List<Student> getAllStudents() throws SQLException{
        List<Student> studentList = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try(Connection conn = DriverManager.getConnection(url, dbUser, dbPass);
        Statement state = conn.createStatement();
        ResultSet rs = state.executeQuery(sql)){
            while(rs.next())
            {
                Student student = new Student();
                student.setID(rs.getInt("id"));
                student.setFName(rs.getString("first_name"));
                student.setLName(rs.getString("last_name"));
                student.setEmail(rs.getString("email"));
                student.setEnrollmentDate(rs.getDate("enrollment_date").toLocalDate());
                studentList.add(student);
            }
        }
        return studentList;
    }

    public Student getStudentById(int id) throws SQLException{
        Student students = null;
        String sql = "SELECT id, first_name, last_name, email, enrollment_date FROM students WHERE id = ?";
        try(Connection conn = DriverManager.getConnection(url, dbUser, dbPass);
        PreparedStatement ps = conn.prepareStatement(sql)){ // Use this when inserting , updating , or querying data from the user
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery(); // Use for SELECT statements 
            if(rs.next())
            {
                students = new Student();
                students.setID(rs.getInt("id"));
                students.setFName(rs.getString("first_name"));
                students.setLName(rs.getString("last_name"));
                students.setEmail(rs.getString("email"));
                students.setEnrollmentDate(rs.getDate("enrollment_date").toLocalDate());
            }
        }
        return students;
    }

    public boolean updateStudentEmail(int id, String newEmail) throws SQLException
    {
        String sql = "UPDATE students SET email = ? WHERE id = ?";
        try(Connection conn = DriverManager.getConnection(url, dbUser, dbPass);
        PreparedStatement ps = conn.prepareStatement(sql)){
        ps.setString(1, newEmail); // Updates the first ? in the sql statement sets the email to the value in the newEmail variable
        ps.setInt(2, id); // Updates the second ? in the sql statement. Sets the id to the value stored in the id variable that is passed. 
        int rowsAffected = ps.executeUpdate(); // Use for INSERT UPDATE and DELETE statements 

            if (rowsAffected > 0) {
                return true;
            }
        }
            return false;
    }

    public boolean deleteStudent(int id)throws SQLException
    {
        String sql = "DELETE FROM students WHERE id = ?";
        try(Connection conn = DriverManager.getConnection(url, dbUser, dbPass);
        PreparedStatement ps = conn.prepareStatement(sql);){
            ps.setInt(1, id);
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected > 0)
            {
                return true;
            }
            else
            return false;
        }
    }
}
