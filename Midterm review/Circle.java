public class Circle extends Shape
{   
    private double radius;

    public Circle(String shapeType, double radius)
    {
        super(shapeType);
        this.radius = radius;
    }

    public double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString()
    {
        return super.toString() + " area " + area();
    }
} 

