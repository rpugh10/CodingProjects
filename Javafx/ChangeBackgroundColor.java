import javafx.application.Application;
import javafx.stage.Stage;
import java.awt.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;



public class ChangeBackgroundColor extends Application
{   
    private Button redButton, blueButton;
    private FlowPane pane;
    public void start(Stage stage)
    {
        blueButton = new Button("Blue");
        redButton = new Button("Red");
        blueButton.setOnAction(this::processButtonClick);
        redButton.setOnAction(this::processButtonClick);
        
        pane = new FlowPane(blueButton, redButton);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        
        Scene scene = new Scene(pane, 300, 300);
        stage.setTitle("Change Background Color");
        stage.setScene(scene);
        stage.show();
    }
    
    public void processButtonClick(ActionEvent event)
    {
        if(event.getSource() == blueButton)
        {
            pane.setStyle("-fx-background-color: blue");
        }
        else
        {
            pane.setStyle("-fx-background-color: red");
        }
    }
}
