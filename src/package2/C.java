package package2;

//// class A는 접근제한자를 default로 사용하고 있어 다른 패키지에서 사용할 수 없음
////import package1.A;
//// class B는 접근제한자를 public으로 사용하고 있어 다른 패키지에서 사용할 수 있음
//import package1.B;
//
//public class C {
////    A a; // error; 다른 패키지에 접근 불가
//    B b;
//}


import package1.A;

//// 다른 패키지에 있는 클래스 A를 사용하여 객체 생성
//public class C {
////    클래스 A의 생성자 중 public을 사용한 생성자로 객체 생성
////    public을 사용하여 다른 패키지에서 사용 가능
//    A a1 = new A(true);
////    클래스 A의 생성자 중 default를 사용한 생성자로 객체 생성을 시도하여 오류 발생
////    default는 동일한 패키지 내에서만 사용이 가능, 다른 패키지에서는 사용 불가
////    A a2 = new A(1);
////    클래스 A의 생성자 중 private을 사용한 생성자로 객체 생성을 시도하여 오류 발생
////    private은 해당 클래스 내에서만 사용 가능
////    A a3 = new A("문자열")
//}


public class C {
    public C() {
        A a = new A();
        a.value1 = 1000;
//        클래스 A의 value2는 default를 사용하여 다른 패키지에서 접근 불가
//        a.value2 = 2000; // error
//        클래스 A의 value3은 private을 사용하여 클래스 외부에서 접근 불가
//        a.value3 = 3000; // error

        a.method1();
//        클래스 A의 method2()는 default를 사용하여 다른 패키지에서 접근 불가
//        a.method2(); // error
//        클래스 A의 method3()은 private을 사용하여 클래스 외부에서 접근 불가
//        a.method3(); // error
    }
}