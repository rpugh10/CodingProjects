import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.layout.VBox;
import java.util.Set;

/**
 * Write a description of class NPuzzle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NPuzzle extends Application 
{
  public void start(Stage stage)
  {
     Board board = new Board();
     Scene scene = new Scene(board.getVBox(), 300, 300);
     
     stage.setTitle("PuzzleGame");
     stage.setScene(scene);
     stage.show();
  }
}
