package level01.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                System.out.println("정렬 된 단어 : " + list);
                break;
            }

            list.add(input);

            Collections.sort(list);
        }
    }
}
