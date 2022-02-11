import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int numSize = key.nextInt(); // 입력하는 정수의 수
        LinkedList<Integer> numList = new LinkedList<Integer>(); // 입력된 수를 저장하는 linked-list
        int tmp; // 사용자가 입력한 수를 임시저장
        int sum = 0; // 최종적으로 얻어내는 수의 합

        for(int i=0 ; i<numSize ; i++) {
            tmp = key.nextInt();
            if(tmp == 0)
                numList.removeLast();
            else
                numList.add(tmp);
        }

        // 최종적으로 얻어낸 수의 합을 산출
        for(int num : numList)
            sum += num;

        System.out.println(sum);
    }
}