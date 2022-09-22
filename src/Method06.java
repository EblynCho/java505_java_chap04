public class Method06 {
    public static void main(String[] args) {
        Car6 colorado = new Car6();
        colorado.name = "콜로라도";
        colorado.size = "중형";

        colorado.getInfo();
        colorado.setInfo("렉스턴 칸", "중형"); // 일반적인 데이터 입력 방법
        colorado.getInfo();
    }
}
