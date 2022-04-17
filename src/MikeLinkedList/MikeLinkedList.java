package MikeLinkedList;

import java.util.NoSuchElementException;

public class MikeLinkedList {
    private Node First;
    private Node Last;
    public int size;

    //addFirst
    //addLast
    //deleteFirst
    //deleteLast
    //contains
    //indexOf
 public void addFirst(int value){
     var node=new Node(value);
     //当前链表是否为空
        if(isEmpty()){
            First=Last= node;
        }
        else{
            var temp=First;
            First=node;
            First.next=temp;
            size++;
        }

 }

 public void addLast(int value){
     var node=new Node(value);
     if(isEmpty()){
         First=Last=node;
     }
     else{
         Last.next=node;
         Last=node;

     }
     size++;
 }

 private boolean isEmpty(){
     return First==null;
 }

 public int indexOf(int value){
     if(isEmpty()){
         return -1;
     }
     else{
        var cur=First;
        var index=0;
        while(cur!=null){
            if(cur.value==value){
                return index;
            }
            index++;
            cur=cur.next;
        }
     }
     return -1;
 }

 public boolean contains(int value){
  return  indexOf(value)!=-1;
 }

 public void removeFirst(){
     if(isEmpty()){
         throw new NoSuchElementException();
     }
     if(First.next==null){
         First=Last=null;
         return;
     }
     else{
         var second=First.next;
         First.next=null;
         First=second;
     }
     size--;
 }

 public void removeLast(){
     if(isEmpty()){
         throw new NoSuchElementException();
     }
     else if(First==Last){
         First=Last=null;
     }
     else{

         var previous=getPrevious(Last);
         Last=previous;
         Last.next=null;
     }
     size--;
 }
 public Node getPrevious(Node node){
     var current=First;
     while(current!=null){
         if(current.next==node){
             return current;
         }
         current=current.next;
     }
     return  null;
}

 public int[]toArray(){
     int[] array=new int [size];
     var cur=First;
     var index=0;
     while(cur!=null){
         array[index]=cur.value;
         cur=cur.next;
         index++;
     }
     return array;
 }

 public void reverse(){
     //first second
     //previous current
     var previous=First;
     var current=First.next;
     Last=First;
     Last.next=null;
     while(current!=null){
         var next=current.next;
         current.next=previous;
         previous=current;
         current=next;

     }
     First=previous;

 }
    public int getKthFromTheEnd(int k){
     if(isEmpty()){
         throw new IllegalStateException();
     }
     if(k>size||k<=0){
         throw new IllegalArgumentException();
     }
        //声明快指针
        var a=First;
        //声明慢指针
        var b=First;
        for(int i=0;i<k-1;i++){
            //先让a走k步
            a=a.next;
        }
        while(a!=Last){
            a=a.next;
            b=b.next;
        }

        return b.value;
    }
}
