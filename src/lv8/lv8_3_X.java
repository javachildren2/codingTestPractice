package lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class lv8_3_X {
    //9012 괄호
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            System.out.println(isValidParenthesis(input) ? "YES" : "NO");
        }
    }

    private static boolean isValidParenthesis(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                // ')'인 경우
                if (stack.isEmpty() || stack.pop() != '(') {
                    // 스택이 비어있거나 맨 위의 요소가 '('와 매칭되지 않으면 올바른 괄호 문자열이 아님
                    return false;
                }
            }
        }

        // 모든 문자열을 순회한 후에도 스택에 남아있으면 올바른 괄호 문자열이 아님
        return stack.isEmpty();
    }
}