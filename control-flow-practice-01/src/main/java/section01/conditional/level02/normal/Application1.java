package section01.conditional.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* 1 ~ 10 사이의 정수 한 개를 입력받아 홀수인지 짝수인지 확인하고,
        * 홀수인지 짝수인지 출력하세요
        * 단, 1 ~ 10 사이의 정수가 아닌 경우 반드시 입력해야 함을 출력 */

        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 10 사의 정수 입력 : ");
        int num = sc.nextInt();

        if(num >= 10 || num < 0){
            System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
        }else {
            if(num % 2 == 0){
                System.out.println("짝수다.");
            }else{
                System.out.println("홀수다.");
            }
        }
    }
}
