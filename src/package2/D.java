package package2;

public class D {
    public String model;
    public String type;
    public String fuel;
    private String color;
    private String size;

    public void getMyCarInfo() {
        System.out.println("색상 : " + this.color + "\n크기 : " + this.size);
    }
    public void setMyCarInfo(String color, String size) {
        this.color = color;
        this.size = size;
    }
}
