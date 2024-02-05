package lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lv7_6 {
    //1929 소수 구하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] isNotPrime = new boolean[N + 1];
        isNotPrime[0] = isNotPrime[1] = true;

        for (int i = 2; i * i <= N; i++) {                  //(20-25)행 중요함
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isNotPrime[j] = true;
                    System.out.println("j = " + j);
                }
            }
        }

        // 출력
        for (int i = M; i <= N; i++) {
            if (!isNotPrime[i]) {
                System.out.println(i);
            }
        }
    }
}