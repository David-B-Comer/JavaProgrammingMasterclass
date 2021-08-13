public class ExtendedPassword extends Password{

    private int decryptedPassword;

    public ExtendedPassword(int password, int decryptedPassword) {
        super(password);
        this.decryptedPassword = password;
    }

    @Override
    public void storePassword() {
        System.out.println("Saving password as " + this.decryptedPassword);
    }
}
