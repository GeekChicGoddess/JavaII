package Contacts;

/**
 * Created by melodytempleton on 6/4/17.
 */
public class Contact {

    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber(String number) {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
