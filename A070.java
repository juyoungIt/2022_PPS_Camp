import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cardNum = Integer.parseInt(br.readLine()); // 카드의 수
        Queue<Integer> queue = new LinkedList<>();
        int tmp;

        for(int i=0 ; i<cardNum ; i++)
            queue.add(i+1);

        while(queue.size() > 1) {
            queue.remove();
            tmp = queue.remove();
            queue.add(tmp);
        }
        System.out.println(queue.poll());
    }
}