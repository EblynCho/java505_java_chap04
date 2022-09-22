public class Car6 {
    public String name;
    public String size;

//    this : 클래스 내에서 객체 자기 자신을 뜻하는 키워드
//    클래스 내에서 객체 멤버 변수를 사용 시 매개변수와 동일한 이름으로 인하여 혼동되는 것을 방지하기 위해서 사용함
//    동일한 이름의 변수가 없을 경우 this를 사용하지 않아도 객체 멤버 변수를 사용할 수 있음
//    클래스 상속이 있을 경우 부모 클래스의 멤버 변수와 객체 자신의 멤버 변수를 구별하기 위해서 사용함
    public void setInfo(String name, String size) {
        this.name = name; // 지역변수가 우선권을 가지기 때문에 우선순위에서 밀리는 클래스 멤버 변수에 this.를 붙여줌
        this.size = size;
    }

    public void getInfo() {
        System.out.println("이름 : " + name + "\n크기 : " + size);
        System.out.println("----------------");
    }
}
