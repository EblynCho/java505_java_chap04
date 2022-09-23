public class GetterSetterEx {
    public static void main(String[] agrs) {
        BMI gildong = new BMI();
        gildong.name = "홍길동";
        gildong.height = 180;
        gildong.weight = 75;
//        bmi는 private으로 설정되어 있어 외부 접근 불가
//        gildong.bmi = 22; // error
        System.out.println(gildong.name + "의 키는 " + gildong.height + "cm\n" + gildong.name + "의 몸무게는 " + gildong.weight + "kg");
        gildong.setMyInfo(180, 75);
        System.out.println(gildong.name + "의 bmi는 " + gildong.getBmi());

        GetSet gs = new GetSet();
        gs.value1 = "public 멤버 변수";
        System.out.println(gs.value1);
        gs.setValue2("private 멤버 변수");
        System.out.println(gs.getValue2());
    }
}
