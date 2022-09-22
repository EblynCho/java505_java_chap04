public class Car3 {
    public String name;
    public String type;

//    생성자
    public Car3() {
        name = "토레스";
        type = "SUV";
    }

    public void run() {
        System.out.println(name + "가 달립니다.");
    }
    public void stop() {
        System.out.println(name + "가 멈춥니다.");
    }
    public void info() {
        System.out.println("차 이름은 " + name + "이고, 타입은 " + type + "입니다.");
    }
}
