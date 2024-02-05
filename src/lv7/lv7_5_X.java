package lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv7_5 {
    //4134 다음 소수 찾기 에라토스테네스의 체(새로운 알고리즘 습득)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {       //while (T-- > 0)는 T가 0보다 큰 동안에 반복문을 실행하는 구문.
            long n = Long.parseLong(br.readLine());
            long result = findNextPrime(n);
            System.out.println(result);
        }
    }

    private static long findNextPrime(long n) {
        if (n <= 1) {
            return 2;
        }

        for (long i = n; ; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
    }

    private static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        for (long i = 2; i * i <= num; i++) {       //에라토스테네스의 체
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}