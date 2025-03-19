import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class NPuzzle extends Application
{
     public void start(Stage stage)
     {
         Cell[][] cell = new Cell[3][3];
         cell[0][0] = new Cell("1", 0, 0);
         cell[1][0] = new Cell("2", 1, 0);
         cell[2][0] = new Cell("3", 2, 0);
         cell[0][1] = new Cell("4", 0 ,1);
         cell[1][1] = new Cell("5", 1, 1);
         cell[2][1] = new Cell("6", 2, 1);
         cell[0][2] = new Cell("7", 0, 2);
         cell[1][2] = new Cell("8", 1, 2);
         cell[2][2] = new Cell(" ", 2, 2);
         
         for(int i = 0; i < 3; i++)
         {
             for(int j = 0; j < 3; j++)
             {
                 cell[i][j].setPrefSize(100,100);
                 cell[i][j].setText(cell[i][j].getContent());
             }
         }
         Board board = new Board(cell);
         Scene scene = new Scene(board.getGridPane(), 300, 300);
         
         stage.setTitle("NPuzzleGame");
         stage.setScene(scene);
         stage.show();
         
     }
}
