import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginControler {

    @FXML
    private TextField campouser;

    @FXML
    private TextField camposenha;

    @FXML
    private Button campoentrar;

    @FXML
    void clicar(ActionEvent event) {
        String usuario = campouser.getText();
        String senha = camposenha.getText();

        if (usuario.equals("Sinclair") && senha.equals("12345")) {
            System.out.println("Login feito com sucesso.");
        } else {
            System.out.println("Login Negado.");
        }
    }

}
