import java.util.ArrayList;

class MinStack {
    
    private ArrayList<Integer> arr;
    private int min; // 내부적으로 최솟값을 유지하기 위한 부분

    // constructor
    public MinStack() {
        arr = new ArrayList<Integer>();
        min = 0;
    }
    
    public void push(int val) {
        arr.add(val);
        if(arr.size() == 1)
            min = val;
        else {
            if(min>val)
                min = val;
        }
    }
    
    public void pop() {
        // pop하는 값이 min인 경우 - 업데이트 필요
        if(min == arr.get(arr.size()-1)) {
            int tmpMin = arr.get(0); // 일시적으로 min의 후보값을 저장
            for(int i=0 ; i<arr.size()-1 ; i++)
                if(tmpMin > arr.get(i))
                    tmpMin = arr.get(i);
            min = tmpMin;
        }
        arr.remove(arr.size()-1);
    }
    
    public int top() {
        return arr.get(arr.size()-1);
    }
    
    public int getMin() {
        return min;
    }
}