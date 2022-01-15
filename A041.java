class Solution {
    public String solution(String s) {

        String answer = "";
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder(s);

        for(int i=0 ; i<s.length() ; i++) {
            if(i == 0 && isLowercase(s.charAt(i)))
                str.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            else if(i != 0 && s.charAt(i-1) == 32 && isLowercase(s.charAt(i)))
                str.setCharAt(i, Character.toUpperCase(s.charAt(i)));
        }
        answer = str.toString();
        return answer;
    }

    public static boolean isLowercase(char c) {
        if(c >= 97 && c <= 122)
            return true;
        else
            return false;
    }

    public static boolean isNumeric(char c) {
        if(c >= 48 && c <= 57)
            return true;
        else
            return false;
    }

    public static boolean isSpace(char c) {
        if(c == 32)
            return true;
        else
            return false;
    }
}