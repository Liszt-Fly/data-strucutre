package MikeHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Mosh");
        map.put(2,"John");
        map.put(3,"Mike");
        System.out.println(map.containsKey(1)); //O(1)
        System.out.println(map.containsValue("john"));//O(n)
        System.out.println(map.get(3));
        System.out.println(map);
        for(var item:map.keySet()){
            System.out.println(item);
        }

        for(var item:map.entrySet()){
            System.out.println(item);
        }
        System.out.println(firstNoneRepeatChar("a gregen apprle"));

        System.out.println("----------------------");
        MikeHashTable mikeHashTable=new MikeHashTable();
        mikeHashTable.put(7,"hello");
        mikeHashTable.put(11,"omd");
        mikeHashTable.put(7,"miked");
        mikeHashTable.put(14,"ue4");
        mikeHashTable.put(15,"c333");
        mikeHashTable.put(10,"seem");
        mikeHashTable.put(20,"info");
        System.out.println(mikeHashTable.get(11));
        System.out.println(mikeHashTable.get(14));
        System.out.println(mikeHashTable.get(15));
        System.out.println(mikeHashTable.get(20));
        System.out.println(mikeHashTable.get(20));
        mikeHashTable.remove(20);
        System.out.println(mikeHashTable.get(20));
    }
    public static Character firstNoneRepeatChar(String str){
        //a green apple

        var map=new HashMap<Character,Integer>();
        for(char c :str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,0);
            }
        }
        for(char c:str.toCharArray()){
            if(map.get(c)==0){
                return c;
            }
        }
      return Character.MIN_VALUE;
    }
}
