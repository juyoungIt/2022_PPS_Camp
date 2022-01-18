import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int tcSize = key.nextInt();
        String[] str = new String[tcSize];
        key.nextLine(); // for buffer cleaning
        for(int i=0 ; i<tcSize ; i++)
            str[i] = key.nextLine();
        int score = 0;
        int accum = 1;

        for(int i=0 ; i<tcSize ; i++) {
            for(int j=0 ; j<str[i].length() ; j++) {
                if(str[i].charAt(j) == 'O') {
                    score += accum;
                    accum++;
                }
                else if(str[i].charAt(j) == 'X')
                    accum = 1;
            }
            System.out.println(score);
            score = 0;
            accum = 1;
        }
    }
}