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
        setAddress("");
        setName("");
        setPhonenumber("");
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhonenumber(String phonenumber) {
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
