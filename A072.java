class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
        int result = 0;
        
        // 이전 월수에 대한 일수를 먼저 계산
        for(int i=1 ; i<=month-1 ; i++)
            result += monthToDay(year, i);
        result += day; // 나머지 일수를 더함
        
        return result;
    }
    
    // 해당 연도가 윤년인지 판단
    public boolean isYoon(int year) {
        if(year%400 == 0)
            return true;
        if(year%100 == 0)
            return false;
        if(year%4 == 0)
            return true;
        else
            return false;
    }
    
    // 특정 월의 일수를 반환
    public int monthToDay(int year, int month) {
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        else if(month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        else {
            if(isYoon(year))
                return 29;
            else
                return 28;
        }
    }
}