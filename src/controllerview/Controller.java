package controllerview;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Person;
import model.Phonebook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Simon Sperr
 * @version 2020.3, 18.02.2021
 **/
public class Controller implements Initializable {

    @FXML
    private TextField name_txt;
    @FXML
    private TextField address_txt;
    @FXML
    private TextField phone_txt;
    @FXML
    private Label site_lbl;

    private Phonebook phonebook;

    private int page;

    public void addOnAction()
    {
        phonebook.newPage();
        page = phonebook.getSize();
        displayPage(page);
    }

    public void nextPage()
    {
        if(page < phonebook.getSize())
        {
            page++;
            displayPage(page);
        }
        else
        {
            page = 1;
            displayPage(page);
        }
    }

    public void previousPage()
    {
        if(page > 1)
        {
            page--;
            displayPage(page);
        }
        else
        {
            page = phonebook.getSize();
            displayPage(page);
        }
    }

    public void save()
    {
        phonebook.saveChanges(name_txt.getText(), address_txt.getText(), phone_txt.getText(), page-1);
    }

    public void delete()
    {
        phonebook.delete(page-1);
        page--;
        displayPage(page);
    }

    public void save_csv()
    {
        phonebook.save_csv();
    }

    public void load_csv()
    {
        phonebook.load_csv();
        page = 1;
        displayPage(page);
    }

    public void displayPage(int index)
    {
        Person p = phonebook.getPerson(index - 1);
        name_txt.setText(p.getName());
        phone_txt.setText(p.getPhonenumber());
        address_txt.setText(p.getAddress());
        site_lbl.setText("Seite " + (index) + "/" + phonebook.getSize());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        phonebook = new Phonebook();
        page = 1;
        displayPage(page);
    }
}
