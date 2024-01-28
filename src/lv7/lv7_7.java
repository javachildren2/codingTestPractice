package lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lv7_7 {
    //4948 베르트랑 공준
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            for(;;) {
                int N=Integer.parseInt(br.readLine());
                if (N == 0){
                    break;
                }boolean[] isNotPrime = new boolean[2*N + 1];
                isNotPrime[0] = isNotPrime[1] = true;
                int cnt=0;

                for (int i = 2; i * i <= 2*N+1; i++) {
                    if (!isNotPrime[i]) {
                        for (int j = i * i; j < 2*N+1; j += i) {
                            isNotPrime[j] = true;
                        }
                    }
                }
                for (int i = N+1; i < 2*N+1; i++) {
                    System.out.println("isNotPrime["+i+"] = " + isNotPrime[i]);

                    if (!isNotPrime[i]) {
                       cnt++;
                    }
                }sb.append(cnt+"\n");

            }
            System.out.println(sb);
    }
}
