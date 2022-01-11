class Solution {
    public boolean isPowerOfFour(int n) {
        while(true) {
            if(n == 1)
                return true;
            else if(n/4 == 0) break;
            else if(n%4 == 0) n /= 4;
            else return false;
        }
        return false;
    }
}