public class MobilePhoneMain {

    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone("123456789");
        Contact bob = new Contact("Bob", "31415926");
        Contact alice = new Contact("Alice", " 161800339");
        Contact tom = new Contact("Tom", "11235813");
        Contact jane = new Contact("Jane", "23571113");

        mobilePhone.addNewContact(bob);
        mobilePhone.addNewContact(alice);
        mobilePhone.addNewContact(tom);
        mobilePhone.addNewContact(jane);

        mobilePhone.printContacts();

    }
}
