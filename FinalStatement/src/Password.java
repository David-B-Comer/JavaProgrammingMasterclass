public class Password {

    public static final int key = 748576362;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(encryptedPassword);
    }

    public int encryptDecrypt(int password) {
        return password ^ key;
    }

    public void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }
}
