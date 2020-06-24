package com.dsalgo.ds.stack.standard;

import com.dsalgo.ds.stack.Stack;

/**
 * Time Complexity: O(n)
 * Auxiliary Space: O(n) - stack
 */
public class BalancedParenthesis {
    
    public static boolean isValid(char[] paranthesisStr) {
        Stack<Character> stack = new Stack<>(Character.class);

        for (int i = 0; i < paranthesisStr.length; i++) {
            switch (paranthesisStr[i]) {
                case '(':
                case '{':
                case '[':
                    stack.push(paranthesisStr[i]);
                    break;
                case ')':
                    if (stack.peek() != '(') return false;
                    stack.pop();
                    break;
                case '}':
                    if (stack.peek() != '{') return false;
                    stack.pop();
                    break;
                case ']':
                    if (stack.peek() != '[') return false;
                    stack.pop();
                    break;
            }
        }

        return stack.isEmpty();
    }
}