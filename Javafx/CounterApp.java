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



public class CounterApp extends Application
{   
    private int count;
    private Text text;
    @Override
    public void start(Stage stage)
    {
       count = 0;
       text = new Text("Pushes: 0");
       Button button = new Button("Click me");
       Button reset = new Button("Reset");
       button.setOnAction(this:: processButtonClick);
       reset.setOnAction(this::resetButtonClick);
       
       FlowPane pane = new FlowPane(text, button, reset);
       pane.setAlignment(Pos.CENTER);
       pane.setHgap(20);
       pane.setStyle("-fx-background-color: cyan");
       
       Scene scene = new Scene(pane, 300, 300);       
       stage.setTitle("JavaFX");
       stage.setScene(scene);
       stage.show();
    }
    
    public void processButtonClick(ActionEvent event)
    {
        count++;
        text.setText("Pushes: " + count);
    }
    
    public void resetButtonClick(ActionEvent event)
    {
        count = 0;
        text.setText("Pushes: " + count);
    }
}
