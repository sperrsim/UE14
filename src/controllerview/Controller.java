package controllerview;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Person;
import model.Phonebook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Simon Sperr
 * @version 2020.3, 18.02.2021
 **/
public class Controller {

    @FXML
    private TextField name_txt;
    @FXML
    private TextField address_txt;
    @FXML
    private TextField phone_txt;
    @FXML
    private Label site_lbl;

    private Phonebook phonebook;

    public void save_csv()
    {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("/src/phonebook.csv")))
        {
            for (int c = 0; c < phonebook.getSize(); c++)
            {
                bw.write(phonebook.getPerson(c).toString());
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
