package MikeQueue;

import java.util.Queue;
import java.util.Stack;

//[10,20,30]
//enque [10,20,30,40]
//deque [20,30,40]
//[30,20,10] =>[30,20,10,40]
public class MikeStackQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2=new Stack<>();

    public MikeStackQueue(Stack<Integer> innerStack) {
        this.stack1 = innerStack;
        System.out.println(stack1);

    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if(isEmpty()){
            throw new IllegalStateException();
        }
        moveStack1ToStack2();

        return stack2.pop();
    }

    private void moveStack1ToStack2() {
        if (stack2.empty()) {
            System.out.println(stack1);
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    public boolean isEmpty(){
        return  stack1.empty()&&stack2.empty();
    }






}
