import java.util.Scanner;

public class Method03 {
    public static void main(String[] args) {
//        ===== 1번 =====
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("출력할 구구단 단수를 입력하세요 : ");
//        int dansu = scanner.nextInt();
//
//        gugudan(dansu);

//        ----- Method 사용 -----
//        int dansu = input();
//        output(dansu);

//        ===== 2번 =====
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("점수를 입력해주세요 : ");
//        int score = scanner.nextInt();
//
//        String level = "F";
//
//        if (score >= 90) {
//            level = "A";
//        } else if (score >= 80) {
//            level = "B";
//        } else if (score >= 70) {
//            level = "C";
//        } else if (score >= 60) {
//            level = "D";
//        }
//
//        System.out.println("당신의 점수는 " + score + "점이며, 등급은 " + level + "입니다.");

//        ----- Method 사용 -----
//        int score = inputScore();
//        String level = calLevel(score);
//        printResult(score, level);


//        ===== 3번 =====
        int kor = 0;
        int eng = 0;
        int math = 0;
        int total = 0;
        double avg = 0.0;
        String level = "F";

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("국어 점수를 입력해주세요 : ");
//        kor = scanner.nextInt();
//        System.out.print("영어 점수를 입력해주세요 : ");
//        eng = scanner.nextInt();
//        System.out.print("수학 점수를 입력해주세요 : ");
//        math = scanner.nextInt();
//
//        total = kor + eng + math;
//        avg = (double) total / 3;
//
//        if (avg >= 90) {
//            level = "A";
//        } else if (avg >= 80) {
//            level = "B";
//        } else if (avg >= 70) {
//            level = "C";
//        } else if (avg >= 60) {
//            level = "D";
//        }
//
//        System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점이며, 등급은 " + level + "입니다.");

//        ----- Method 사용 -----
        kor = scoreInput("국어");
        eng = scoreInput("영어");
        math = scoreInput("수학");

//        System.out.println("국어 점수 : " + kor + ", 영어 점수 : " + eng + ", 수학 점수 : " + math);

        total = totalCal(kor, eng, math);
//        System.out.println("총합 : " + total);

        avg = avgCal(total);
//        System.out.println("평균 : " + avg);

        level = levelCal(avg);
//        System.out.println("등급 : " + level);

        resultPrint(total, avg, level);
    }

    public static int input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 구구단 단수를 입력하세요 : ");
        int dansu = scanner.nextInt();
        return dansu;
    }
    public static void output(int dansu) {
        for (int i = 1; i < 10; i++) {
            System.out.println(dansu + " * " + i + " = " + dansu * i);
        }
    }

    public static int inputScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해주세요 : ");
        int score = scanner.nextInt();

        return score;
    }
    public static String calLevel(int score) {
        String level = "F";
        if (score >= 90) {
            level = "A";
        } else if (score >= 80) {
            level = "B";
        } else if (score >= 70) {
            level = "C";
        } else if (score >= 60) {
            level = "D";
        }

        return level;
    }
    public static void printResult(int score, String level) {
        System.out.println("당신의 점수는 " + score + "점이며, 등급은 " + level + "입니다.");
    }

    public static int scoreInput(String course) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(course + "점수를 입력해주세요 : ");
        int score = scanner.nextInt();

        return score;
//        중복 소스 제거
//        System.out.print("영어 점수를 입력해주세요 : ");
//        int eng = scanner.nextInt();
//        System.out.print("수학 점수를 입력해주세요 : ");
//        int math = scanner.nextInt();

//        System.out.println("국어 점수 : " + kor + ", 영어 점수 : " + eng + ", 수학 점수 : " + math); // 입력 잘 되었는지 확인
    }
    public static int totalCal(int kor, int eng, int math) {
        return kor + eng + math;
    }
    public static double avgCal(int total) {
        return (double)total / 3;
    }
    public static String levelCal(double avg) {
        String level = "F";
        if (avg >= 90) {
            level = "A";
        } else if (avg >= 80) {
            level = "B";
        } else if (avg >= 70) {
            level = "C";
        } else if (avg >= 60) {
            level = "D";
        }
        return level;
    }
    public static void resultPrint(int total, double avg, String level) {
        System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점이며, 등급은 " + level + "입니다.");
    }
}
