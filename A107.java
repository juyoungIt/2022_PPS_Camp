import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num1 = key.nextInt();
        int num2 = key.nextInt();
        int sum = 0; // 숫자의 합

        for(int i=num1 ; i<=num2 ; i++)
            sum += findValue(i);

        System.out.println(sum);
    }

    // 해당 index가 어떤 값인지를 반환
    public static int findValue(int n) {
        int i=1;
        while(n > i*(i+1)/2)
            i++;
        return i;
    }
}