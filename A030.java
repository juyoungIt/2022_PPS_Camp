import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();         // N일
        int firstMood = key.nextInt(); // 첫날의 기분 (0:좋은 날, 1:싫은 날)
        double[] prob = new double[4]; // 각 기분에 대한 확률
        for(int i=0 ; i<4 ; i++)
            prob[i] = key.nextDouble();
        double q = (firstMood == 0) ? 1 : 0;

        // N일 뒤 기분이 좋을 확률
        for(int i=0 ; i<n ; i++)
            q = q * prob[0] + (1-q) * prob[2];

        System.out.println(Math.round(q * 1000));
        System.out.println(Math.round((1-q) * 1000));
    }
}