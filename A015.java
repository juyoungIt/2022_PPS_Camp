import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double[] arr = new double[5];
        int sum = 0; // 각 자리 수에 대한 제곱의 합

        for(int i=0 ; i<5 ; i++) {
            arr[i] = Math.pow(key.nextInt(), 2);
            sum += arr[i];
        }

        System.out.println(sum%10);
    }
}