import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int[] origin = new int[heights.length];
        int count = 0; // 일치하지 않는 수
        for(int i=0 ; i<heights.length ; i++)
            origin[i] = heights[i];
        
        Arrays.sort(heights); // 정렬수행
        
        for(int i=0 ; i<heights.length ; i++)
            if(origin[i] != heights[i])
                count++;
        
        return count;
    }
}