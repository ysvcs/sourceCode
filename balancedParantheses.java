import java.util.*;

class BalancedParantheses {
    static boolean paranthesesCheck(String expr) {
        Deque<Character> stack = new ArrayDeque<Character>();
        char letter;
        for (int i=0; i<expr.length(); i++) {
            letter = expr.charAt(i);
            if (letter == '[' || letter == '{' || letter == '(') {
                stack.push(letter);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch(letter) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case '[': 
                    check = stack.pop();
                    if (check == '{' || check == '(')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args) {
        String exp = "[]";
        if (paranthesesCheck(exp)) 
            System.out.println("Balanced Parantheses!!");
        else 
            System.out.println("Unbalanced Parantheses!!");
    }
}