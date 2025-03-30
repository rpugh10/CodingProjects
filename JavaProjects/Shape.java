package Study;

public abstract class Shape{
    protected String shapeName;

    public Shape(String shapeName)
    {
        this.shapeName = shapeName;
    }
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void displayDetails()
    {
        System.out.println("The name of the shape is " + shapeName + " the area is " + calculateArea() + " the perimeter is " + calculatePerimeter());
    }

    public String toString()
    {
        return shapeName + " area is " + calculateArea() + " perimeter is " + calculatePerimeter();
    }
}
