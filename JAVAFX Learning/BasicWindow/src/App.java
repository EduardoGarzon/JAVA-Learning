import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//  Interface EventHandler<ActionEvent> para handle user events
public class App extends Application implements EventHandler<ActionEvent> {
    // Object button
    Button button;
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //entire window - stage
        //content inside window - scene
        primaryStage.setTitle("Title of the Stage");
        button = new Button("Click me!");
        //button.setText("click me");
        
        button.setOnAction(this);
        // dispara o evento


        // Simple layout that gets the button in the middle
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        // Scene of the content, follows the layout type
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        // diplay
        primaryStage.show();
    }

    @Override
    // evento
    public void handle(ActionEvent event)
    {
        if(event.getSource() == button)
        {
            System.out.println("Funciona");
        }
    }
    

}