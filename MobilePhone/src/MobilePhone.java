import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {

        return  !myContacts.contains(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        if (myContacts.contains(oldContact)) {
            myContacts.remove(oldContact);
            myContacts.add(newContact);
        }
        return false;
    }

    public boolean removeContact(Contact contact) {

        if (myContacts.contains(contact)) {
            myContacts.remove(contact);
        }
        return false;
    }
}
