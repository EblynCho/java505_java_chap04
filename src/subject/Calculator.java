package subject;

public class Calculator {
    private int num1;
    private int num2;
    private int result;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = 0;
    }

    public void sum() {
        this.result = this.num1 + this.num2;
        System.out.println("두 수의 덧셈은 : " + this.result);
    }

    public void sub() {
        result = num1 - num2;
        System.out.println("두 수의 뺄셈은 : " + result);
    }

    public void multi() {
        result = num1 * num2;
        System.out.println("두 수의 곱셈은 : " + result);
    }

    public void div() {
        result = num1 / num2;
        System.out.println("두 수의 나눗셈은 : " + result);
    }
}
