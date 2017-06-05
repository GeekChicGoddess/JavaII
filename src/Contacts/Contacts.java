package Contacts;



import java.util.List;
import java.io.IOException;


interface Contacts {

    List<Contact> findAll();
    Contact findByName (String name);
    Contact findByNumber (String number);
    void add (Contact Contact) throws IOException;
    void delete (Contact Contact);

}
