import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int tcSize = key.nextInt();
        key.nextLine(); // 버퍼를 비우기 위함
        String[] tcStr = new String[tcSize];
        for(int i=0 ; i<tcSize ; i++)
            tcStr[i] = key.nextLine();
        ArrayList<String> used = new ArrayList<>(); // 사용된 문자를 저장
        boolean isGroup = true; // 그룹단어인가?
        char curChar; // 현재 참조 중인 문자
        char curGroup; // 현재 참조 중인 group 문자
        int count = 0; // group 단어의 수

        for(int i=0 ; i<tcSize ; i++) {
            curGroup = tcStr[i].charAt(0);
            used.add(curGroup+"");
            for(int j=0 ; j<tcStr[i].length() ; j++) {
                curChar = tcStr[i].charAt(j);
                if((curChar != curGroup) && !used.contains(curChar+"")) {
                    used.add(curChar+"");
                    curGroup = curChar;
                }
                else if((curChar != curGroup) && used.contains(curChar+"")) {
                    isGroup = false;
                    break;
                }
            }
            if(isGroup) {
                count++;
                used.clear(); // 재사용을 위해 비움
            }
            else {
                isGroup = true;
                used.clear(); // 재사용을 위해 비움
            }
        }
        System.out.println(count);
    }
}