import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for (int i = 0; i < n; i++)
            arrA[i] = key.nextInt();
        for (int i = 0; i < n; i++)
            arrB[i] = key.nextInt();
        int s = 0;

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        for(int i=0 ; i<n ; i++)
            s += arrA[i] * arrB[n-1-i];

        System.out.println(s);
    }
}