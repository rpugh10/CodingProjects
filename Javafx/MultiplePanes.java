import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import java.util.Scanner;



public class MultiplePanes extends Application
{  
    private Text showUsername;
    private Text showPassword;
    private Text userCancel;
    private Button submit;
    private Button cancel;
    private TextField textField;
    private PasswordField field; 
    Scanner scan = new Scanner(System.in);
   public void start(Stage stage)
   {
       VBox rootnode = new VBox();
       
       HBox hBox = new HBox();
       hBox.setAlignment(Pos.CENTER);
       Text headerText = new Text("Welcome to my app");
       hBox.getChildren().addAll(headerText);
       
       GridPane grid = new GridPane();
       Text username = new Text("Username:");
       textField = new TextField();
       Text password = new Text("Password:");
       field = new PasswordField();
       grid.add(username, 0, 0);
       grid.add(textField, 1, 0);
       grid.add(password, 0, 1);
       grid.add(field, 1, 1);
       grid.setHgap(10);
       grid.setVgap(5);
       grid.setAlignment(Pos.CENTER);
       
       FlowPane pane = new FlowPane();
       submit = new Button("Submit");
       cancel = new Button("Cancel");
       pane.setAlignment(Pos.CENTER);
       pane.setHgap(10);
       pane.setVgap(10);
       pane.getChildren().addAll(submit, cancel);
       
       VBox userInfo = new VBox();
       showUsername = new Text("Your username is: ");
       showPassword = new Text("Your password is: ");
       userInfo.setAlignment(Pos.CENTER);
       userInfo.getChildren().addAll(showUsername, showPassword);
       
       rootnode.getChildren().addAll(hBox, grid, pane, userInfo);
       
       Scene scene = new Scene(rootnode, 300, 300);
       stage.setScene(scene);
       stage.show();
   }
   

}
