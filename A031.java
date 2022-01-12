import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt(); // 초콜릿의 크기 N의 값
        int m = key.nextInt(); // 초콜릿의 크기 M의 값
        int dCount = 0;     // 나누는 데 필요한 최소한의 횟수

        dCount = n * m - 1;

        System.out.println(dCount);
    }
}