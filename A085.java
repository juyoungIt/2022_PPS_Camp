import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int tcSize = key.nextInt(); // 테스트 케이스의 수를 입력
        key.nextLine(); // for buffer cleaning
        ArrayList<String> input = new ArrayList<>(); // 입력 문자열을 저장하는 arraylist
        ArrayList<String> result = new ArrayList<>(); // 결과값을 저장하는 arraylist

        // 문자열을 입력
        for(int i=0 ; i<tcSize ; i++)
            input.add(key.nextLine());

        sortByDictOrder(input); // 사전 순으로 주어진 문자열들을 정렬
        sortByDigitSum(input);  // 각 자리의 sum으로 주어진 문자열을 정렬
        sortByLength(input, result); // 각 문자열의 길이를 기준으로 정렬

        for(String s : result)
            System.out.println(s);
    }

    // 문자열의 길이를 기준으로 string 을 sorting 함
    public static void sortByLength(ArrayList<String> input, ArrayList<String> result) {
        int minLen; // 가장 짧은 문자열의 길이
        int minIdx; // 가장 짧은 길이를 가지는 원소의 index

        while (input.size() != 0) {
            minIdx = 0;
            minLen = input.get(minIdx).length();
            for (int j = 1; j < input.size(); j++) {
                if (minLen > input.get(j).length()) {
                    minLen = input.get(j).length();
                    minIdx = j;
                }
            }
            result.add(input.get(minIdx));
            input.remove(minIdx); // 다음번 탐색결과에서 제외시키기 위함
        }
    }

    // 주어진 문자열들을 사전순서로 정렬함
    public static void sortByDictOrder(ArrayList<String> input) {
        Collections.sort(input); // arraylist 내의 문자열들을 사전 순으로 정렬
    }

    // 주어진 문자열의 digit sum 값을 구함
    public static int getDigitSum(String str) {
        int sum = 0;
        for(int i=0 ; i<str.length() ; i++) {
            if(Character.isDigit(str.charAt(i)))
                sum += Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }

    // 주어진 문자열들을 digit sum의 값을 기준으로 정렬함
    public static void sortByDigitSum(ArrayList<String> input) {
        for(int i=input.size()-1 ; i>=0 ; i--) {
            for(int j=1 ; j<=i ; j++) {
                if(getDigitSum(input.get(j-1)) > getDigitSum(input.get(j)))
                    Collections.swap(input,j-1, j);
            }
        }
    }
}