import java.sql.*;
import java.util.*;

public class StudentDAO {

    String url = "jdbc:mysql://localhost:3306/user_system";
    String dbUser = "root";
    String dbPass = "Hockey#10";

    public void addStudent(Student s) throws SQLException{
        String sql = "INSERT INTO students (first_name, last_name, email. enrollment_date) VALUES(?, ?, ?, ?)";
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
        String sql = "SELECT id, first_name, last_name, email, enrollment_data FROM students WHERE id = ?";
        try(Connection conn = DriverManager.getConnection(url, dbUser, dbPass);
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
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
}
