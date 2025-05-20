import java.time.LocalDate;
public class Student {
  private int id;
  private String firstName;
  private String lastName;
  private String email;
  private LocalDate enrollmentDate;

  public Student(String firstName, String lastName, String email, LocalDate enrollmentDate)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.enrollmentDate = enrollmentDate;
  }

  public Student(){

  }

  public void setID(int id)
  {
    this.id = id;
  }

  public void setFName(String firstName)
  {
    this.firstName = firstName;
  }

  public void setLName(String lastName)
  {
    this.lastName = lastName;
  }

  public void setEmail(String email)
  {
    this.email = email;
  }

  public void setEnrollmentDate(LocalDate enrollmentDate)
  {
    this.enrollmentDate = enrollmentDate;
  }

  public int getID()
  {
    return id;
  }

  public String getFName()
  {
    return firstName;
  }

  public String getLName()
  {
    return lastName;
  }

  public String getEmail()
  {
    return email;
  }

  public LocalDate getDate()
  {
    return enrollmentDate;
  }

  public String toString()
  {
    return "Student ID: " + id + "\n" + "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Email: " + email + "\n" + "Date enrolled: " + enrollmentDate + "\n";
  }
}
