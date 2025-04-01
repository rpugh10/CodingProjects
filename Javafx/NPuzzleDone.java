import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.stage.Stage;
import javafx.scene.layout.*; 
import javafx.scene.control.*; 

public class NPuzzle extends Application 
{ 
    @Override 
    public void start(Stage stage) 
    {    
        Board board = new Board();  

     
        Scene scene = new Scene(board.getVBoxPane());  

        
        stage.setTitle("n-Puzzle Game"); 

        
        stage.setScene(scene); 

      
        stage.show(); 
    } 
}
