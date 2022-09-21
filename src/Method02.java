import  java.util.Scanner;

public class Method02 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        문제 1) 사칙연산을 하기 위한 메서드를 메서드의 4가지 형태로 각각 생성하여 실행하는 프로그램을 작성하세요
//        1. 더하기, 빼기, 곱하기, 나누기 를 각각 4가지 형태로 생성
//        2. 1번 타입의 함수 이름 : sum1, sub1, multi1, div1
//           2번 타입의 함수 이름 : sum2, sub2, multi2, div2
//           3번 타입의 함수 이름 : sum3, sub3, multi3, div3
//           4번 타입의 함수 이름 : sum4, sub4, multi4, div4
//        3. 각각의 함수를 모두 실행하여 결과를 확인

        sum1();
        sub1();
        multi1();
        div1();

        sum2(30, 10);
        sub2(30, 10);
        multi2(30, 10);
        div2(30, 10);

        int result = sum3();
        System.out.println("3번 타입 더하기 : " + result);
        result = sub3();
        System.out.println("3번 타입 빼기 : " + result);
        result = multi3();
        System.out.println("3번 타입 곱하기 : " + result);
        result = div3();
        System.out.println("3번 타입 나누기 : " + result);


        int iResult = sum4(50, 10);
        System.out.println("4번 타입 더하기 : " + iResult);
        iResult = sub4(50, 10);
        System.out.println("4번 타입 더하기 : " + iResult);
        iResult = multi4(50, 10);
        System.out.println("4번 타입 더하기 : " + iResult);
        iResult = div4(50, 10);
        System.out.println("4번 타입 더하기 : " + iResult);


//        문제 2) 사용자 입력을 통해서 2 ~ 9까지의 숫자를 입력받아 해당하는 단수의 구구단을 출력하는 프로그램을 작성하세요
//        1. 구구단을 출력하는 부분을 함수로 구현 (함수명 : gugudan)
//        2. 사용자 입력 부분은 함수로 구현해도 되고 안해도 됨
        System.out.print("출력하고자 하는 구구단의 단수를 입력하세요 ");
        gugudan();

//        문제 3) 사용자 입력을 통해서 국어, 영어, 수학의 점수 3개를 입력받고, 총점과 평균, 등급을 출력하는 프로그램을 작성하세요
//        1. 등급 계산 부분을 함수로 구현 (함수명 : scores) - else if
//        2. 총점과 평균 계산 부분을 함수로 구현 (함수명 : average)
        System.out.print("국어, 영어, 수학의 점수를 입력하세요 ");

        int total = scores();
        average(total);

    }

//    1. 매개변수와 반환값이 모두 없는 타입
    public static void sum1() {
        int a = 20;
        int b = 10;
        int result = a + b;
        System.out.println("1번 타입 더하기 : " + result);
    }
    public static void sub1() {
        int a = 20;
        int b = 10;
        int result = a - b;
        System.out.println("1번 타입 빼기 : " + result);
    }
    public static void multi1() {
        int a = 20;
        int b = 10;
        int result = a * b;
        System.out.println("1번 타입 곱하기 : " + result);
    }
    public static void div1() {
        int a = 20;
        int b = 10;
        int result = a / b;
        System.out.println("1번 타입 나누기 : " + result);
    }

//    매개변수는 존재하고 반환값이 없는 타입
    public static void sum2(int a, int b) {
        int result = a + b;
        System.out.println("2번 타입 더하기 : " + result);
    }
    public static void sub2(int a, int b) {
        int result = a - b;
        System.out.println("2번 타입 빼기 : " + result);
    }
    public static void multi2(int a, int b) {
        int result = a * b;
        System.out.println("2번 타입 곱하기 : " + result);
    }
    public static void div2(int a, int b) {
        int result = a / b;
        System.out.println("2번 타입 나누기 : " + result);
    }

//    매개변수는 없고 반환값이 존재하는 타입
    public static int sum3() {
        int a = 40;
        int b = 10;
        int result = a + b;
        return result;
    }
    public static int sub3() {
        int a = 40;
        int b = 10;
        int result = a - b;
        return result;
    }
    public static int multi3() {
        int a = 40;
        int b = 10;
        int result = a * b;
        return result;
    }
    public static int div3() {
        int a = 40;
        int b = 10;
        int result = a / b;
        return result;
    }
//    매개변수와 반환값이 모두 존재하는 타입
    public static int sum4(int a, int b) {
        int result = a + b;
        return result;
    }
    public static int sub4(int a, int b) {
        int result = a - b;
        return result;
    }
    public static int multi4(int a, int b) {
        int result = a * b;
        return result;
    }
    public static int div4(int a, int b) {
        int result = a / b;
        return result;
    }

//    문제 2)
    public static void gugudan() {
        int a = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }

//    문제 3)
    public static int scores() {
        int array[];
        array = new int[3];
        int total = 0;

        for (int i = 0; i < 3; i++) {
            array[i] = scanner.nextInt();
            total += array[i];
        }

        int grade = total / array.length;

        if (grade >= 90) {
            System.out.println("당신의 등급은 A입니다");
        } else if (grade >= 80) {
            System.out.println("당신의 등급은 B입니다");
        } else if (grade >= 70) {
            System.out.println("당신의 등급은 C입니다");
        } else if (grade >= 60) {
            System.out.println("당신의 등급은 D입니다");
        } else {
            System.out.println("당신의 등급은 F입니다");
        }

        return total;
    }
    public static void average(double total) {
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + total / 3);
    }
}
