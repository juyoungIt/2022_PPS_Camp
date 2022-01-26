import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        long size = key.nextLong();  // 문의 수
        long prev = key.nextLong(); // 처음 문을 여는 방식
        ArrayList<Long> arr = new ArrayList<>();

        for(int i=2 ; i<=size ; i++) {
            if(i%2==0 && i%3==0) {
                System.out.println("Love is open door");
                System.exit(0);
            }
            if(prev == 0) {
                arr.add(1L);
                prev = 1;
            }
            else {
                arr.add(0L);
                prev = 0;
            }
        }

        for (Long num : arr)
            System.out.println(num);
    }
}