public class Person {
//    final : 단 한번만 데이터의 저장이 가능하고 더 이상 수정이 불가능
    final String nation = "대한민국";
    final String ssn;
    String name;

//    final 변수인 ssn을 생성자를 통해서 1번 데이터 저장
    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
