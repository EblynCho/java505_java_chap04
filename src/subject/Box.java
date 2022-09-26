package subject;

public class Box {
    private int width, height;
    private char fillChar;
    public Box() {
        this.width = 10;
    }
    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void draw() {
        for (int i = 0; i < height; i++) {

        }
    }
    public void fill(char c) {

    }
    public static void main(String[] args) {
        Box a = new Box();
        Box b = new Box(20,3);
        a.fill('*');
        b.fill('%');
        a.draw();
        b.draw();
    }
}
