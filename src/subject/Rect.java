package subject;

public class Rect {
    private int width, height;
    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() { return width * height; }
}
