class Solution {
    public int mySqrt(int x) {
        
        int left = 1;
        int right = x;
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
            
            if((long)mid * mid < (long)x)
                left = mid+1;
            else if((long)mid * mid > (long)x)
                right = mid-1;
            else
                return mid;
        }
        
        return right;
    }
}