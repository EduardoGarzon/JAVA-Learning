import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    Stage window; // objeto janela
    Scene scene1, scene2; // objeto content da janela

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage; // rename Stage
        Label labell = new Label("R.A OU CPF DO USUARIO:");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(labell, button1);
        scene1 = new Scene(layout1, 300, 300);

        Button button2 = new Button("Voltar");
        button2.setOnAction(e -> window.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 300, 300);

        window.setScene(scene1);
        window.setTitle("Title here");
        window.show();
    }
}
