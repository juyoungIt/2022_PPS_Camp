import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int[] stationLog = new int[8];
        for(int i=0 ; i<8 ; i++)
            stationLog[i] = key.nextInt();
        int cur = 0;
        int max = 0;

        for(int i=0 ; i<8 ; i+=2) {
            cur = cur - stationLog[i] + stationLog[i+1];
            if(max < cur)
                max = cur;
        }

        System.out.println(max);
    }
}