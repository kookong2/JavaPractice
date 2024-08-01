package section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String str = in.nextLine();

        // 영문자 체크
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!(Character.isLowerCase(currentChar) || Character.isUpperCase(currentChar))) {
                System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
                return;
            }
        }

        System.out.print("문자 입력 : ");
        char ch = in.next().charAt(0);

        int count = 0;

        // 개수 새기
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("포함된 개수 : " + count + "개");
    }
}
