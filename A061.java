class Solution {
    public String convertToTitle(int columnNumber) {
        
        String result = ""; // 변환결과를 저장하는 문자열
        int share = columnNumber / 26;    // 몫
        int remainder = columnNumber % 26; // 나머지
        
        if(share == 0)
            result += (char)(remainder+64)+"";
        else if(share > 0 && share <= 27 && remainder == 0) {
            if(share > 1)
                result += (char)(share-1+64)+"";
            result += "Z";
        }
        else if(share > 0 && share <= 26 && remainder != 0) {
            result += (char)(share+64)+"";
            result += (char)(remainder+64)+"";
        }
        else {
            result += convertToTitle(share);
            if(remainder != 0)
                result += (char)(remainder+64)+"";
        }
        return result;
    }
}