import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;

/**
 * Write a description of class Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
   private Cell[][] board;
   private GridPane gridPane;
   private final int NORTH = 0;
   private final int EAST = 1;
   private final int SOUTH = 2;
   private final int WEST = 3;
   
   public Board()
   {
       board = new Cell[3][3];
       gridPane = new GridPane();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String content = (i * 3 + j + 1) + "";
                if (i == 2 && j == 2) 
                {
                    content = " ";
                }
                board[i][j] = new Cell(i, j, content);
                board[i][j].setPrefSize(100,100);
                board[i][j].setStyle("-fx-font-size:50;"  + "-fx-background-color:SkyBlue;" + "-fx-border-color:Black;");
                if(board[i][j].isEmpty() == true)
                {
                    board[i][j].setStyle("-fx-background-color: White;" + "-fx-font-size:50;" + "-fx-border-color:Black;");
                }
                board[i][j].setOnAction(this::processClick);
                gridPane.add(board[i][j], j, i);
            }
        }
   }
   
   public GridPane getGridPane()
   {
       return gridPane;
   }
   
   private void processClick(ActionEvent event)
   {
       Cell clickedCell = (Cell) event.getSource(); 

    
       int x0 = clickedCell.getX(); 
       int y0 = clickedCell.getY(); 

    
       if (y0 > 0) {
           swap(x0, y0, x0, y0 - 1);
       }

    
       if (x0 < 2) { 
           swap(x0, y0, x0 + 1, y0); 
       }

    
       if (y0 < 2) { 
           swap(x0, y0, x0, y0 + 1);
       }

 
       if (x0 > 0) {
           swap(x0, y0, x0 - 1, y0); 
       }
   }
   
   private void swap(int x0, int y0, int x1, int y1) {
     if (x1 >= 0 && x1 < 3 && y1 >= 0 && y1 < 3) {
        if (board[x1][y1].isEmpty()) { 
            String temp = board[x0][y0].getText();
            board[x0][y0].setText(board[x1][y1].getText());
            board[x1][y1].setText(temp);
            
            gridPane.getChildren().remove(board[x0][y0]);
            gridPane.getChildren().remove(board[x1][y1]);
            
            gridPane.add(board[x0][y0], x1, y1);
            gridPane.add(board[x1][y1], x0, y0);
            }
        }
     }
}
