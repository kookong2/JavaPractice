package level01.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        LinkedList<Integer> scores = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // 점수 입력 및 추가 여부 확인
        while (true) {
            System.out.print("학생 성적: ");
            int score = scanner.nextInt();
            scores.add(score);

            System.out.print("추가 입력하려면 y : ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }

        // 학생 인원 수 및 평균 점수 계산
        int numOfStudents = scores.size();
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double averageScore = (double) sum / numOfStudents;

        // 결과 출력
        System.out.println("학생 인원 : " + numOfStudents);
        System.out.printf("평균 점수 : %.1f%n", averageScore);


    }
}
