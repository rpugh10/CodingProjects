
public class RectangleCompare extends ShapeCompare
{   
    private int height;
    private int width;

    public RectangleCompare(String shapeType, int height, int width)
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

