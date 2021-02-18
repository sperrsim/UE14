package model;

/**
 * @author Simon Sperr
 * @version 2020.3, 18.02.2021
 **/
public class Person {
    private String name;
    private String address;
    private String phonenumber;

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
}
