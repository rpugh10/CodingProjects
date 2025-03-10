
public abstract class ShapeCompare implements Comparable<ShapeCompare>{
    protected String shapeType;

    public ShapeCompare(String shapeType)
    {
        this.shapeType = shapeType;
    }

    public abstract double area();

    public int compareTo(ShapeCompare name)
    {
      double obj2 = name.area();
      if(this.area() > obj2)
      {
        return -1;
      }
      else if(this.area() < obj2)
      {
        return 1;
      }
      else 
      return 0;
    }

    public String toString()
    {
        return "The shape type " + shapeType;
    }
}
