package lv8;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class lv8_5 {
    //12789 도키도키 간식 드리미
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] line = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            line[i] = Integer.parseInt(st.nextToken());
        }


        System.out.println(solution(line));

    }

    static String solution(int[] line) {
        int targetNumber = 1;
        Stack<Integer> tmpStack = new Stack<>();

        for (int i = 0; i < line.length; i++) {
            if (line[i] != targetNumber) {
                if (!tmpStack.isEmpty() && tmpStack.peek() == targetNumber) {
                    tmpStack.pop();
                    i--;
                    targetNumber++;
                } else {
                    tmpStack.push(line[i]);
                }
            } else {
                targetNumber++;
            }
        }

        while (!tmpStack.isEmpty()) {
            if (tmpStack.pop() != targetNumber) {
                return "Sad";
            }
            targetNumber++;
        }

        return "Nice";
    }
}