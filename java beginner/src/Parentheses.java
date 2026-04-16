import java.util.Stack;

public class Parentheses {

    public boolean isValid(String s) {
        Stack <Character> stack = new Stack();
        char[] chars = s.toCharArray();
        for(char c : chars){
          if (stack.isEmpty()){
              stack.push(c);
          }
          else{
              if( c == '(' || c == '{' || c == '['){
                  stack.push(c);
              }
              else if(c == ')' && stack.peek() == '('){
                  stack.pop();
              }
              else if(c == '}' && stack.peek() == '{'){
                  stack.pop();
              }
              else if(c == ']' && stack.peek() == '['){
                  stack.pop();
              }
              else
                  stack.push(c);
          }
        }
        return stack.isEmpty();

    }
}
