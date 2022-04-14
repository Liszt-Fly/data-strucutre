package MikeArray;



import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers=new int[3];

        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        System.out.println(numbers); //[I@7e0babb1
        System.out.println(Arrays.toString(numbers)); //[0,0,0]
        System.out.println(numbers.length);
        System.out.println("----------------------------");
        MArray array=new MArray(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(30);
        array.insert(30);
        array.insert(30);
        array.insert(30);
//        array.removeAt(1);
//        array.removeAt(0);
        System.out.println(array.indexOf(10));
        array.print();
        System.out.println("------------------------------");
        System.out.println("ArrayList的使用");
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.remove(1);
        System.out.println(arrayList.indexOf(20));//1
        System.out.println(arrayList);

    }
}
