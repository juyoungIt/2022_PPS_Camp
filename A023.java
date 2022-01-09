import java.util.ArrayList;

class Solution {
    public int addDigits(int num) {
        
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        while(true) {
            while(num/10 !=0) {
                arr.add(0, num%10);
                num /= 10;
            }
            arr.add(0, num%10);
            for(int n : arr)
                sum += n;
            if(sum/10 == 0)
                return sum;
            else {
                num = sum;
                sum = 0;
                arr.clear();
            }
        }
    }
}