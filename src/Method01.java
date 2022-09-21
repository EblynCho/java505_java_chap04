public class Method01 {
    public static void main(String[] args) {

//        메서드 : 함수와 동일한 개념, 클래스의 멤버로 포함되어 있으면 메서드라고 함
//        사용자가 원하는 특정 결과를 얻기 위한 연산 식을 하나의 이름으로 묶어둔 것
//        사용자가 원하는 결과를 얻기 위한 소스코드를 한번 입력할 때는 문제가 없지만 여러번 사용할 경우, 소스코드의 중복이 발생함

//        매개변수 : 해당 메서드 내의 연산 시 필요한 데이터를 외부에서 전달하는 변수
//        반환값 : 해당 메서드의 연산 후 그 결과값을 메서드를 호출한 위치로 다시 되돌려주는 것, 키워드 return이 사용

//        메서드 사용법
//        선언 :
//        접근 제한자 반환타입 메서드명(매개변수1, 매개변수2, ...) {
//          실행할 소스 코드
//        }

//        사용(호출) :
//        메서드명(매개변수1, 매개변수2, ...);
//        변수명 = 메서드명(매개변수1, 매개변수2, ...);

//        메서드의 4가지 형태
//        1. 매개변수와 반환값이 모두 없는 형태
//          연산에 필요한 변수를 메서드 내부에서 선언하고, 사용하고, 삭제함
//          연산 후 그 결과를 메서드 내부에서 표현함
//          연산의 결과가 동일함
//        2. 매개변수는 존재하고, 반환값은 없는 형태
//          연산에 필요한 데이터를 메서드 외부에서 전달받음
//          연산 후 그 결과를 메서드 내부에서 표현함
//          연산의 결과가 입력되는 데이터에 따라 변경됨
//        3. 매개변수는 없고, 반환값은 존재하는 형태
//          연산에 필요한 데이터를 메서드 내부에서 선언하고, 사용하고, 삭제함
//          연산 후 그 결과를 메서드 외부로 되돌려줌
//          연산 결과를 다른 곳에서 활용할 수 있음
//          연산의 결과가 동일함
//        4. 매개변수와 반환값이 모두 존재하는 형태
//          연산에 필요한 데이터를 메서드 외부에서 전달받음
//          연산 후 그 결과를 메서드 외부로 되돌려줌
//          연산 결과를 다른 곳에서 활용할 수 있음
//          연산의 결과가 입력되는 데이터에 따라 변경됨


        int a = 10;
        int b = 20;

        int c = a + b;
        System.out.println("a + b = " + c);

        a = 20;
        b = 10;
        c = a - b;
        System.out.println("a - b = " + c);

        a = 100;
        b = 200;
        c = a + b;
        System.out.println("a + b = " + c);

        a = 100;
        b = 200;
        c = a + b;
        System.out.println("a + b = " + c);

        a = 100;
        b = 200;
        c = a + b;
        System.out.println("a + b = " + c);

        System.out.println("\n ----- 함수를 이용한 실행 -----\n");

        sum();
        sum();
        sum();
        sum();
        sum();

        sub();
        sub();

        multi(10, 20);
        div(10, 3);

        System.out.println("\n----- 메서드의 4가지 형태 -----\n");

        sumType1();

        subType2(10, 20);
        subType2(100, 200);

        int result = multiType3();  // 이 실행한 자리에 return값이 되돌아옴
        System.out.println("두 수의 곱셈은 : " + result);
        System.out.println(result + result);

        double dResult = divType4(10, 3);
        System.out.println("두 수의 나눗셈은 : " + dResult);

    }

    public static void sum() {
        int a = 10;
        int b = 20;
        System.out.println("두 수의 덧셈은 : " + (a + b));
    }

    public static void sub() {
        int a = 10;
        int b = 20;
        System.out.println("두 수의 뺄셈은 : " + (a - b));
    }

    public static void multi(int a, int b) {
        int result = a * b;
        System.out.println("두 수의 곱셈은 : " + result);
    }

    public static void div(double a, double b) {
        int result = (int) (a / b);
        System.out.println("두 수의 나눗셈은 : " + result);
    }


//    매개변수와 반환값이 모두 없는 타입
    public static void sumType1() {
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("두 수의 덧셈은 : " + result); // 반환값이 없으므로 내부에서 출력하는 부분이 필요
    }

//    매개변수는 존재하고 반환값이 없는 타입
    public static void subType2(int a, int b) {
        int result = a - b;
        System.out.println("두 수의 뺄셈은 : " + result);
    }

//    매개변수는 없고 반환값이 존재하는 타입
//    return 키워드 사용 시 반환되는 값의 데이터 타입은 해당 메서드의 반환 타입과 일치해야 함
    public static int multiType3() {  // 반환타입 : int (cf. void : 존재하지않는다라는 뜻)
        int a = 10;
        int b = 20;
        int result = a * b;
        return result;  // 반환
    }

//    매개변수와 반환값이 모두 존재하는 타입
    public static double divType4(int a, int b) {
        double result = a / b;
        return result;
    }
}
