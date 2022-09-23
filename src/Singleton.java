public class Singleton {
//    private 접근 제한자 : private로 지정된 멤버는 해당 클래스 내에서만 사용이 가능함
    private static Singleton singleton = new Singleton();

//    생성자의 접근 제한자에 private을 사용하면 객체 생성 시 new 키워드를 사용할 수 없음 -> 메모리에 등록 X
//    객체 생성이 불가능
//    본인 클래스 안에선 사용 가능
    private Singleton() { }

    public static Singleton getInstance() {
        return singleton;
    }
}
