package sample;

import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Model {
    public void createFile (String name, String surname, String patron, String nameFile, String pathFile, String rashFile, String course) throws IOException{
        File file = new File(pathFile + "/" + nameFile + rashFile);
        FileWriter fw = new FileWriter(file);
        fw.write(surname + " " + name + " " + patron + "," + " " + "Вы успешно зарегистрировались" + "\n" + "Вы записались на следующие курсы: " + course + "\n" + "Желаем вам удачи");

        fw.close();
    }
    public void openPath ( TextField pathFile) throws IOException{
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Выберите папку");
        File dir = directoryChooser.showDialog(new Stage());
        if (!(dir == null)) {
            pathFile.setText(dir.getAbsolutePath());
        }
    }
    public void openFile (String pathFile, String nameFile, String extend) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        File file = new File(pathFile + "/" + nameFile + extend);
        if (!(file == null)) {
            desktop.open(file);
        }
    }
}
