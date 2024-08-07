package level01.basic;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < words.length; i++) {
            char firstChar = Character.toUpperCase(words[i].charAt(0));

            String restWord = words[i].substring(1);

            result.append(firstChar).append(restWord).append(" ");
        }

        System.out.println("변환된 문자열 : " + result);
    }


}
