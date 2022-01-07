import java.util.ArrayList;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        ArrayList<String> rangeStrs = new ArrayList<String>();
        int start = 0;
        int end = 0;
        
        for(int i=1 ; i<=nums.length ; i++) {
            if(i<=nums.length-1 && nums[i-1] == nums[i]-1)
                end = i;
            else {
                if(start == end)
                    rangeStrs.add(nums[start]+"");
                else
                    rangeStrs.add(nums[start] + "->" + nums[end]);
                start = i;
                end = start;
            }
        }
        
        return rangeStrs;
    }
}