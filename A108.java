import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int tcSize = key.nextInt(); // 입력되는 테스트 케이스의 수
        key.nextLine(); // for buffer cleaning
        String[] tc = new String[tcSize]; // 테스트 케이스 저장

        // 테스트 케이스 입력
        for(int i=0 ; i<tcSize ; i++)
            tc[i] = key.nextLine();

        // 각 테스트 케이스의 좌우 대칭여부 판단 및 출력
        for(int i=0 ; i<tcSize ; i++) {
            if(isSymmetric(tc[i]))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        key.close();
    }

    // 해당 수가 좌우 대칭인지 판별
    public static boolean isSymmetric(String num) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int sum; // 원래 수와 반전된 수의 합산 값
        String sumString; // sum을 string으로 변환한 값

        // 반전된 수를 구하기 위해 stack에 값을 넣음
        for(int i=0 ; i<num.length() ; i++)
            stack.push(num.charAt(i) + "");
        for(int i=0 ; i<num.length() ; i++)
            sb.append(stack.pop());
        sum = Integer.parseInt(num) + Integer.parseInt(sb.toString());
        sumString = Integer.toString(sum);

        // sum의 대칭여부를 판단
        stack.clear(); // 재사용을 위해 stack을 비움
        sb.setLength(0); // 재사용을 위해 stringBuilder를 초기화
        for(int i=0 ; i<sumString.length() ; i++)
            stack.push(sumString.charAt(i) + "");
        for(int i=0 ; i<sumString.length() ; i++)
            sb.append(stack.pop());

        return sumString.equals(sb.toString());
    }
}