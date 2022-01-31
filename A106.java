import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean[] alpha = new boolean[26]; // 알파벳의 등장여부 저장
        int tcSize = key.nextInt(); // 테스트 케이스의 수
        key.nextLine(); // for buffer cleaning
        String[] tc = new String[tcSize]; // 테스트 케이스 저장
        int asciiSum = 0; // 사용되지 않은 문자에 대한 아스키 코드값의 합

        // 테스트 케이스 입력
        for(int i=0 ; i<tcSize ; i++)
            tc[i] = key.nextLine();

        for(int i=0 ; i<tcSize ; i++) {
            for(int j=0 ; j<tc[i].length() ; j++)
                alpha[(int)tc[i].charAt(j)-65] = true;
            for(int j=0 ; j<26 ; j++) {
                if(!alpha[j])
                    asciiSum += j+65;
            }
            // 처리결과를 출력
            System.out.println(asciiSum);
            // 재사용을 위해 관련변수 초기화
            asciiSum = 0;
            Arrays.fill(alpha, false);
        }
    }
}