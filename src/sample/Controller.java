package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javafx.scene.control.TextArea;




public class Controller {
    @FXML
    TextArea guiSkriver;
    public void writeReadme(ActionEvent actionEvent) throws FileNotFoundException {
        File readme = new File("README.md");
        System.out.println("Filen findes? = " + readme.exists());
        PrintWriter fileSkriver = new PrintWriter(readme);
        try {
            fileSkriver.print("#README FILEN\n");
            Scanner sc = new Scanner(readme);
                fileSkriver.println(guiSkriver.getText());
        }
        catch (Exception e)
        {
            System.out.println("Noget gik galt");
        }
        fileSkriver.close();


    }
}
