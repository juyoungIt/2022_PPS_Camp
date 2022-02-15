import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int[] dices = new int[3]; // 3개의 주사위 값을 저장
        int score; // 최종점수

        // 3개의 주사위 값을 입력
        for(int i=0 ; i<3 ; i++)
            dices[i] = key.nextInt();

        // 주사위 값에 따른 점수를 산정
        if(dices[0] == dices[1] && dices[1] == dices[2])
            score = 10000 + dices[0] * 1000;
        else if(dices[0] == dices[1] || dices[1] == dices[2] || dices[0] == dices[2]) {
            if(dices[0] == dices[1] || dices[0] == dices[2])
                score = 1000 + dices[0] * 100;
            else
                score = 1000 + dices[1] * 100;
        }
        else {
            Arrays.sort(dices); // 주사위 값을 크기순으로 정렬
            score = dices[2] * 100;
        }

        System.out.println(score);
    }
}