import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int numCount = key.nextInt(); // 입력하는 숫자의 수
        int[] nums = new int[numCount];
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0 ; i<numCount ; i++)
            nums[i] = key.nextInt();
        Arrays.sort(nums); // 정렬을 수행

        for(int i=0 ; i<numCount ; i++) {
            if(!arr.contains(nums[i]))
                arr.add(nums[i]);
        }
        for(int i=0 ; i<arr.size() ; i++)
            System.out.print(arr.get(i) + " ");
    }
}