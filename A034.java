import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i=0 ; i<10 ; i++)
            hashSet.add(key.nextInt() % 42); // 42로 나눈 나머지 값을 계산후 hashset에 추가

        System.out.println(hashSet.toArray(new Integer[0]).length);
    }
}