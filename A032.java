import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int tcSize = key.nextInt(); // 테스트 케이스의 수
        int[] tcArr = new int[tcSize*2]; // 테스트 케이스
        for(int i=0 ; i<tcSize*2 ; i+=2) {
            tcArr[i] = key.nextInt();
            tcArr[i+1] = key.nextInt();
        }

        for(int i=0 ; i<tcSize*2 ; i+=2) {
            System.out.println(numOfPeople(tcArr[i], tcArr[i+1]));
        }
    }

    public static int numOfPeople(int floor, int room) {
        int sum = 0;

        if(floor == 0)
            return room;
        else {
            for(int i=1 ; i<=room ; i++)
                sum += numOfPeople(floor-1, i);
            return sum;
        }
    }
}