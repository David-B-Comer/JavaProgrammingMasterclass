public class Light {

    private String style;
    private boolean isOn;
    private int globes;

    public Light(String style, boolean isOn, int globes) {
        this.style = style;
        this.isOn = isOn;
        this.globes = globes;
    }

    public void turnOn() {
        System.out.println("Light -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getGlobes() {
        return globes;
    }

}
