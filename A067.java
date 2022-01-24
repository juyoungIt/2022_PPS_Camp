import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        Stack<String> stack = new Stack<>(); // 문자를 구성하는 각 문자를 저장하는 Stack
        String result = ""; // 처리결과를 저장
        
        for(int i=0 ; i<s.length() ; i++) {
            if(!stack.empty() && stack.peek().equals(s.charAt(i)+"")) {
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i)+"");
        }
        
        while(!stack.empty())
            result = stack.pop() + result;
        
        return result;
    }
}