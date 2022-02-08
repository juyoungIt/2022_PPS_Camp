import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int tcSize = key.nextInt();      // 테스트 케이스의 크기
        int[][] tc = new int[tcSize][6]; // 테스트 케이스를 저장하는 배열

        // 테스트 케이스 입력 및 저장
        for(int i=0 ; i<tcSize ; i++)
            for(int j=0 ; j<6 ; j++)
                tc[i][j] = key.nextInt();

        // 각 테스트 케이스별로 존재할 수 있는 좌표의 수를 구함
        for(int i=0 ; i<tcSize ; i++)
            System.out.println(count(tc[i][0], tc[i][1], tc[i][2], tc[i][3], tc[i][4], tc[i][5]));
    }

    // 2차원 공간 상에서 주어진 두 점 사이의 거리를 구하여 반환
    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(Math.abs(x1-x2), 2) + Math.pow(Math.abs(y1-y2), 2));
    }

    // 주어진 2개의 정수 중에서 더 큰 값을 반환
    public static int getMax(int n1, int n2) {
        return Math.max(n1, n2);
    }

    // 주어진 2개의 정수 중에서 더 작은 값을 반환
    public static int getMin(int n1, int n2) {
        return Math.min(n1, n2);
    }

    // 가능한 좌표의 수를 카운트
    public static int count(int x1, int y1, int r1, int x2, int y2, int r2) {
        if((x1==x2) && (y1==y2) && (r1==r2))
            return -1;
        else if((x1==x2) && (y1==y2))
            return 0;
        else {
            if(getDistance(x1,y1,x2,y2) == r1+r2)
                return 1;
            else if(getDistance(x1,y1,x2,y2) < r1+r2) {
                if (getDistance(x1,y1,x2,y2) + getMin(r1, r2) == getMax(r1, r2))
                    return 1;
                else if(getDistance(x1,y1,x2,y2) + getMin(r1, r2) < getMax(r1, r2))
                    return 0;
                else
                    return 2;
            }
            else
                return 0;
        }
    }
}