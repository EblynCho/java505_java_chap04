public class StaticMember {
    public static void main(String[] args) {
//        객체 생성 후 객체의 멤버를 사용
        StaticClass sc1 = new StaticClass();
        sc1.getInfo();
        System.out.println("나이 : " + sc1.age);
        System.out.println("이름 : " + sc1.name);

//        객체의 생성 없이 객체의 멤버와 메소드에 접근 가능
//        StaticClass.name = "유인나"; // error
        StaticClass.job = "가수";
        System.out.println("static 직업 : " + StaticClass.job);
        StaticClass.getJob();

        System.out.println("\n----- -----\n");

//        Calc 클래스의 멤버 메서드인 abs, max, min 이 모두 정적 멤버이기 때문에 객체 생성없이 클래스 이름으로 직접 접근이 가능함
//        정적 멤버는 해당 클래스를 객체화하여 사용 시 객체화된 모든 객체들과 함께 메모리 공간을 공유함
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10, 8));
        System.out.println(Calc.min(-3, -8));

//        정적 멤버도 객체 생성 후 사용이 가능함
        Calc c = new Calc();
        System.out.println(c.abs(-5));
        System.out.println(c.max(10, 8));
        System.out.println(c.min(-3, -8));

        Calc c1 = new Calc();
        Calc c2 = new Calc();

//        일반 멤버를 사용한 연산
        c1.iNum1 = 10;
        c1.iNum2 = 20;
        c1.iResult = c1.iNum1 + c1.iNum2;
        System.out.println("객체 c1의 iResult : " + c1.iResult);

        c2.iNum1 = 200;
        c2.iNum2 = 100;
        c2.iResult = c2.iNum1 + c2.iNum2;
        System.out.println("객체 c2의 iResult : " + c2.iResult);
        System.out.println("객체 c1의 iResult : " + c1.iResult); // c2.iResult, c1.iResult; 서로 영향을 받지 않는다 -> 메모리 공간이 나눠져있어서

        System.out.println();
//        정적 멤버를 사용한 연산
        c1.sNum1 = 10;
        c1.sNum2 = 20;
        c1.sResult = c1.sNum1 + c1.sNum2;
        System.out.println("객체 c1의 sResult : " + c1.sResult);

        c2.sNum1 = 100;
        c2.sNum2 = 200;
        c2.sResult = c2.sNum1 + c2.sNum2;
        System.out.println("객체 c2의 sResult : " + c2.sResult);
        System.out.println("객체 c1의 sResult : " + c1.sResult);
        System.out.println("클래스의 sResult : " + Calc.sResult);


        System.out.println("\n");

//        Tv.info = Tv.company + Tv.model; // 이렇게 쓰는 대신에
        System.out.println(Tv.info);
    }
}
