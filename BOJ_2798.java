import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int cardSize = key.nextInt();    // 카드의 수
        int num = key.nextInt();         // 블렉젝 게임을 위한 기준값
        int[] cards = new int[cardSize]; // 카드의 값을 저장
        int max = 0; // num을 넘지 않으면서 가장 가까운 값

        // 주어진 n장의 카드값을 입력받는 부분
        for(int i=0 ; i<cardSize ; i++)
            cards[i] = key.nextInt();

        System.out.println(getBestValue(cards, num)); // 결과값을 출력
    }

    public static int getBestValue(int[] cards, int num) {
        int cardSize = cards.length;
        int tmp; // 연산을 위해 값을 임시저장
        int max = 0; // num에 가장 가까운 수

        // 발생할 수 있는 모든 경우의 수를 구함
        for(int i=0 ; i<cardSize-2 ; i++) {
            for(int j=i+1 ; j<cardSize-1 ; j++) {
                for(int k=j+1 ; k<cardSize ; k++) {
                    tmp = cards[i] + cards[j] + cards[k];
                    if(tmp == num)
                        return tmp;
                    if((tmp <= num) && (tmp > max))
                        max = tmp;
                }
            }
        }
        return max;
    }
}