package model;

import java.util.List;

/**
 * @author Simon Sperr
 * @version 2020.3, 18.02.2021
 **/
public class Phonebook {
    private List<Person> phonebook;

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

    public void add()
    {
        phonebook.add(new Person());

    }

    public void delete(int index)
    {
        try {
            phonebook.remove(index);

        }
        catch (Exception e)
        {

        }

    }
}
