package MikeQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(6);
        var front=queue.remove();
        System.out.println(front);//1
        System.out.println(queue);
        System.out.println(reverseQueue(queue));
        System.out.println("----------------------");
        MikeArrayQueue mikeArrayQueue=new MikeArrayQueue(5);
        mikeArrayQueue.enqueue(3);
        mikeArrayQueue.enqueue(5);
        mikeArrayQueue.enqueue(7);
        mikeArrayQueue.dequeue();
        mikeArrayQueue.dequeue();
        mikeArrayQueue.enqueue(332);
        mikeArrayQueue.enqueue(433);
        mikeArrayQueue.enqueue(533);
        mikeArrayQueue.enqueue(533);
        mikeArrayQueue.dequeue();
        mikeArrayQueue.dequeue();
        mikeArrayQueue.dequeue();
        mikeArrayQueue.dequeue();
        mikeArrayQueue.dequeue();

        System.out.println(mikeArrayQueue.toString());
        System.out.println("-------测试------------");
        Stack<Integer>qStack=new Stack<>();
        qStack.push(5);
        qStack.push(3);
        qStack.push(4);
        qStack.push(6);
        MikeStackQueue mikeStackQueue=new MikeStackQueue(qStack);
        System.out.println(mikeStackQueue.dequeue());
        mikeStackQueue.enqueue(5);
        System.out.println(mikeStackQueue.dequeue());
        System.out.println(mikeStackQueue.dequeue());
        System.out.println("-------------PriorityTest");
        Queue<Integer>priQueue=new PriorityQueue<>();
        priQueue.add(1);
        priQueue.add(2);
        priQueue.add(23);
        priQueue.add(32);
        priQueue.add(6);
        priQueue.add(7);
        while(!priQueue.isEmpty()){
            System.out.println(priQueue.remove());
        }
        System.out.println("--------Exercise:Building a PrioQueue------------");
        MikePriorityQueue mikePriorityQueue=new MikePriorityQueue(5);
        mikePriorityQueue.enqueue(5);
        mikePriorityQueue.enqueue(6);
        mikePriorityQueue.enqueue(2);
        mikePriorityQueue.enqueue(333);
        mikePriorityQueue.enqueue(22);
        System.out.println(mikePriorityQueue.dequeue());
        System.out.println(mikePriorityQueue.toString());
    }
    public static Queue<Integer> reverseQueue(Queue<Integer>queue){
        var stack=new Stack<Integer>();
        var answerQueue=new ArrayDeque<Integer>();
        while(!queue.isEmpty()){
            var el=queue.remove();
            stack.push(el);
        }
        while(!stack.empty()){
            answerQueue.add(stack.pop());
        }
        return  answerQueue;
    }
}
