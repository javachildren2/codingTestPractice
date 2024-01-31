package lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class lv8_8 {
    //    11866 요세푸스 문제
    //    1234567	(3)
    //    456712	(6)
    //    71245	    (2)
    //    4571		(7)
    //    145		(5)
    //    41		(1)
    //    4		    (4)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);


        String josephusPermutation = getJosephusPermutation(N, K);


        System.out.println(josephusPermutation);

        br.close();
    }

    // 요세푸스 순열을 계산하는 함수
    static String getJosephusPermutation(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();


        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        StringJoiner sj = new StringJoiner(", ", "<", ">");

        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                int removed = queue.poll();
                queue.offer(removed);
            }
            sj.add(String.valueOf(queue.poll()));
        }

        return sj.toString();
    }
}