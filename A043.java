class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int idx = 0; // 유효한 prefix의 idx
        int i, j; // for loop
        int minLength; // 입력된 문자열 중 가장 짧은 문자열의 길이
        
        minLength = strs[0].length();
        for(int x=1 ; x<strs.length ; x++) {
            if(minLength > strs[x].length())
                minLength = strs[x].length();
        }
        
        
        for(i=0 ; i<minLength ; i++) {
            for(j=0 ; j<strs.length ; j++) {
                if(strs[0].charAt(idx) != strs[j].charAt(idx))
                    break;
            }
            if(j < strs.length)
                break;
            idx++;
        }
        
        if(idx == 0)
            return "";
        else
            return strs[0].substring(0, idx);
    }
}