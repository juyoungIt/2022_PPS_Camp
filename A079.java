import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] result = new int[commands.length]; // 결과값을 담아내는 배열
        
        // 들어오는 명령들을 하나씩 처리하여 결과를 생성함
        for(int x=0 ; x<commands.length ; x++) {
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];
            
            int[] subArr = new int[j-i+1]; // sub array를 위한 공간할당
            for(int y=i ; y<=j ; y++)
                subArr[y-i] = array[y-1];
            Arrays.sort(subArr);
            result[x] = subArr[k-1];
        }
        return result;
    }
}