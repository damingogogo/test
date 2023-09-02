package demo1.likou;

import java.util.Stack;

public class Stack1 {
    //有效的括号
    public static void main(String[] args) {

        boolean valid = isValid("");
        System.out.println(valid);


    }


    public static boolean isValid(String s) {

        char[] chars = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                stack.push(chars[i]);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char pop = stack.pop();
                    if (chars[i] == ')') {
                        if (pop != '(') {
                            return false;
                        }
                    } else if (chars[i] == ']') {
                        if (pop != '[') {
                            return false;
                        }
                    } else if (chars[i] == '}') {
                        if (pop != '{') {
                            return false;
                        }
                    }
                }
            }
        }

        return stack.isEmpty() ? true : false;
    }


}
