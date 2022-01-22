import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선
        int size = Integer.parseInt(br.readLine());
        int[][] coordinates = new int[size][2]; // 좌표 저장
        String tmp; // 입력 문자열 임시저장
        String[] cord = new String[2];

        // 좌표값을 입력
        for(int i=0 ; i<size ; i++) {
            tmp = br.readLine();
            cord = tmp.split(" ", 2);
            coordinates[i][0] = Integer.parseInt(cord[0]);
            coordinates[i][1] = Integer.parseInt(cord[1]);
        }

        Arrays.sort(coordinates, (o1, o2) -> {
            if(o1[1] == o2[1])
                return o1[0] - o2[0];
            else
                return o1[1] - o2[1];
        });

        Arrays.sort(coordinates, (o1, o2) -> {
            if(o1[0] == o2[0])
                return o1[1] - o2[1];
            else
                return o1[0] - o2[0];
        });

        for(int i=0 ; i<size ; i++)
            System.out.println(coordinates[i][0] + " " + coordinates[i][1]);
    }
}