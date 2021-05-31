public class Desk {

    private String style;
    private int length;
    private int width;
    private int height;
    private String material;

    public Desk(String style, int length, int width, int height, String material) {
        this.style = style;
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
    }

    public void tidy() {
        System.out.println("Desk -> Tidying");
    }

    public String getStyle() {
        return style;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
