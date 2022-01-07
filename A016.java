import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        
        int min = 0;
        int max = people.length-1;
        int count = 0;
        
        Arrays.sort(people);
        
        while(true) {
            if(min > max)
                break;
            if(people[min] + people[max] > limit) {
                count++;
                max--;
            }
            else {
                min++;
                max--;
                count++;
            }
        }
        
        return count;
    }
}