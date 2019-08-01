import java.util.Stack;

public class 有效的括号0020 {

    public static void main(String[] args) {
        System.out.println(isValid("(("));
    }

    public static boolean isValid(String s) {

        if (s.length() == 1 || s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length() ; i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                continue;
            }

            if (stack.empty()) {
                return false;
            }

            Character pop = stack.pop();
            if ( (pop == '(' && s.charAt(i) != ')')
                    || (pop == '[' && s.charAt(i) != ']')
                    || (pop == '{' && s.charAt(i) != '}') ) {
                return false;
            }
        }

        if (!stack.empty()) {
            return false;
        }

        return true;
    }

}
