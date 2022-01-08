import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num = 1;
        int[] count = new int[10];
        for(int i=0 ; i<3 ; i++)
            num *= key.nextInt();

        while(num/10 >= 1) {
            count[num%10]++;
            num /= 10;
        }
        count[num%10]++;

        for(int n : count)
            System.out.println(n);
    }
}