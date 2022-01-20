import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        ArrayList<Integer> storage = new ArrayList<>(); // 초기 점수 입력값을 저장
        ArrayList<Integer> scores = new ArrayList<>();
        ArrayList<Integer> idx = new ArrayList<>();
        int sum = 0;

        for(int i=0 ; i<8 ; i++) {
            storage.add(key.nextInt());
            scores.add(storage.get(storage.size()-1));
        }

        Collections.sort(scores);
        for(int i=7 ; i>=3 ; i--) {
            sum += scores.get(i);
            idx.add(storage.indexOf(scores.get(i))+1);
        }
        Collections.sort(idx);

        System.out.println(sum);
        for(int x : idx)
            System.out.print(x + " ");
    }
}