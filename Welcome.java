import javafx.stage.Stage;
import javafx.geometry.*;
import java.lang.Object;
import javafx.scene.layout.HBox;
import javafx.scene.control.PasswordField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;


import javafx.stage.Stage;
public class Welcome extends Application{
    
@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sahara - Best Services Unbelievable Prices");
        
		//Positioning the frame
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		//Header, Labels, text and password fields
		Text scenetitle = new Text("Sign In to Sahara");
		scenetitle.setFont(Font.font("Nimbus Sans L", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		Label email = new Label("Email Address:");
		grid.add(email, 0, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);

		Label pw = new Label("Password:");
		grid.add(pw, 0, 2);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);
		
		//Create and Position the Button
		Button button = new Button("Sign in");
		HBox hbbutton = new HBox(10);
		hbbutton.setAlignment(Pos.BOTTOM_RIGHT);
		hbbutton.getChildren().add(button);
		grid.add(hbbutton, 1, 4);
		
		Scene scene = new Scene(grid, 620, 480);
		primaryStage.setScene(scene);
		
        primaryStage.show();
		
    }

 public static void main(String[] args) {
        launch(args);
    }
}