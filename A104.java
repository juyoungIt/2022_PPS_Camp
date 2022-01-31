import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int minCost = 0; // 모든 마을을 여행하기 위해 필요한 최소비용
        int townNum = key.nextInt(); // 마을의 수
        key.nextLine(); // for buffer cleaning
        int[] costs = new int[townNum]; // 마을 간 이동에 필요한 비용
        for(int i=0 ; i<townNum ; i++)
            costs[i] = key.nextInt();
        key.nextLine(); // for buffer cleaning

        Arrays.sort(costs); // 비용을 크기 순으로 정렬
        for(int i=0 ; i<townNum-1 ; i++)
            minCost += costs[i];
        System.out.println(minCost);
    }
}