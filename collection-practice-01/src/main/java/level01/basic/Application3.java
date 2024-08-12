package level01.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        Queue<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            }

            if (input.equals("next")) {
                if (list.isEmpty()) {
                    System.out.println("대기 고객이 없습니다.");
                } else {
                    System.out.println(list.poll() + " 고객님 차례입니다.");
                }
            } else {
                list.offer(input);
            }
        }
    }
}
