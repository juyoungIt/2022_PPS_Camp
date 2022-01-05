class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        
        // 1. check string length
        if(length != 4 && length != 6)
            answer = false;
        // 2. check numeric
        for(int i=0 ; i<length ; i++) {
            int ascii = (int)s.charAt(i);
            if((ascii < 48) || (ascii > 57)) {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}