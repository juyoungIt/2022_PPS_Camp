import java.util.ArrayList;

class Solution {
    
    static int carry = 1;
    
    public int[] plusOne(int[] digits) {
        
        ArrayList<Integer> num = new ArrayList<Integer>(digits.length);
        
        for(int i=0 ; i<digits.length ; i++)
           num.add(digits[i]);
        
        for(int i=digits.length-1 ; i>=0 ; i--) {
            if(num.get(i) + 1 == 10) {
                carry = 1;
                num.set(i, 0);
            }
            else {
                num.set(i, num.get(i) + 1);
                carry = 0;
                break;
            }
        }
        
        if(carry == 1) {
             num.add(0, carry);
        }
        
        int[] result = new int[num.size()];
        for(int i=0 ; i<num.size(); i++)
            result[i] = num.get(i);
        
        return result;
    }
}