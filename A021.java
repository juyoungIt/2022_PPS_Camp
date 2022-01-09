import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int[] plugs = new int[key.nextInt()];
        for(int i=0 ; i<plugs.length ; i++)
            plugs[i] = key.nextInt();
        int count = 0; // available connections

        for(int i=0 ; i<plugs.length ; i++)
            count += (i<plugs.length-1) ? plugs[i]-1 : plugs[i];

        System.out.println(count);
    }
}