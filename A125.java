import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int ropeCount = key.nextInt(); // 로프의 수 (k)
        int[] ropeCoverage = new int[ropeCount]; // 각 로프의 최대중량 값
        for(int i=0 ; i<ropeCount ; i++)
            ropeCoverage[i] = key.nextInt();
        int maxWeight = 0; // 감당할 수 있는 물체의 최대무게
        int weight; // 현재 로프 조합에서 감당할 수 있는 물체의 최대무게

        Arrays.sort(ropeCoverage); // 로프최대한도 무게 기준 정렬

        // 감당할 수 있는 최대무게를 계산
        for(int i=0 ; i<ropeCount ; i++) {
            weight = ropeCoverage[i] * (ropeCount-i);
            if(maxWeight < weight)
                maxWeight = weight;
        }

        System.out.println(maxWeight);
    }
}