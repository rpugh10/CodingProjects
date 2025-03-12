import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FirstGUI extends Application
{ 
    @Override
    public void start(Stage primaryStage) {
        // Create GridPane
        GridPane grid = new GridPane();

        // Define button labels (1-8 and an empty space)
        String[] labels = {"1", "2", "3", "4", "5", "6", "7", "8", ""};

        // Create buttons and add them to the grid
        int index = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button btn = new Button(labels[index]);
                btn.setPrefSize(100, 100);  // Set button size
                grid.add(btn, col, row);   // Add to GridPane
                index++;
            }
        }

        // Create Scene and set it to Stage
        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setTitle("NPuzzle Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


