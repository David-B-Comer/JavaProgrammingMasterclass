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
}
