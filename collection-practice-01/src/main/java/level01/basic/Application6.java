package level01.basic;

import java.util.HashMap;
import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        HashMap<String, String> list = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            String input = sc.nextLine().trim();

            if(input.equals("exit")) break;

            if(input.equals("search")) {
                System.out.print("검색할 이름을 입력하세요: ");
                String name = sc.nextLine().trim();
                if(list.containsKey(name)) {
                    System.out.println(name + "씨의 전화번호: " + list.get(name));
                } else {
                    System.out.println(name + "씨의 번호는 등록되어 있지 않습니다.");
                }
                continue;
            }

            String[] parts = input.split(" ", 2);
            if(parts.length == 2) {
                list.put(parts[0], parts[1]);
                System.out.println("추가 완료 : " + parts[0] + " " + parts[1]);
            } else {
                System.out.println("입력이 잘못되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
            }
        }
    }
}
