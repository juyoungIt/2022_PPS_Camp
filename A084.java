import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String input = key.nextLine(); // 문자열을 입력받음
        String[] subStr = new String[input.length()]; // 접미사 문자열을 저장

        // 접미사 문자열을 생성
        for(int i=0 ; i<input.length() ; i++)
            subStr[i] = input.substring(i);
        Arrays.sort(subStr); // 사전 순으로 정렬

        for(int i=0 ; i<input.length() ; i++)
            System.out.println(subStr[i]);
    }
}