package MikeStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        String str = "Hello,World";
        System.out.println(reverseString(str));
        var string = new String("<1>[<2>](3)");
        Expression exp=new Expression("[(<1+2>)]");
        System.out.println(exp.bBalancedEquation());

        MikeStack mikeStack=new MikeStack();
        mikeStack.push(1);
        mikeStack.push(2);
        mikeStack.push(3);
        mikeStack.pop();
        System.out.println(mikeStack.peek());
        System.out.println(mikeStack.toArray());
    }

    public static String reverseString(String str){
        if(str==null){
            throw new IllegalArgumentException();
        }
        var stack=new Stack<Character>();
        for(char c :str.toCharArray()){
            stack.push(c);
        }
        StringBuilder stringBuilder=new StringBuilder("");
        while(!stack.empty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }



}
