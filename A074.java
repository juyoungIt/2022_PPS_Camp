import java.util.Stack;

class Solution {
    public boolean isPalindrome(String s) {
        
        Stack<String> stack = new Stack<>();
        String str = s.toLowerCase(); // 모든 문자를 소문자로
        StringBuilder sb = new StringBuilder();
        String convStr;
        String revrStr; // 반전된 string을 저장
        char tmp;
        
        for(int i=0 ; i<str.length() ; i++) {
            tmp = str.charAt(i);
            if((tmp>=97 && tmp<=122) || (tmp>=48 && tmp<=57)) {
                sb.append(tmp+"");
                stack.push(tmp+"");
            }
        }
        convStr = sb.toString();
        sb.setLength(0); // string buffer를 비움
        
        // 반전된 문자열을 생성
        while(stack.size() > 0)
            sb.append(stack.pop());
        revrStr = sb.toString();
        
        if(convStr.equals(revrStr))
            return true;
        else
            return false;
    }
}