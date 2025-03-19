import javafx.scene.layout.GridPane;

public class Board
{
   private Cell[][] board;
   private GridPane gridPane;
   private final int NORTH = 0;
   private final int EAST = 1;
   private final int SOUTH = 2;
   private final int WEST = 3;
   
   public Board(Cell[][] board)
   {
       this.board = board;
       gridPane = new GridPane();
          for(int i = 0; i < 3; i++)
         {
             for(int j = 0; j < 3; j++)
             {
                 gridPane.add(board[i][j], j, i);
             }
         }
   }
   
   public GridPane getGridPane()
   {
      return gridPane; 
   }
}
