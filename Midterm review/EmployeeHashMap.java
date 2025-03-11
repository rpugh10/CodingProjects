public class EmployeeHashMap{
    private String name;
    private double salary;

    public EmployeeHashMap(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percent)
    {
        double result;
        result = salary * (percent/ 100);
        salary += result;
    }

    public void displayInfo()
    {
        System.out.println("Employee name " + name + " salary " + salary);
    }


}

