// 실행용 클래스

public class Method05 {

    public static void inCall() {
        System.out.println("Method05 클래스의 멤버 메서드");
    }

//    프로그램을 실행하기 위한 main 메서드가 존재
    public static void main(String[] args) {
//        메소드 호출하기
//        1. 클래스 내부 호출 : 동일한 클래스의 멤버끼리 호출하는 것
        inCall();
//        2. 클래스 외부 호출 : 다른 클래스의 객체를 생성하고 해당 객체의 멤버를 호출하는 것


//        Car2 클래스 타입의 변수 avante를 선언;
        Car2 avante;
//        new : 메모리 공간에 생성자를 통해 생성된 객체를 등록, 등록된 메모리 주소를 반환
//        생성자 : 지정한 클래스를 기반으로 객체를 생성
        avante = new Car2(); // Car2클래스 객체가 생성되고 Car2클래스 타입의 변수 avante에 대입되어 사용 준비가 완료됨
//  객체가 생성되면 서로 다른 메모리 공간에 저장됨
//        Car car;
//        car = new Car2();  // Car, Car2 타입이 다르므로 오류

//        클래스 외부 호출, 객체의 멤버 호출
        avante.name = "아반테";
        avante.run(); // run : avante라고 하는 객체의 멤버
        avante.stop();
        avante.sound();

//        Car2 클래스 타입의 객체 생성
        Car2 sonata = new Car2();
        sonata.name = "소나타";
        sonata.run(); // run : sonata라고 하는 객체의 멤버
        sonata.sound();
        sonata.stop();


        Car3 car = new Car3();
        car.info();

        Car4 toress = new Car4("토레스", "SUV");
        toress.info();

        Car4 santafe = new Car4("싼타페", "SUV");
        santafe.info();

//        오류 발생 -> 오버로딩 필요
        Car4 carnival = new Car4();
        carnival.name = "카니발";
        carnival.type = "SUV";
        carnival.info();


        Car5 grander1 = new Car5();
        grander1.getInfo();

        Car5 k7 = new Car5("K7", "세단", "준대형");
        k7.getInfo();
    }
}
