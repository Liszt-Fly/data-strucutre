package MikeStack;

import java.util.Arrays;

public class MikeStack {
    private int[]array=new int[5];
    private int count=0;
    public void push(int item){
        if(count>=array.length){
            throw new IllegalStateException();
        }
        array[count++]=item;
    }
    public int pop(){
        if(count==0){
            throw new IllegalStateException();
        }
        return array[--count];
    }
    public int peek(){
        if(count==0){
            throw new IllegalStateException();
        }
        return array[count-1];
    }
    public String toArray(){

        return Arrays.toString(Arrays.copyOfRange(array,0,count));
    }

}
