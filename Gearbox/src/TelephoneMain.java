public class TelephoneMain {

    public static void main(String[] args) {

        Telephone telephone;
        telephone = new DeskPhone(123456);

        telephone.powerOn();
        telephone.callPhone(123456);
        telephone.answer();


        telephone = new CellPhone(24565);
        //telephone.powerOn();
        telephone.callPhone(24565);
        telephone.answer();
    }
}
