package Contacts;

/**
 * Created by melodytempleton on 6/4/17.
 */

import java.util.List;
import java.io.IOException;


interface Contacts {

    List<Contact> findAll();
    Contact findByName (String name);
    Contact findByNumber (String number);
    void add (Contact Contact) throws IOException;
    void delete (Contact Contact);

}
