import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// Exemplo 2 para user event handler

//  Interface EventHandler<ActionEvent> para handle user events
public class UserEvent extends Application {
    // Object button
    Button button;

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // entire window - stage
        // content inside window - scene
        primaryStage.setTitle("Title of the Stage");
        button = new Button("Click me!");
        // button.setText("click me");

        // dispara o evento
        button.setOnAction(e -> {
            System.out.println("Lambda Expression test!");
            System.out.println("Muito legal!");

        });

        /*
         * button.setOnAction(new EventHandler<ActionEvent>() {
         * 
         * @Override
         * public void handle(ActionEvent event) {
         * System.out.println("Funciona");
         * 
         * }
         * 
         * });
         */

        // Simple layout that gets the button in the middle
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        // Scene of the content, follows the layout type
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        // diplay
        primaryStage.show();
    }
}
