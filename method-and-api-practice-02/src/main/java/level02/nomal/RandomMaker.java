package level02.nomal;

import java.util.Random;

public class RandomMaker {
    Random rand = new Random();

    // 최소값부터 최대값까지 범위의 난수 반환함
    public int randomNumber(int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    // 인자의 길이 만큼의 랜덤한 대문자 알파벳으로 이루어진 문자열 반환
    public String randomUpperAlpabet(int length){
        String string = "";
        for(int i = 0; i < length; i++){
            string += (char)('A' + rand.nextInt(26));
        }
        return string;
    }

    // 가위, 바위, 보 중 한 가지를 반환함
    public String rockPaperScissors(){
        String result = "";
        int randomNum = rand.nextInt(3) + 1;
        if(randomNum == 1){
            result = "주먹";
        }else if(randomNum == 2){
            result = "가위";
        }else
            result = "보";

        return result;
    }

    // 동전의 앞면, 뒷면 중 한 가지를 반환함
    public String tossCoin(){
        String result = "";
        int randomNum = rand.nextInt(2) + 1;
        if(randomNum == 1){
            result = "앞면";
        }else
            result = "뒷면";

        return result;
    }
}
