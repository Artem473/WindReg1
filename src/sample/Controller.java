package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    String name = "";
    String surname = "";
    String patro = "";
    String nameFile = "";
    String pyth = "";

    Model model = new Model();

    @FXML
    private TextField text;

    @FXML
    private Label label;

    public Controller() {
    }

    @FXML
    public void pressCheckBox(){

    }
    @FXML
    public void pressRadio(){

    }
    @FXML
    public void pressButton(ActionEvent event){
        String str = text.getText();
        if (!str.isEmpty()){
            label.setText("Статус: Вы зарегистрировались♥");
        } else {
            label.setText("Статус: Заполните анкету☻");
        }
    }
}