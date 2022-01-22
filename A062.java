class Solution {
    public String solution(int a, int b) {
        
        int days = 0; // 1월 1일로부터의 일수
        int tmp;
        
        for(int i=1 ; i<a ; i++)
            days += dayOfMonth(i);
        days += b-1;
        
        tmp = days%7;
        if(tmp == 0) return "FRI";
        else if(tmp == 1) return "SAT";
        else if(tmp == 2) return "SUN";
        else if(tmp == 3) return "MON";
        else if(tmp == 4) return "TUE";
        else if(tmp == 5) return "WED";
        else return "THU";
    }
    
    // 해당 월의 총 일수를 반환
    public int dayOfMonth(int a) {
        if(a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12)
            return 31;
        else if(a == 4 || a == 6 || a == 9 || a == 11)
            return 30;
        else
            return 29;
    }
}