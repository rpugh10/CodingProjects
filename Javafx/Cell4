
import javafx.scene.control.Button; 
import javafx.event.*;

public class Cell extends Button
{
    private int x, y;
    private String content;

    /**
     * Constructor for objects of class Cell
     */
    public Cell(String content, int x, int y)
    {
        super(content.trim());
        
        this.content = content.trim();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setX(int newX) {
        x = newX;
    }
    
    public void setY(int newY) {
        y = newY;
    }
    
    public boolean isEmpty() {
        return content.equals("");
    }
}
