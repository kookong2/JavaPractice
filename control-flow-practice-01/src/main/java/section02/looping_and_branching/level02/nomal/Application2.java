package section02.looping_and_branching.level02.nomal;

public class Application2 {
    public static void main(String[] args) {
        /* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요
         *
         * -- 출력 예시 --
         * abcdefghijklmnopqrstuvwxyz
         * */

        String alpabet = String.valueOf(75);

        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch);
        }
    }
}
