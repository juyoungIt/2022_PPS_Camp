class Solution {
    public boolean checkRecord(String s) {
        
        boolean award = true; // 수상자격
        int absentCount = 0; // 총 결석횟수
        int lateSequence = 0; // 지각 연속누적값
        
        for(int i=0 ; i<s.length() ; i++) {
            
            if(s.charAt(i) == 'A') {
                lateSequence = 0;
                absentCount++;
                if(absentCount > 1) {
                    award = false;
                    break;
                }
            }
            else if(s.charAt(i) == 'L') {
                lateSequence++;
                if(lateSequence >= 3) {
                    award = false;
                    break;
                }
            }
            else
                lateSequence = 0;
        }
        
        return award;
    }
}