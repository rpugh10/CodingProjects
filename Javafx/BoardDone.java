import javafx.scene.layout.*; 
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.text.Text; 
import javafx.scene.text.Font;
import javafx.event.*;
import javafx.scene.control.Button; 
import javafx.scene.control.TextInputDialog;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class Board
{
    private Cell[][] board;
    private GridPane gridPane = null;
    private final int NORTH = 0;
    private final int EAST = 1;
    private final int SOUTH = 2;
    private final int WEST = 3;
    private int SIZE = 3;
    private VBox vBox;
    private int noOfMoves = 0;
    Text text;
    private HBox hBox;
    private final static String STYLE_CELL = "-fx-background-radius: 0; " +
            "-fx-font-size: 30; " +
            "-fx-background-color:LightSkyBlue;" +
            "-fx-border-color:Black;";
    private final static String STYLE_EMPTY_CELL = "-fx-background-radius: 0; " +
            "-fx-font-size: 30; " +
            "-fx-background-color:White;" +
            "-fx-border-color:Black;";
            
    public Board()
    {
        board = new Cell[SIZE][SIZE];
        gridPane = new GridPane();
        
        int num = 0;
        
        for(int i = 0; i < SIZE; i++)
        {
            for(int j = 0; j < SIZE; j++)
            {
                if(num == 0)
                {
                    board[i][j] = new Cell("", i, j);
                    num++;
                }else 
                {
                    board[i][j] = new Cell(num + "", j, i);
                    num++;
                }
            }
        }
        
        
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++) {
                board[i][j].setOnAction(this::processClick);
                board[i][j].setStyle(STYLE_CELL); 
                board[i][j].setPrefWidth(100);
                board[i][j].setPrefHeight(100);
                if (board[i][j].isEmpty())
                    board[i][j].setStyle(STYLE_EMPTY_CELL); 
            } 
            
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                gridPane.add(board[i][j], i, j);
            }
        }
        text = new Text("Number of moves: " + noOfMoves + "         ");
        
        Button button = new Button("Restart");
        button.setOnAction(this::processRestartClick);
        Button resize = new Button("Resize");
        resize.setOnAction(this::processResizeClick);
        hBox = new HBox(text, button, resize);
        hBox.setAlignment(Pos.CENTER);
        vBox = new VBox(gridPane, hBox);
        
        shuffle();     
    }
    
    private void createBoardAndPane()
    {
        vBox.getChildren().clear();
        board = new Cell[SIZE][SIZE];
        int num = 0;
        
        for(int i = 0; i < SIZE; i++)
        {
            for(int j = 0; j < SIZE; j++)
            {
                if(num == 0)
                {
                    board[i][j] = new Cell("", i, j);
                    num++;
                }else 
                {
                    board[i][j] = new Cell(num + "", j, i);
                    num++;
                }
            }
        }
        
        
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++) {
                board[i][j].setOnAction(this::processClick);
                board[i][j].setStyle(STYLE_CELL); 
                board[i][j].setPrefWidth(100);
                board[i][j].setPrefHeight(100);
                if (board[i][j].isEmpty())
                    board[i][j].setStyle(STYLE_EMPTY_CELL); 
            } 
            
        gridPane = new GridPane();
        
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                gridPane.add(board[i][j], i, j);
            }
        }
        
        vBox.getChildren().addAll(gridPane, hBox);
        shuffle();
    }
    
    private void processResizeClick(ActionEvent event)
    {
        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setHeaderText(null);
        inputDialog.setTitle(null);
        inputDialog.setContentText("Enter an integer ");
        Optional<String> numString = inputDialog.showAndWait();
        
        if(numString.isPresent())
        {
            SIZE = Integer.parseInt(numString.get());
        }
        createBoardAndPane();
    }
    
    public GridPane getGridPane() {
        return gridPane;
    }
    
    public VBox getVBoxPane()
    {
        return vBox;
    }
    
    private void shuffle() {
        int xEmpty = 2, yEmpty = 2;
        int xNext, yNext;
        int direction;
        
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (board[i][j].isEmpty()) {
                    xEmpty = j;
                    yEmpty = i;
                    break;
                }
        
        for (int i = 0; i < 1000; i++) {
            direction = (int)(Math.random() * 4);
            if (direction == NORTH && yEmpty -1 >= 0) {
                swap(xEmpty, yEmpty, xEmpty, yEmpty - 1);
                yEmpty--;
            }
            else if (direction == EAST && xEmpty + 1 <= SIZE - 1) {
                swap(xEmpty, yEmpty, xEmpty + 1, yEmpty);
                xEmpty++;                
            }
            else if (direction == SOUTH && yEmpty + 1 <= SIZE - 1) {
                swap(xEmpty, yEmpty, xEmpty, yEmpty + 1);
                yEmpty++;                
            }
            else if (direction == WEST && xEmpty - 1 >= 0) {
                swap(xEmpty, yEmpty, xEmpty - 1, yEmpty);
                xEmpty--;                                
            }
        }
    }

    public void processClick(ActionEvent event) {
        int x, y;
        x = ((Cell)(event.getSource())).getX();
        y = ((Cell)(event.getSource())).getY();

        int result = isNeighborEmpty(x, y);
        
        
        if (result < 0) 
            return;        
        
        if (result == NORTH)
            swap(x, y-1, x, y);
        else if (result == EAST)
            swap(x+1, y, x, y);
        else if (result == SOUTH)
            swap(x, y+1, x, y);
        else if (result == WEST)
            swap(x-1, y, x, y);
            
        noOfMoves++;
        text.setText("Number of moves: " + noOfMoves + "          ");
    }
    
    private void processRestartClick(ActionEvent event)
    {
        noOfMoves = 0;
        text.setText("Number of moves: " + noOfMoves + "          ");
        
        shuffle();
    }
    
    private int isNeighborEmpty(int x, int y) {
        if (y - 1 >= 0 && board[x][y-1].isEmpty())
            return NORTH;
        if (x + 1 <= SIZE - 1 && board[x+1][y].isEmpty())
            return EAST;
        if (y + 1 <= SIZE - 1 && board[x][y+1].isEmpty())
            return SOUTH;
        if (x - 1 >= 0 && board[x-1][y].isEmpty())
            return WEST;
        return -1;
    }
    
    private void swap(int x0, int y0, int x1, int y1) {
        Cell emptyCell = board[x0][y0];
        Cell nonEmptyCell = board[x1][y1];
         
        gridPane.getChildren().remove(emptyCell);
        gridPane.getChildren().remove(nonEmptyCell);
        
        emptyCell.setX(x1); emptyCell.setY(y1);
        nonEmptyCell.setX(x0); nonEmptyCell.setY(y0);
        
        board[x1][y1] = emptyCell;
        board[x0][y0] = nonEmptyCell;
        
        gridPane.add(emptyCell, x1, y1);
        gridPane.add(nonEmptyCell, x0, y0);
    }
}
