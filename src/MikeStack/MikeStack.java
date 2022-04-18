package MikeStack;

import java.util.Arrays;

public class MikeStack {
    private final int[]array=new int[5];
    private int pointer=0;
    public void push(int item){
        if(pointer>=array.length){
            throw new IllegalStateException();
        }
        array[pointer++]=item;
    }
    public int pop(){
        if(pointer==0){
            throw new IllegalStateException();
        }
        return array[--pointer];
    }
    public int peek(){
        if(pointer==0){
            throw new IllegalStateException();
        }
        return array[pointer-1];
    }
    public String toArray(){

        return Arrays.toString(Arrays.copyOfRange(array,0,pointer));
    }

}
