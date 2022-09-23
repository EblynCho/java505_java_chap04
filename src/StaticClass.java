public class StaticClass {
    public String name;
    public int age;

    public static String job;
    public StaticClass() {
        this("아이유");
    }

    public StaticClass(String name) {
        this(name, 30);
    }
    public StaticClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void getJob() {
        System.out.println("static 직업 : " + job);
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void getInfo() {
        System.out.println("이름 : " + this.name + "\n나이 : " + this.age);
    }
}
