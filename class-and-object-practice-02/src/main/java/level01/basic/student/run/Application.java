package level01.basic.student.run;

import level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDTO[] student = new StudentDTO[10];

        int count = 0;

        while(true){

            System.out.print("학년 : ");
            int grade = sc.nextInt();

            System.out.print("반 : ");
            int classroom = sc.nextInt();

            System.out.print("이름 : ");
            String name = sc.next();

            System.out.print("국어점수 : ");
            int kor = sc.nextInt();

            System.out.print("영어점수 : ");
            int eng = sc.nextInt();

            System.out.print("수학점수 : ");
            int math = sc.nextInt();

            student[count] = new StudentDTO(grade, classroom, name, kor, eng, math);

            System.out.print("계속 추가할 겁니까? (y/n) : ");
            String answer = sc.next();

            count++;

            if(answer.equals("n")){
                break;
            }
        }

        for(int i = 0; i < count; i++){
            System.out.println( student[i].getInformation());
        }
    }
}
