import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int[] seq = new int[8];
        int diff = 0;

        for(int i=0 ; i<8 ; i++)
            seq[i] = key.nextInt();

        diff = seq[0] - seq[1];
        for(int i=1 ; i<8 ; i++) {
            if(diff != (seq[i-1] - seq[i])) {
                diff = 3;
                break;
            }
        }

        if(diff == -1)
            System.out.println("ascending");
        else if(diff == 1)
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}
