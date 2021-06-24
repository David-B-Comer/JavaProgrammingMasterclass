public class CellPhone implements Telephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public CellPhone(int myNumber) {
        this.myNumber = myNumber;
    }


    @Override
    public void powerOn() {

        isOn = true;
        System.out.println("Cell phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {

        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Phone is switched off");
        }
    }


}
