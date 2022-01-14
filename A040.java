class Solution {
    public boolean halvesAreAlike(String s) {
        
        String str = s.toLowerCase();
        int length = str.length();
        int leftCount = 0;  // the number of left side
        int rightCount = 0; // the number of right side
        
        // count left
        for(int i=0 ; i<length/2 ; i++) {
            if(str.charAt(i) == 'a' 
                || str.charAt(i) == 'e' 
                || str.charAt(i) == 'i' 
                || str.charAt(i) == 'o' 
                || str.charAt(i) == 'u')
                leftCount++;
        }
        
        // count right
        for(int i=length/2 ; i<length ; i++) {
            if(str.charAt(i) == 'a' 
                || str.charAt(i) == 'e' 
                || str.charAt(i) == 'i' 
                || str.charAt(i) == 'o' 
                || str.charAt(i) == 'u')
                rightCount++;
        }
        
        if(leftCount == rightCount)
            return true;
        else 
            return false;
    }
}