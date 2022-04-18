package MikeQueue;

import java.util.Arrays;

public class MikeArrayQueue {
    private int[]items;
    private int count=0;
    private int front=0;
    public MikeArrayQueue(int capacity){
        items=new int[capacity];
    }
    private int rear=0;
    public void enqueue(int item){
        if(count==items.length){
            throw new IllegalStateException();
        }
        items[rear]=item;
        rear=(rear+1)%items.length;
        count++;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }

    public int dequeue(){
        if(count==0){
            throw new IllegalStateException();
        }
        var item=items[front];
        items[front]=0;
        front=(front+1)%items.length;
        count--;
        return  item;
    }


}
