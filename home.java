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

import javafx.stage.Stage;
public class Home extends Application{
    
@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sahara - Best Services Unbelievable Prices");
        
		//Positioning the frame
		StackPane root = new StackPane();

		//Header, Labels, text and password fields
		Text scenetitle = new Text("Selection");
		scenetitle.setFont(Font.font("Nimbus Sans L", FontWeight.NORMAL, 20));

		//Create the Button
		Button button1 = new Button("Products");
		Button button2 = new Button("Services");
		Button button3 = new Button("Deals");
		
		//Position the Buttons
		button1.setTranslateY(0);
		button2.setTranslateY(40);
		button3.setTranslateY(80);
		
		//Add buttons to the scene
		root.getChildren().add(button1);
		root.getChildren().add(button2);
		root.getChildren().add(button3);
		Scene scene2 = new Scene(root, 620, 480);
		primaryStage.setScene(scene2);
		
        primaryStage.show();		
    }
/*	
 public void ButtonClicked(ActionEvent e)
    {
        if (e.getSource()== button)
        if (e.getSource()== button)
            primaryStage.setScene(scene2);
        else
            primaryStage.setScene(scene1);
    }
*/
}
