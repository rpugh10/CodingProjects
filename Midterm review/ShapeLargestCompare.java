public class ShapeLargestCompare{
 
    public static void getLargest(ShapeCompare[] shape)
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
        ShapeCompare[] shape = new ShapeCompare[3];
        shape[0] = new CircleCompare("Circle", 1);
        shape[1] = new RectangleCompare("Rectangle", 4, 5);
        shape[2] = new CircleCompare("Circle", 2);

        getLargest(shape);

         int compare = shape[1].compareTo(shape[2]);

         if(compare == -1)
         {
            System.out.println("The first shape object is bigger");
         }
         else if(compare == 1)
         {
            System.out.println("The second shape object is bigger");
         }
         else 
         System.out.println("They are both equal");
    }
}
    
