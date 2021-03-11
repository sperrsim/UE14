package model;

/**
 * @author Simon Sperr
 * @version 2020.3, 18.02.2021
 **/
public class Person implements Comparable{
    private String name;
    private String address;
    private String phonenumber;

    public Person()
    {
        address = "";
        name = "";
        phonenumber = "";
    }

    public Person(String name, String address, String phonenumber) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return name + "," + address + "," + phonenumber;
    }

    public void setName(String name) throws Exception{
        if (name == null || name.length() == 0) {
            throw new Exception("Der Name darf nicht leer bleiben!");
        }

        name = name.trim();

        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhonenumber(String phonenumber) throws Exception{
        if (phonenumber == null || name.length() == 0) {
            throw new Exception("Die Telefonnummer darf nicht leer bleiben!");
        }

        phonenumber = phonenumber.trim();

        if (!phonenumber.isEmpty() && !phonenumber.matches("^[0-9]*/[0-9]*$")) {
            throw new Exception("Die Telefonnummer muss aus Zahlen und / bestehen!");
        }
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;

        return this.name.compareToIgnoreCase(p.getName());
    }
}
