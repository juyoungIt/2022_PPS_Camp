class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        int length;
        int mid = 0;
        
        while(true) {
            
            if(left > right)
                break;
            
            length = right - left + 1;
            if(length%2 == 0)
                mid = left + (length/2-1);
            else
                mid = left + (length/2);
            
            if((long)mid * mid < (long)num)
                left = mid+1;
            else if((long)mid * mid > (long)num)
                right = mid-1;
            else
                return true;
        }
        
        return false;
    }
}