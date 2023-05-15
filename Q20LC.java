import java.util.*;
public class Q20LC {
    public static boolean isValid(String s ) {
        Stack<Character> stack = new Stack<Character>();
        for (char st : s.toCharArray()) {
          if (st == '(' || st == '{' || st == '[') {
            stack.push(st);
          }
          else {
              if(stack.empty()) {
                return false;
              }
              else{
              char top = (Character) stack.peek();
              if(st == ')' && top == '(' ||
              st == '}' && top == '{' ||
              st == ']' && top == '['){
                stack.pop();
              }
              else{
                return false;
              }
            }
          }
        }
        if(stack.empty()) {
          return true;
        }
        else{
          return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
