import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        ArrayList<String> numStrs = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int m = key.nextInt();
        int n = key.nextInt();
        key.nextLine(); // for buffer cleaning...

        // 주어진 범위의 수를 문자열로 처리함
        for(int i=m ; i<=n ; i++)
            numStrs.add(numToString(i));
        Collections.sort(numStrs); // 사전 순으로 정렬함

        // 문자열로 이뤄진 정렬결과를 숫자로 다시 변환
        for (String numStr : numStrs)
            result.add(stringToNum(numStr));

        // 처리된 결과를 10개씩 끊어서 출력
        for(int i=1 ; i<=result.size() ; i++) {
            // 10개씩 끊어서 출력하기 위함
            if(i%10 == 0)
                System.out.println(result.get(i-1));
            else
                System.out.print(result.get(i-1) + " ");
        }
    }

    public static String digitToString(int digit) {
        if(digit == 0) return "zero";
        else if(digit == 1) return "one";
        else if(digit == 2) return "two";
        else if(digit == 3) return "three";
        else if(digit == 4) return "four";
        else if(digit == 5) return "five";
        else if(digit == 6) return "six";
        else if(digit == 7) return "seven";
        else if(digit == 8) return "eight";
        else if(digit == 9) return "nine";
        else return "error";
    }

    public static String numToString(int num) {
        String result = ""; // 처리된 문자열을 저장

        while(num/10 != 0) {
            result = digitToString(num%10) + " " + result;
            num /= 10;
        }
        result = digitToString(num%10) + " " + result;
        return result;
    }

    public static int stringTodigit(String str) {
        if(str.equals("zero")) return 0;
        else if(str.equals("one")) return 1;
        else if(str.equals("two")) return 2;
        else if(str.equals("three")) return 3;
        else if(str.equals("four")) return 4;
        else if(str.equals("five")) return 5;
        else if(str.equals("six")) return 6;
        else if(str.equals("seven")) return 7;
        else if(str.equals("eight")) return 8;
        else if(str.equals("nine")) return 9;
        else return -1;
    }

    public static int stringToNum(String str) {
        int result = 0; // 변환된 결과값을 저장
        int digit;  // 자릿수 (몇번째 문자열인지에 대한 정보)
        String[] arr = str.split(" "); // 범위의 최댓값이 99이므로
        if(arr.length > 1) digit = 10;
        else digit = 1;
        for(String s : arr) {
            result += digit * stringTodigit(s);
            digit = 1;
        }
        return result;
    }
}