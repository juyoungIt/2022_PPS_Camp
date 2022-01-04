import java.util.ArrayList;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>(numRows);
        
        for(int i=1 ; i<=numRows ; i++) {
            List<Integer> arr = new ArrayList<Integer>(i);
            for(int j=0 ; j<i ; j++) {
                if(j==0 || j==i-1)
                    arr.add(1);
                else
                    arr.add(result.get(i-2).get(j-1) + result.get(i-2).get(j));
            }
            result.add(arr);
        }
            
        return result;
    }
}