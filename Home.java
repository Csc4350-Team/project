import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Stage;
public class Home extends Application{
    
@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sahara - Best Services Unbelievable Prices");
        
		//Positioning the frame
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		//Header, Labels, text and password fields
		Text scenetitle = new Text("Selection");
		scenetitle.setFont(Font.font("Nimbus Sans L", FontWeight.NORMAL, 20));

		//Create the Button
		Button button1 = new Button("Products");
		Button button2 = new Button("Services");
		Button button3 = new Button("Deals");
		
		button1.setPadding(new Insets(30, 60, 30, 60));
		button2.setPadding(new Insets(30, 65, 30, 60));
		button3.setPadding(new Insets(30, 78, 30, 60));
		
		
		//Add buttons to the scene
		grid.add(button1, 2, 1);
		grid.add(button2, 2, 2);
		grid.add(button3, 2, 3);
		Scene scene2 = new Scene(grid, 820, 680);
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