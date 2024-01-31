package lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv7_8 {
    //17103 골드바흐 파티션
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] primes = getPrimes(N);
            int count = countGoldbachPartitions(N, primes);
            System.out.println(count);
        }
    }

    // 에라토스테네스의 체를 사용하여 소수를 구하는 함수
    private static int[] getPrimes(int max) {
        boolean[] isNotPrime = new boolean[max + 1];
        isNotPrime[0] = isNotPrime[1] = true;

        for (int i = 2; i * i <= max; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        int count = 0;
        for (boolean notPrime : isNotPrime) {
            if (!notPrime) {
                count++;
            }
        }

        int[] primes = new int[count];
        int index = 0;
        for (int i = 2; i <= max; i++) {
            if (!isNotPrime[i]) {
                primes[index++] = i;
            }
        }

        return primes;
    }

    // 골드바흐 파티션의 수를 계산하는 함수
    private static int countGoldbachPartitions(int N, int[] primes) {
        int count = 0;
        int left = 0, right = primes.length - 1;

        while (left <= right) {
            int sum = primes[left] + primes[right];
            if (sum == N) {
                count++;
                left++;
                right--;
            } else if (sum < N) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}