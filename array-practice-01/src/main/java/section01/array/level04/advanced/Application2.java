package section01.array.level04.advanced;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        // 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장
        int[] arr = new int[4];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randNum;
            boolean unique;
            do {
                unique = true;
                randNum = rand.nextInt(10);
                // 중복 체크
                for (int j = 0; j < i; j++) {
                    if (arr[j] == randNum) {
                        unique = false;
                        break;
                    }
                }
            } while (!unique);
            arr[i] = randNum;
        }

        Scanner sc = new Scanner(System.in);
        int attempts = 10;

        while (attempts > 0) {
            System.out.println(attempts + "회 남으셨습니다.");
            System.out.print("4자리 숫자를 입력하세요: ");
            String input = sc.nextLine();

            if (input.length() != 4 || !input.matches("\\d{4}")) {
                System.out.println("4자리의 정수를 입력해야 합니다.");
                continue;
            }

            int strike = 0;
            int ball = 0;

            for (int i = 0; i < 4; i++) {
                int inputDigit = Character.getNumericValue(input.charAt(i));

                if (inputDigit == arr[i]) {
                    strike++;
                } else if (contains(arr, inputDigit)) {
                    ball++;
                }
            }

            if (strike == 4) {
                System.out.println("정답입니다.");
                return; // 게임 종료
            } else {
                System.out.println("아쉽네요 " + strike + "S " + ball + "B 입니다.");
            }

            attempts--;
        }

        System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
    }

    // 배열에 특정 숫자가 포함되어 있는지 확인하는 메서드
    public static boolean contains(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}
