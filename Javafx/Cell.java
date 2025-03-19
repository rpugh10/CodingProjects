import javafx.scene.control.Button;

public class Cell extends Button
{
  private int x;
  private int y;
  private String content;
  
  public Cell(String content, int x, int y)
  {
    this.x = x;
    this.y = y;
    this.content = content;
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
      if(content == "")
      {
          return true;
      }
      else
      return false;
  }
}
