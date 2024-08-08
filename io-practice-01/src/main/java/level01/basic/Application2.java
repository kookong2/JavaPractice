package level01.basic;

import java.io.*;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * (원본 파일이 존재 하는 경우)
         * 원본 파일의 이름을 입력하세요 : origin.txt
         * 복사 파일의 이름을 입력하세요 : copy.txt
         *
         * ----- 출력 예시 -----
         *
         * 파일 복사가 성공적으로 완료 되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * (원본 파일이 존재하지 않는 경우)
         * 원본 파일의 이름을 입력하세요 : origin2.txt안녕 니 키보드 엄청 좋다
         * 복사 파일의 이름을 입력하세요 : copy2.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : origin2.txt (지정된 파일을 찾을 수 없습니다)
         *
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("원본 파일의 이름을 입력하세요 : ");
        String originFileName = sc.nextLine();

        System.out.print("복사 파일의 이름을 입력하세요  : ");
        String copyFileName = sc.nextLine();

        try(FileReader fileReader = new FileReader(originFileName);
                FileWriter fileWriter = new FileWriter(copyFileName)) {

            char[] buf = new char[1024];
            int len;

            while ((len = fileReader.read(buf)) > 0) {
                fileWriter.write(buf, 0, len);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("오류 : " + originFileName + "(지정된 파일을 찾을 수 없습니다)");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
