import java.io.*;
import java.util.ArrayList;

class MyStack {
    private ArrayList<Integer> arr;

    // constructor
    public MyStack() {
        this.arr = new ArrayList<>();
    }

    public void push(int x) {
        this.arr.add(x);
    }

    public int pop() {
        if(arr.size() == 0)
            return -1;
        else {
            int tmp = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
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

    public int top() {
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
        String command;

        MyStack myStack = new MyStack();

        for(int i=0 ; i<tcSize ; i++) {
            command = br.readLine();
            if(command.split(" ")[0].equals("push")) {
                myStack.push(Integer.parseInt(command.split(" ")[1]));
            }
            else if(command.split(" ")[0].equals("pop")) {
                bw.write(myStack.pop()+"\n");
            }
            else if(command.split(" ")[0].equals("size")) {
                bw.write(myStack.size()+"\n");
            }
            else if(command.split(" ")[0].equals("empty")) {
                bw.write(myStack.empty()+"\n");
            }
            else {
                bw.write(myStack.top()+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}