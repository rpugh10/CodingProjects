public class Rectangle extends Shape{

    private int height;
    private int width;

    public Rectangle(String shapeType, int height, int width)
    {
        super(shapeType);
        this.height = height;
        this.width = width;
    }

    public double area()
    {
        return width * height;
    }

    public String toString()
    {
        return super.toString() + " area " + area();
    }
}
    
