package section01.array.level01.basic;

public class Application1 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
    }
}
