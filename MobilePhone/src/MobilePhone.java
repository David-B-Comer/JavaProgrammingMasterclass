import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {

        if (findContact(contact) != -1) {
            return false;
        }
        return  myContacts.add(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        if (findContact(oldContact) != -1) {
            return myContacts.remove(oldContact) && myContacts.add(newContact);
        }
        return false;
    }

    public boolean removeContact(Contact contact) {

        if (findContact(contact) == -1) {
            return false;
        }
        return myContacts.remove(contact);
    }

    private int findContact(Contact contact) {

        return findContact(contact.getName());
    }

    private int findContact(String contact) {

        for (int i = 0; i < myContacts.size(); i++) {
            Contact contactName = myContacts.get(i);

            if (contactName.getName().equals(contact)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {

        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);

            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }


    public void printContacts() {

        System.out.println("Contact List:");

        for (int i = 0; i <  myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
