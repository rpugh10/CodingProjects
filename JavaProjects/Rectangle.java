package Study;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(String shapeName, double length, double width)
    {
        super(shapeName);
        this.length = length;
        this.width = width;
    }

    public double calculateArea()
    {
        return length * width;
    }

    public double calculatePerimeter()
    {
        return 2 * (length + width);
    }
  
}

