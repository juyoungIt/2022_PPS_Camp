import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        ArrayList<String> password = new ArrayList<>();
        String tmp; // 입력 비밀번호를 임시저장

        boolean containVowel = false; // 모음을 포함하는 가?
        boolean sequence = false; // 모음 or 자음이 3개 이상 연속되는 가?
        boolean sameword = false; // 같은 글자가 연속되는 가?

        while(true) {
            tmp = key.nextLine();
            if(tmp.equals("end")) break;
            password.add(tmp);
        }

        // 입력 비밀번호의 유효성을 확인
        for(String code : password) {
            for(int i=0 ; i<code.length() ; i++) {
                containVowel = check1(code);
                sequence = check2(code);
                sameword = check3(code);
            }

            if(containVowel && sequence && sameword)
                System.out.println("<" + code +">" + " is acceptable.");
            else
                System.out.println("<" + code +">" + " is not acceptable.");
            containVowel = false; // 재사용을 위해 초기화 - 1
            sequence = false;     // 재사용을 위해 초기화 - 2
            sameword = false;     // 재사용을 위해 초기화 - 3
        }
    }

    // 문자열에 모음을 포함하고 있는 가?
    public static boolean check1(String password) {
        return password.contains("a")
                || password.contains("e")
                || password.contains("i")
                || password.contains("o")
                || password.contains("u");
    }

    // 해당 문자가 모음인가?
    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    // 비밀번호가 모음 or 자음이 3개 이상 연속되는 경우가 없는 가?
    public static boolean check2(String password) {
        int count1 = 0; // 연속된 모음의 수
        int count2 = 0; // 연속된 자음의 수

        for(int i=0 ; i<password.length() ; i++) {
            if(isVowel(password.charAt(i))) {
                count1++;
                if(count1 >= 3)
                    return false;
                count2 = 0;
            }
            else {
                count2++;
                if(count2 >= 3)
                    return false;
                count1 = 0;
            }
        }
        return true;
    }

    // e와 o를 제외하고 같은 글자가 연속되는 경우가 존재하는 가?
    public static boolean check3(String password) {
        char tmp;
        for(int i=0 ; i<password.length() ; i++) {
            tmp = password.charAt(i);
            if(i>0 && tmp == password.charAt(i-1) && tmp != 'o' && tmp != 'e')
                return false;
        }
        return true;
    }
}