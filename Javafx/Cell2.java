import javafx.scene.control.Button;

/**
 * Write a description of class Cell here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cell extends Button
{
     private int x;
     private int y;
     private String content;
     
     public Cell(int x, int y, String content)
     {
         this.x = x;
         this.y = y;
         this.content = content;
         this.setText(content);
     }
     
     public int getX()
     {
         return x;
     }
     
     public int getY()
     {
         return y;
     }
     
     public String getContent()
     {
       return content;  
     }
     
     public void setContent(String content)
     {
        this.content = content;
     }
     
     public void setX(int x)
     {
         this.x = x;
     }
     
     public void setY(int y)
     {
         this.y = y;
     }
     
     public boolean isEmpty()
     {
         if(content == " ")
         return true;
         else 
         return false;
     }
     
}
