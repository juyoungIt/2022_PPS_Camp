class Solution {
    public int solution(int[] citations) {
        int hIdx=0; // H-index
        int count; // hIdx 이상만큼 인용된 citations
        
        for(int i=1 ; i<=citations.length ; i++) {
            count = 0;
            for(int j=0 ; j<citations.length ; j++) {
                if(citations[j] >= i)
                    count++;
            }
            if(count >= i)
                hIdx = i;
        }
        return hIdx;
    }
}