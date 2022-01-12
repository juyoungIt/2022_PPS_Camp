import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int winner = 0; // 우승자
        int bestScore = 0; // 우승자의 점수
        int score = 0; // 참가자의 점수

        for(int i=0 ; i<5 ; i++) {
            for(int j=0 ; j<4 ; j++)
                score += key.nextInt();
            if(bestScore < score) {
                winner = i+1;
                bestScore = score;
            }
            score = 0; // 재사용을 위해 초기화
        }
        System.out.println(winner + " " + bestScore);
    }
}