public class ShapeLargest{
 
    public static void getLargest(Shape[] shape)
    {
        double largest = Double.MIN_VALUE;
        String largestName = "";
        for(int i = 0; i < shape.length; i++)
        {
           double largestArea = shape[i].area();
           if(largest < largestArea)
           {
                largest = largestArea;
                largestName = shape[i].shapeType;
           }
        }
        System.out.println("Shape with largest area " + largestName + " area: " + largest);
    }
    public static void main(String[] args)
    {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle("Circle", 1);
        shape[1] = new Rectangle("Rectangle", 4, 5);
        shape[2] = new Circle("Circle", 2);

        getLargest(shape);
    }
}
    
