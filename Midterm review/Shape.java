
public  abstract class Shape{
    protected String shapeType;

    public Shape(String shapeType)
    {
        this.shapeType = shapeType;
    }

    public abstract double area();

    public String toString()
    {
        return "The shape type " + shapeType;
    }
}
