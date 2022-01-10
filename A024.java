class Solution {
    public boolean lemonadeChange(int[] bills) {
        boolean result = true;
        int[] billCount = new int[3];
        
        for(int bill : bills) {
            // 5달러 지폐를 전달받은 경우
            if(bill == 5)
                billCount[0]++;
            // 10달러 지폐를 전달받은 경우
            else if(bill == 10) {
                billCount[1]++;
                // 거스름돈을 처리
                if(billCount[0] != 0)
                    billCount[0]--;
                else
                    result = false;
            }
            // 20달러 지폐를 전달받은 경우
            else if(bill == 20) {
                billCount[2]++;
                // 거스름돈을 처리
                // 10원짜리가 있는 경우
                if(billCount[1] != 0) {
                    billCount[1]--;
                    if(billCount[0] != 0)
                        billCount[0]--;
                    else
                        result = false;
                }
                // 10원짜리가 없는 경우
                else {
                    if(billCount[0] < 3)
                        result = false;
                    else
                        billCount[0] -= 3;
                }
            }
        }
        return result;
    }
}