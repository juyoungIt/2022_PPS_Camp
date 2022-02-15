import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int beltSize = key.nextInt(); // 벨트의 수
        int[][] info = new int[beltSize][3]; // 벨트 및 바퀴회전 수 정보
        int rotDir; // 회전방향
        int rpm; // M+1번째 바퀴의 분당 회전 수

        // 필요한 정보를 입력받는 부분
        for(int i=0 ; i<beltSize ; i++) {
            info[i][0] = key.nextInt(); // i번째 바퀴의 분당회전 수
            info[i][1] = key.nextInt(); // i+1번째 바퀴의 분당회전 수
            info[i][2] = key.nextInt(); // i번째 벨트의 형태
        }

        // M+1번째 바퀴의 회전방향 및 분당회전수 계산
        rotDir = 0;       // 첫번째 바퀴의 회전방향 초기화
        rpm = info[0][0]; // 바퀴의 분당회전수 초기화
        for(int i=0 ; i<beltSize ; i++) {
            // 바퀴 회전방향 업데이트 (i+1)번째 바퀴
            if(info[i][2] == 1)
                rotDir = (rotDir == 0) ? 1 : 0;
            // i+1번째 바퀴의 분당회전 수 업데이트
            rpm = (rpm / info[i][0]) * info[i][1];
        }
        System.out.println(rotDir + " " + rpm);
    }
}