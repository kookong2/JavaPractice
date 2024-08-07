package level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String input = sc.nextLine();

        // 입력을 소문자로 변환
        input = input.toLowerCase();

        // 단어로 분리
        String[] words = input.split("[^a-z]+");

        // 단어와 빈도를 저장할 StringBuilder 배열과 빈도 수를 저장할 int 배열 생성
        StringBuilder[] uniqueWords = new StringBuilder[words.length];
        int[] counts = new int[words.length];
        int uniqueWordCount = 0;

        // 단어 빈도 계산
        for (String word : words) {
            if (!word.isEmpty()) {
                boolean found = false;
                for (int i = 0; i < uniqueWordCount; i++) {
                    if (uniqueWords[i].toString().equals(word)) {
                        counts[i]++;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    uniqueWords[uniqueWordCount] = new StringBuilder(word);
                    counts[uniqueWordCount] = 1;
                    uniqueWordCount++;
                }
            }
        }

        // 결과 출력
        System.out.println("===== 단어 빈도 =====");
        StringBuilder mostFrequentWord = new StringBuilder();
        int maxCount = 0;

        for (int i = 0; i < uniqueWordCount; i++) {
            System.out.println(uniqueWords[i] + ": " + counts[i]);
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                mostFrequentWord = uniqueWords[i];
            }
        }

        System.out.println("가장 빈도 높은 단어 : " + mostFrequentWord + " (" + maxCount + " 번)");
    }
}
