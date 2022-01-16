import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String inputStr = key.nextLine();
        char tmp;

        for(int i=0 ; i<inputStr.length() ; i++) {
            tmp = inputStr.charAt(i);
            if(tmp >= 65 && tmp <= 67) tmp += 23;
            else tmp -= 3;
            System.out.print((char)tmp);
        }
        System.out.println();
    }
}