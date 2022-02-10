import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int numSize = key.nextInt();   // 입력받을 숫자의 갯수
        int[] nums = new int[numSize]; // 입력받은 수를 저장
        for(int i=0 ; i<numSize ; i++)
            nums[i] = key.nextInt();
        int sum = 0; // 산술평균을 구하기 위한 합산
        ArrayList<Integer> arr = new ArrayList<>();   // 고유한 원소값을 저장
        int mode; // 최빈값

        Arrays.sort(nums); // 주어진 수를 정렬
        arr.add(nums[0]);
        for(int i=0 ; i<numSize ; i++) {
            sum += nums[i];
            if(i > 0 && nums[i-1] != nums[i])
                arr.add(nums[i]);
        }

        // 최빈값을 구하기 위한 2차원 배열 생성
        int[][] modeArr = new int[arr.size()][2];
        for(int i=0 ; i<arr.size() ; i++)
            modeArr[i][0] = arr.get(i);

        // 최빈값을 구하기 위해 정의한 2차원 배열값을 업데이트
        for(int i=0 ; i<numSize ; i++) {
            int idx = arr.indexOf(nums[i]);
            modeArr[idx][1]++; // 빈도수 1을 증가
        }

        // 카운트된 값을 기준으로 2차원 배열을 정렬
        Arrays.sort(modeArr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return o2[0] - o1[0];
                }
                else {
                    return o1[1] - o2[1];
                }
            }
        });

        // 최빈값을 산출
        if(numSize > 1) {
            if(modeArr[arr.size()-2][1] == modeArr[arr.size()-1][1])
                mode = modeArr[arr.size()-2][0];
            else
                mode = modeArr[arr.size()-1][0];
        }
        else {
            mode = modeArr[arr.size()-1][0];
        }

        System.out.println(Math.round((double)sum / numSize)); // 산술평균
        System.out.println(nums[numSize/2]);                   // 중앙값
        System.out.println(mode);                              // 최빈값
        System.out.println(nums[numSize-1] - nums[0]);         // 범위
    }
}