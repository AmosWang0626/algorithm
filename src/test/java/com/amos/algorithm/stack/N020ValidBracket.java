package com.amos.algorithm.stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * 有效括号
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/5/11
 */
public class N020ValidBracket {

    @Test
    public void main() {
        System.out.println("([)]" + isValid("([)]"));
        System.out.println("([])[]" + isValid("([])[]"));
        System.out.println("{[]}" + isValid("{[]}"));
        System.out.println("()[]{}" + isValid("()[]{}"));
        System.out.println("(()[[]]{}" + isValid("(()[[]]{}"));
    }

    public boolean isValid(String s) {
        while (s.contains("{}") || s.contains("[]") || s.contains("()")) {
            s = s.replace("{}", "");
            s = s.replace("[]", "");
            s = s.replace("()", "");
        }
        return s.length() == 0;
    }

    public boolean isValid2(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            final String item = s.substring(i, i + 1);
            if ("{([".contains(item)) {
                stack.push(item);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            switch (item) {
                case "]":
                    if (!stack.pop().equals("[")) {
                        return false;
                    }
                    break;
                case "}":
                    if (!stack.pop().equals("{")) {
                        return false;
                    }
                    break;
                case ")":
                    if (!stack.pop().equals("(")) {
                        return false;
                    }
                    break;
                default:
                    throw new RuntimeException("Error Symbol [" + item + "]");
            }
        }

        return stack.isEmpty();
    }

}
