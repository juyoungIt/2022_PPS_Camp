import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int[] callTime = new int[key.nextInt()];
        for(int i=0 ; i<callTime.length ; i++)
            callTime[i] = key.nextInt();
        int chargeY = 0; // 영식 요금제 요금
        int chargeM = 0; // 민식 요금제 요금
        String recommend; // 결과적으로 출력되는 추천 string

        for(int time : callTime) {
            chargeY += 10 * (time/30 + 1);
            chargeM += 15 * (time/60 + 1);
        }
        if(chargeY < chargeM) recommend = "Y " + chargeY;
        else if(chargeY > chargeM) recommend = "M " + chargeM;
        else recommend = "Y M " + chargeY;

        System.out.println(recommend);
    }
}