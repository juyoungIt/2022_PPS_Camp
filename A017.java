import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        String num = key.nextLine();
        int[] arr = new int[num.length()];
        int[] used = new int[9];
        int result = 0;

        for(int i=0 ; i<num.length() ; i++)
            arr[i] = Integer.parseInt(num.charAt(i)+"");

        for (int j : arr) used[(j == 9) ? 6 : j]++;
        used[6] = (used[6]%2 == 0) ? used[6]/2 : used[6]/2+1;

        for(int i=0 ; i<9 ; i++) {
            if(result < used[i])
                result = used[i];
        }

        System.out.println(result);
    }
}