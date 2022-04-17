package MikeLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.addFirst(10);
        linkedList.addFirst(10);
        linkedList.addFirst(10);linkedList.addLast(29);
        System.out.println(linkedList);
        System.out.println("---------------");
        MikeLinkedList mikeLinkedList=new MikeLinkedList();
        mikeLinkedList.addFirst(10);
        mikeLinkedList.addFirst(20);
        mikeLinkedList.addLast(40);
        mikeLinkedList.addLast(50);
        mikeLinkedList.removeLast();
        System.out.println(mikeLinkedList.indexOf(10));
        System.out.println(mikeLinkedList.contains(40));
        System.out.println("----------------------");
        var newList=new MikeLinkedList();
        newList.addLast(10);
        newList.addLast(20);
        newList.addLast(30);

        System.out.println(newList.size);
        newList.reverse();
        System.out.println(Arrays.toString(newList.toArray()));
        System.out.println("---------Practice----------------");
        var practiceList=new MikeLinkedList();
        practiceList.addLast(10);
        practiceList.addLast(20);
        practiceList.addLast(30);
        practiceList.addLast(40);
        practiceList.addLast(50);
        System.out.println(practiceList.getKthFromTheEnd(-1));
    }

}
