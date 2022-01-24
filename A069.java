import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Queue<Integer> list = new LinkedList<>(); // 원을 표현
        int num = key.nextInt(); // 사람의 수
        int idx = key.nextInt(); // 제거할 번째 수
        key.nextLine(); // for buffer cleaning

        for(int i=1 ; i<=num ; i++)
            list.add(i);

        System.out.print("<");
        while(list.size() > 0) {
            for(int i = 0; i < idx - 1; i++) {
                int val = list.remove();
                list.add(val);
            }
            if(list.size() == 1)
                System.out.print(list.remove());
            else
                System.out.print(list.remove() + ", ");
        }
        System.out.println(">");
    }
}