import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int[] alpha = new int[26];
        int playerCount = key.nextInt();
        key.nextLine(); // for buffer cleaning
        String[] players = new String[playerCount];
        for(int i=0 ; i<playerCount ; i++)
            players[i] = key.nextLine();
        int count = 0;

        for(String str : players)
            alpha[(int)str.charAt(0)-97]++;

        for(int i=0 ; i<26 ; i++)
            if(alpha[i] >= 5)
                count++;

        if(count == 0)
            System.out.println("PREDAJA");
        else {
            for (int i = 0; i < 26; i++)
                if (alpha[i] >= 5)
                    System.out.print((char) (i + 97));
            System.out.println();
        }
    }
}