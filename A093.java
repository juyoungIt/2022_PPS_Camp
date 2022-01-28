class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] result = new int[m+n]; // nums1과 nums2를 merge한 array
        int idx1 = 0; // nums1에 대해서 현재까지 참조한 index
        int idx2 = 0; // nums2에 대해서 현재까지 참조한 index
        int count = 0; // 현재까지 추가한 원소의 갯수
        
        while(true) {
            // 둘 중 하나의 array에 대해서 참조를 마친 경우
            if(idx1 >= m || idx2 >= n)
                break;
            if(nums1[idx1] >= nums2[idx2])
                result[count++] = nums2[idx2++];
            else
                result[count++] = nums1[idx1++];
        }
        
        // 나머지 부분을 결과 배열에 추가
        if(idx1 >= m) {
            for(int i=idx2 ; i<n ; i++)
                result[count++] = nums2[i];
        }
        else {
            for(int i=idx1 ; i<m ; i++)
                result[count++] = nums1[i];
        }
        
        for(int i=0 ; i<nums1.length ; i++)
            nums1[i] = result[i];
    }
}