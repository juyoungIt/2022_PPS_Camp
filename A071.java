import java.util.Stack;

class MyQueue {
    
    Stack<Integer> stack1;
    Stack<Integer> stack2; // queue를 구현하기 위한 sub stack

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        while(stack1.size() > 0)
            stack2.push(stack1.pop());
        stack1.push(x);
        while(stack2.size() > 0)
            stack1.push(stack2.pop());
    }
    
    public int pop() {
        return stack1.pop();
    }
    
    public int peek() {
        return stack1.peek();
    }
    
    public boolean empty() {
        if(stack1.size() == 0)
            return true;
        else
            return false;
    }
}