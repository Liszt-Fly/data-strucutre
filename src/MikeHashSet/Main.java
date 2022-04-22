package MikeHashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        int[]numbers={1,2,3,5,7,2,1,3,45,5};
        for(var number:numbers){
            set.add(number);
        }
        System.out.println(set);
        System.out.println(theFirstRepeatCharacter("green apple"));
        System.out.println(Hash("hello,World"));
        String str="orange";
        System.out.println(str.hashCode());
    }
    public static char theFirstRepeatCharacter(String str){
        //green apple  [g,r,e,n,a,p,l]
        var set=new HashSet<Character>();
        for(char c:str.toCharArray()){
            if(set.contains(c)){
                return c;
            }
            else{
                set.add(c);
            }
        }
        return Character.MIN_VALUE;
    }

    public static int Hash(String key){
        int hash=0;
        for(var ch:key.toCharArray()){
            hash+=ch;
        }
        return  hash%100;
    }
}
