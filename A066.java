import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String result = "";
        Scanner key = new Scanner(System.in);
        String input = key.nextLine(); // 초기 입력 string
        ArrayList<Integer> arr = new ArrayList<>(); // 입력된 수들을 저장하는 배열
        for(int i=0 ; i<input.length() ; i++)
            arr.add(Character.getNumericValue(input.charAt(i)));

        Collections.sort(arr); // 내림차순으로 정렬
        for(int n : arr)
            result = n + result;

        System.out.println(result);
    }
}