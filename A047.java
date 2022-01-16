import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int cur = 0; // 현재 참조 중인 index
        String inputStr = key.nextLine();

        while(cur < inputStr.length()) {
            try {
                System.out.println(inputStr.substring(cur, cur+10));
                cur+=10; // 다음번 사용을 위해서 index 업데이트
            }
            // 길이가 10이 되지 않는 이슈가 발생한 경우
            catch (StringIndexOutOfBoundsException e) {
                System.out.println(inputStr.substring(cur));
                break;
            }
        }
    }
}