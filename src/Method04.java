import java.util.Arrays;
import java.util.Scanner;

public class Method04 {
    public static void main(String[] args) {

//        문제 1) 책 126페이지의 5번 문제를 풀고, 메서드를 사용하는 방식으로 변환하세요
//        Arrays 클래스의 정렬 메서드 sort()를 사용하여 정렬
//        int nums[] = {10, 50 , 80, 70, 20};
//        Arrays.sort(nums);

//        Scanner scanner = new Scanner(System.in);
//        int array1[];
//        array1 = new int[10];
//
//        System.out.print("정수 10개 입력>> ");
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = scanner.nextInt();
//        }
//        System.out.println();
//
//        Arrays.sort(array1);
//        for (int i = 0; i < array1.length; i++) {
//            System.out.print(array1[i] + " ");
//        }
//        System.out.println();
//
        int array1[] = input();
        output(array1);

//        Bubble sort
        for (int i = 0; i < array1.length; i++) {
            for (int j = i; j < array1.length; j++) {
                if (array1[i] > array1[j]) {
                    int tmp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = tmp;
                }
            }
        }
    }

    public static int[] input() {
        Scanner scanner = new Scanner(System.in);
        int array1[] = new int[10];

        System.out.print("정수 10개 입력>> ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        return array1;
    }

    public static void output(int array1[]) {
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
    }
}

