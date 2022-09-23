public class PersonEx {
    public static void main(String[] args) {
//        final 변수인 ssn에 생성자를 사용하여 데이터를 초기화
//        일반 멤버 변수인 name에 생성자를 사용하여 데이터를 초기화
        Person p1 = new Person("123456-1234567", "홍길동");

        System.out.println(p1.nation);
        System.out.println(p1.name);
        System.out.println(p1.ssn);

//        final 키워드가 사용된 멤버 변수인 nation과 ssn은 더 이상 수정이 불가능
//        p1.nation = "미국"; // error
//        p1.ssn = "987654-9876543";
//        일반 변수인 name은 언제든지 수정이 가능함
        p1.name = "hong gil dong";
        System.out.println(p1.name);
    }
}
