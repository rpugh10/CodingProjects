public class Main{
 
    public static void main(String[] args) {
        Shape[] shape = new Shape[4];
        shape[0] = new Circle("Circle", 32.4);
        shape[1] = new Rectangle("Rectangle", 4, 6);
        shape[2] = new Circle("Circle", 55.4);
        shape[3] = new Rectangle("Rectangle", 7, 8);

        for(int i = 0; i < shape.length; i++)
        {
            System.out.println(shape[i]);
        }
    }
}

