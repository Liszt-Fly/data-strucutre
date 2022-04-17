package MikeStack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    private final List<Character> leftBracket = Arrays.asList('(','<','[','{');
    private final List<Character> rightBracket = Arrays.asList(')','>',']','}');
    String str;

    public Expression(String str) {
        this.str = str;
    }
    private boolean isLeftBracket(char c){
        return  leftBracket.contains(c);
    }
    private boolean matchBracket(char left,char top){
       return  leftBracket.indexOf(left)==rightBracket.indexOf(top);

    }
    private boolean isRightBracket(char c){
        return rightBracket.contains(c);
    }
    public boolean bBalancedEquation() {
        var stack = new Stack<Character>();
        for (char c : str.toCharArray()) {
            if (isLeftBracket(c)) {
                stack.push(c);
            }
            if (isRightBracket(c)) {
                if (stack.empty()) return false;
                char top = stack.pop();
                if (matchBracket(c,top)) {
                    return false;
                }
            }
        }
        return true;
    }
}
