package MikeArray;

public class MArray {
    private int[]items;
    private int count=0;
    public MArray(int length){
        items=new int[length];
    }

    public void print(){
        for(int i=0;i<count;i++){
            System.out.println(items[i]);
        }
    }

    public void insert(int element){
        //if the array is full
        if(items.length==count){
            //Create a new array (twice the size)
            int array[]=new int[count*2];
            //Copy all the items into new Array
            for(int i=0;i<count;i++){
                array[i]=items[i];
            }
            //set the items to the new array
            items=array;
        }
        items[count++]=element;
    }

    public void removeAt(int index){
            if(index<0||index>=count){
               throw new IllegalArgumentException();
            }
            else{
                //[10,20,30,40]
                // index:1
                for(int i=index;i<count;i++){
                items[i]=items[i+1];
                }
                count--;
            }
    }

    public int indexOf(int item){
        //获取元素的位置
        //肯定是有可能遍历完整个都没有存在的
        for(int i=0;i<count;i++){
            if(items[i]==item){
                return i;
            }

        }
        return -1;
    }
}
