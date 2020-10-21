package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Controller {

    String extend = "";
    String course = "";

    @FXML
    private TextField nameFile;
    @FXML
    private TextField pathFile;
    @FXML
    private TextField surname;
    @FXML
    private TextField name;
    @FXML
    private TextField patron;
    @FXML
    private Label status;

    Model model = new Model();

    public Controller() {
    }

    @FXML
    public void pressCheckBox(ActionEvent event) {
        course += " " + ((CheckBox) event.getSource()).getText();
    }

    @FXML
    public void pressRadio(ActionEvent event) {
        extend = ((RadioButton) event.getSource()).getText();
    }

    @FXML
    public void pressButton(ActionEvent event) throws IOException {
        model.createFile(name.getText(), surname.getText(), patron.getText(), nameFile.getText(), pathFile.getText(), extend, course);

        status.setText(name.getText() + "," + " Вы успешно зарегистрировались");
    }

    @FXML
    public void selectPath(ActionEvent event) throws IOException {
        model.openPath(pathFile);
        }
    @FXML
    public void selectFile(ActionEvent event) throws IOException {
        model.openFile(pathFile.getText(),nameFile.getText(),extend);


    }

}