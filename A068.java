import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

class MyQueue {
    private LinkedList<Integer> arr;

    // constructor
    public MyQueue() {
        this.arr = new LinkedList<>();
    }

    public void push(int x) {
        this.arr.add(x);
    }

    public int pop() {
        if(arr.size() == 0)
            return -1;
        else {
            int tmp = arr.peek();
            arr.remove(0);
            return tmp;
        }
    }

    public int size() {
        return this.arr.size();
    }

    public int empty() {
        if(arr.size() == 0)
            return 1;
        else
            return 0;
    }

    public int front() {
        if(arr.size() == 0)
            return -1;
        else
            return arr.peek();
    }

    public int back() {
        if(arr.size() == 0)
            return -1;
        else
            return arr.get(arr.size()-1);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 효율적인 read를 위해서 buffered reader를 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tcSize = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        MyQueue myQueue = new MyQueue();

        for(int i=0 ; i<tcSize ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();

            if(str.equals("push"))
                myQueue.push(Integer.parseInt(st.nextToken()));
            else if(str.equals("pop"))
                sb.append(myQueue.pop()).append("\n");
            else if(str.equals("size"))
                sb.append(myQueue.size()).append("\n");
            else if(str.equals("empty"))
                sb.append(myQueue.empty()).append("\n");
            else if(str.equals("front"))
                sb.append(myQueue.front()).append("\n");
            else if(str.equals("back"))
                sb.append(myQueue.back()).append("\n");
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.close();
    }
}