package Study;

public class Circle extends Shape {
    private double radius;

    public Circle(String shapeName, double radius)
    {
        super(shapeName);
        this.radius = radius;
    }

    public double calculateArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculatePerimeter()
    {
        return 2 * Math.PI * radius;
    }
    
}
