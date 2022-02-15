import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int tcSize = key.nextInt(); // 테스트 케이스의 수
        int[] tc = new int[tcSize]; // 테스트 케이스를 저장
        int k; // 정류장의 수
        int passengers; // 승객의 수

        // 각 테스트 케이스를 입력받음
        for(int i=0 ; i<tcSize ; i++)
            tc[i] = key.nextInt();

        // 각 case별로 처음에 탑승하고 있던 승객의 수를 계산하여 출력
        for(int i=0 ; i<tcSize ; i++) {
            k = tc[i];
            passengers = 0; // 재사용을 위한 초기화
            while(k > 0) {
                passengers = passengers * 2 + 1;
                k--;
            }
            System.out.println(passengers);
        }
    }
}