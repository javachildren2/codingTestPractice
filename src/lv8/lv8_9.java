package lv8;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class lv8_9 {
    //28279 덱2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:
                    int X = Integer.parseInt(st.nextToken());
                    deque.addFirst(X);
                    break;
                case 2:
                    X = Integer.parseInt(st.nextToken());
                    deque.addLast(X);
                    break;
                case 3:
                    if (!deque.isEmpty()) {
                        bw.write(deque.pollFirst() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
                case 4:
                    if (!deque.isEmpty()) {
                        bw.write(deque.pollLast() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
                case 5:
                    bw.write(deque.size() + "\n");
                    break;
                case 6:
                    if (deque.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case 7:
                    if (!deque.isEmpty()) {
                        bw.write(deque.peekFirst() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
                case 8:
                    if (!deque.isEmpty()) {
                        bw.write(deque.peekLast() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}