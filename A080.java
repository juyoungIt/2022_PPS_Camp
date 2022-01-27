import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        
        int threshold = nums.length / 2; // majority를 판단하기 위한 임계값
        int count = 0; // nums에 존재하는 특정 값을 가진 element의 수
        int result; // 결과값
        
        Arrays.sort(nums); // 빠른 카운팅을 위해 정렬
        result = nums[0];
        for(int i=0 ; i<nums.length ; i++) {
            if(result == nums[i])
                count++;
            else {
                if(count > threshold) {
                    result = nums[i-1];
                    break;
                }
                else {
                    result = nums[i];
                    count = 1;
                }
            }
        }
        return result;
    }
}