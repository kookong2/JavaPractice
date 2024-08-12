package level01.basic;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        List<String> urlList =  new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            String url = sc.nextLine();

            if(Objects.equals(url, "exit")){
                break;
            }

            Collections.reverse(urlList);

            urlList.add(url);

            Collections.reverse(urlList);


            System.out.println(urlList);

        }
    }
}
