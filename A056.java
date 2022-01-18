import java.util.Arrays;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] result = new int[nums1.length]; // 처리결과를 담는 array
        int idx; // nums1에 있는 수에 대한 nums2의 index
        int j;
        
        for(int i=0 ; i<nums1.length ; i++) {
            idx = findIdx(nums2, nums1[i]);
            // 뒤에 숫자가 없는 경우
            if(idx == nums2.length-1)
                result[i] = -1;
            else {
                // 뒤의 수중에서 가장 가까운 더 큰수를 찾음
                for(j=idx ; j<nums2.length ; j++) {
                    if(nums2[j] > nums2[idx])
                        break;
                }
                // 뒤에 더 큰 수가 있는 경우
                if(j != nums2.length)
                    result[i] = nums2[j];
                else
                    result[i] = -1;
            }
        }
        return result;
    }
    
    // nums1에 있는 수에 대한 nums2의 index를 찾아서 반환
    public int findIdx(int[] nums2, int x) {
        for(int i=0 ; i<nums2.length ; i++) {
            if(nums2[i] == x)
                return i; // 해당 수의 index를 반환
        }
        return -1; // 존재하지 않을 경우
    }
}