public class SingletonEx {
    public static void main(String[] args) {
//        Singleton singleton1 = new Singleton(); // error - Singleton -> private
//        Singleton singleton2 = new Singleton();

//        싱글톤 디자인패턴 방식을 사용하여 객체를 생성
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        if (singleton1 == singleton2) {
            System.out.println("두 객체가 같다.");
        }
        else {
            System.out.println("두 객체가 다르다.");
        }
    }
}
