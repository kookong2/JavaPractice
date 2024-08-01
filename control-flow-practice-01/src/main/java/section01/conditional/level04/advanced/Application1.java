package section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요 : ");
        int korean = sc.nextInt();

        System.out.print("영어 점수를 입력하세요 : ");
        int english = sc.nextInt();

        System.out.print("수학 점수를 입력하세요 : ");
        int math = sc.nextInt();

        int average = (korean + english + math) / 3;
        boolean isPass = true;

        if (average < 60) {
            System.out.println("평균 점수 미달로 불합격입니다.");
            isPass = false;
        }

        if (korean < 40) {
            System.out.println("국어 점수 미달로 불합격입니다.");
            isPass = false;
        }

        if (english < 40) {
            System.out.println("영어 점수 미달로 불합격입니다.");
            isPass = false;
        }

        if (math < 40) {
            System.out.println("수학 점수 미달로 불합격입니다.");
            isPass = false;
        }

        if (isPass) {
            System.out.println("합격입니다!");
        }
    }
}
