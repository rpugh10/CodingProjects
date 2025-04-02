


public class EmployeeCompare implements Comparable<EmployeeCompare> {
    
    private String name;
    private int id;
    private double salary;
    private EmployeeCompare[] employee;

    public EmployeeCompare(String name, int id, double salary)
    {
        this.name = name; 
        this.id = id;
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int compareTo(EmployeeCompare id)
    {
        double obj2 = id.getSalary();
        if(obj2 < this.salary)
        {
            return 1;
        }else if(obj2 > this.salary)
        {
            return -1;
        }
        else{
            return 0;
        }
    }

    public static void linearSearch(EmployeeCompare[] em, int numToFind)
    {
        for(int i = 0; i < em.length; i++)
        {
            if(numToFind == em[i].getId())
            {
                System.out.println("Employee found at index " + i);
                break;
            }
        }
    }

    public static void printArray(EmployeeCompare[] em)
    {
        int place = 0;
        System.out.print("Printing array: ");
        for(int i = 0; i < em.length; i++)
        {
            
            System.out.print(em[i]);
            if(place < em.length - 1)
            {
                System.out.print(", ");
                place++;
            }
        }
        System.out.println();
    }

    public String toString()
    {
        return "Employee name: " + name + " ID: " + id + " salary " + salary;
    }

}
