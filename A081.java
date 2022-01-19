import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int tcSize = key.nextInt();
        Integer[] nums = new Integer[10]; // test case 의 10개의 원소를 저장

        for(int i=0 ; i<tcSize ; i++) {
            // 테스트 케이스를 입력받음
            for(int j=0 ; j<10 ; j++)
                nums[j] = key.nextInt();
            Arrays.sort(nums, Collections.reverseOrder()); // 오름차순 정렬
            System.out.println(nums[2]); // 3번째로 큰 원소를 읽어 출력
        }
    }
}