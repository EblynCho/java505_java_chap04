public class Car {
    String name;
    String type;
    String gas = "가솔린";
    String size;
    int speed = 0;

    //    생성자 : 객체 생성 시 new 명령어에 의해서 자동 실행되는 메서드
//    멤버 변수의 데이터를 초기화하는데 사용
    public Car(String carName, String carType, String carGas, String carSize) {
        name = carName;
        type = carType;
        gas = carGas;
        size = carSize;

    }

    public void move() {
        System.out.println("자동차가 " + speed + "의 속도로 움직입니다.");
    }

    public  void stop() {
        System.out.println("자동차가 멈춥니다.");
    }
}
