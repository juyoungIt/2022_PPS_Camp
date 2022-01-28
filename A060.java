import java.util.ArrayList;

class Solution {
    public int calPoints(String[] ops) {
        
        ArrayList<Integer> record = new ArrayList<>(); // 점수기록
        int sum = 0; // 최종적으로 산출되는 점수
        
        for(int i=0 ; i<ops.length ; i++) {
            if(ops[i].equals("+"))
                record.add(record.get(record.size()-2) + record.get(record.size()-1));
            else if(ops[i].equals("D"))
                record.add(record.get(record.size()-1)*2);
            else if(ops[i].equals("C"))
                record.remove(record.size()-1);
            else
                record.add(Integer.parseInt(ops[i]));
        }
        
        // 기록된 점수의 합산을 산출
        for(Integer score : record)
            sum += score;
        
        return sum;
    }
}