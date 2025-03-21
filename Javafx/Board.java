import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import java.util.Random;

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
        shuffle();
   }
   
   public GridPane getGridPane()
   {
       return gridPane;
   }
   
 private void processClick(ActionEvent event) {
    Cell clickedCell = (Cell) event.getSource();
    int x0 = clickedCell.getX();
    int y0 = clickedCell.getY();

   
    int[] dRow = {-1, 0, 1, 0}; 
    int[] dCol = {0, 1, 0, -1}; 

    for (int dir = 0; dir < 4; dir++) {
        int x1 = x0 + dRow[dir];
        int y1 = y0 + dCol[dir];

        if (isValid(x1, y1) && board[x1][y1].isEmpty()) {
            swap(x0, y0, x1, y1);
            return; 
        }
    }
}

private void swap(int x0, int y0, int x1, int y1) {
    
    String temp = board[x0][y0].getText();
    board[x0][y0].setText(board[x1][y1].getText());
    board[x1][y1].setText(temp);
    
   
    board[x0][y0].setContent(board[x1][y1].getContent());
    board[x1][y1].setContent(temp);
    
   
    board[x0][y0].setStyle("-fx-font-size:50; -fx-background-color:White; -fx-border-color:Black;");
    board[x1][y1].setStyle("-fx-background-color:SkyBlue; -fx-font-size:50; -fx-border-color:Black;");
}

private void shuffle() {
    Random rand = new Random();
    int[] dRow = {-1, 0, 1, 0}; 
    int[] dCol = {0, 1, 0, -1}; 
    
    for (int i = 0; i < 1000; i++) { 
        int x = rand.nextInt(3);
        int y = rand.nextInt(3);

        
        for (int dir = 0; dir < 4; dir++) {
            int x1 = x + dRow[dir];
            int y1 = y + dCol[dir];

            if (isValid(x1, y1) && board[x1][y1].isEmpty()) {
                swap(x, y, x1, y1);
                break;
            }
        }
    }
}

private boolean isValid(int x, int y) {
    return x >= 0 && x < 3 && y >= 0 && y < 3;
}
}
