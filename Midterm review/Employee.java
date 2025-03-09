public class Employee implements Comparable<Employee>{
 private double salary;
 private int age;
 
 public Employee(double salary, int age)
 {
    this.salary = salary;
    this.age = age;
 }

 public double getSalary()
 {
    return salary;
 }

 public int getAge()
 {
    return age;
 }

 public int compareTo(Employee e)
 {
   if(this.salary != e.getSalary())
   {
      return Double.compare(this.salary, e.getSalary());
   }
   else 
   return Integer.compare(this.age, e.getAge());
 }

 public String toString()
 {
    return "Salary " + salary + " age " + age;
 }
}

