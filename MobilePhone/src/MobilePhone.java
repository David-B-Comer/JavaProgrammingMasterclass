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

    public int findContact(Contact contact) {

        return myContacts.indexOf(contact);
    }

    public int findContact(String contact) {

        return myContacts.indexOf(contact);
    }

    public Contact queryContact(String name) {

        return myContacts.get(findContact(name));
    }

    public void printContacts() {

        System.out.println("Contact List:");

        for (int i = 0; i <  myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
