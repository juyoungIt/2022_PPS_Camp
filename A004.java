import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> arrList = new ArrayList<Integer>(arr.length);
        
        for(int i=0 ; i<arr.length ; i++)
            if(arr[i] % divisor == 0)
                arrList.add(arr[i]);
        Collections.sort(arrList);
        
        if(arrList.size() == 0)
            arrList.add(-1);
        
        int[] answer = new int[arrList.size()];
        
        for(int i=0 ; i<arrList.size() ; i++)
            answer[i] = arrList.get(i);
        
        return answer;
    }
}