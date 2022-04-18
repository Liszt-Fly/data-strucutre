package MikeQueue;

import java.util.Arrays;

public class MikePriorityQueue {

    private int[]array;
    private int count=0;
    public MikePriorityQueue(int capacity){
       this.array=new int[capacity];    }

    public void enqueue(int item){
        if(isFull()){
            throw new IllegalStateException();
        }
        if(count==0){
            array[0]=item;

            count++;
            return;
        }
        int i = shiftItemsToInsertNewItem(item);
        array[i]=item;
        count++;
    }

    private boolean isFull(){
        return count==array.length;
    }
    private int shiftItemsToInsertNewItem(int item) {
        int i;
        for( i=count-1;i>=0;i--){
            if(item <array[i]){
                array[i+1]=array[i];
            }
            else{
                break;
            }
        }
        return i+1;
    }

    @Override
    public String toString(){
        return Arrays.toString(array);
    }

    public int dequeue(){
        if(count==0){
            throw new IllegalStateException();
        }
        return array[--count];
    }

}
