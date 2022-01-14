class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> result = new ArrayList<Integer>(right-left+1);
        int num;
        int digit;
        boolean isSelfDriving = true;
        
        num = left;
        for(int i=left ; i<=right ; i++) {
            while(num/10 != 0) {
                digit = num%10;
                if(digit == 0 || i%digit != 0) {
                    isSelfDriving = false;
                    break;
                }
                num /= 10;
            }
            digit = num%10;
            if(digit == 0 || i%digit != 0)
                isSelfDriving = false;
            num = i+1;
            if(isSelfDriving)
                result.add(i);
            isSelfDriving = true;
        }
        
        return result;
    }
}