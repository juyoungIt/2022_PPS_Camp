import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int hour = key.nextInt(); // 현재 시각 (시간)
        int min = key.nextInt();  // 현재 시각 (분)
        int cookTime = key.nextInt(); // 조리에 필요한 시간
        int finishHour, finishMin; // 종료된 시각 (시간, 분)

        finishHour = hour + cookTime/60;
        finishMin = min + cookTime%60;
        if(finishHour >= 24)
            finishHour -= 24;
        if(finishMin >= 60) {
            finishHour++;
            if(finishHour >= 24)
                finishHour -= 24;
            finishMin -= 60;
        }
        System.out.println(finishHour + " " + finishMin);
    }
}