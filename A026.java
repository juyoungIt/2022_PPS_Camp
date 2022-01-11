class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = x;
        int digitSum = 0;
        
        while(num/10 != 0) {
            digitSum += num%10;
            num /= 10;
        }
        digitSum += num;
        
        if(x % digitSum == 0) answer = true;
        else answer = false;
        
        return answer;
    }
}