package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Simon Sperr
 * @version 2020.3, 18.02.2021
 **/
public class Phonebook {
    private List<Person> phonebook = new LinkedList<Person>();

    public Phonebook()
    {
        this.newPage();
    }

    public void save_csv()
    {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("phonebook.csv")))
        {
            for (int c = 0; c < phonebook.size(); c++)
            {
                bw.write(phonebook.get(c).toString());
                bw.newLine();
            }
            System.out.println("Speichern erfolgreich!");
        } catch (Exception e) {
            System.out.println("Fehler beim Speichern!");
        }
    }

    public void load_csv()
    {
        phonebook.clear();
        try(BufferedReader br = new BufferedReader(new FileReader("phonebook.csv")))
        {
            String s = "";
            while ((s = br.readLine()) != null)
            {
                String split[] = s.split(",");
                phonebook.add(new Person(split[0], split[1], split[2]));
            }
            System.out.println("Erfolgreich geladen!");
        } catch (Exception e) {
            System.out.println("Fehler beim Laden!");
        }
    }

    public void saveChanges(String name, String address, String phone, int index)
    {
        Person p = phonebook.get(index);
        p.setName(name);
        p.setAddress(address);
        p.setPhonenumber(phone);
    }

    public void newPage()
    {
        phonebook.add(new Person());
    }

    public Person getPerson(int index)
    {
        Person p = null;
        try
        {
            p = phonebook.get(index);
        }
        catch (Exception e)
        {

        }
        return p;
    }

    public int getSize()
    {
        return phonebook.size();
    }

    public void delete(int index)
    {
        try {
            phonebook.remove(index);
        }
        catch (Exception e)
        {
            System.out.println("Fehler beim Löschen!");
        }

    }
}
