package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Simon Sperr
 * @version 2020.3, 18.02.2021
 **/
public class Phonebook {
    private ArrayList<Person> phonebook = new ArrayList<>();

    public Phonebook()
    {
        this.newPage();
    }

    public void save_csv()
    {
        sort();
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("phonebook.csv")))
        {
            for (int c = 0; c < phonebook.size(); c++)
            {
                bw.write(phonebook.get(c).toString());
                bw.newLine();
            }
            System.out.println(phonebook.size() + " Kontakte erfolgreich gespeichert!");
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
                phonebook.add(new Person((split.length >= 1 && !split[0].isEmpty() ? split[0] : ""),
                        (split.length >= 2 && !split[1].isEmpty() ? split[1] : null),
                        (split.length >= 3 && !split[2].isEmpty() ? split[2] : "")));
            }
            System.out.println(phonebook.size() + " Kontakte erfolgreich geladen!");
        } catch (Exception e) {
            System.out.println("Fehler beim Laden!");
        }
        sort();
    }



    public void newPage()
    {
        phonebook.add(new Person());
        sort();
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
        sort();
    }

    public void sort()
    {
        Collections.sort(phonebook);
    }
}
