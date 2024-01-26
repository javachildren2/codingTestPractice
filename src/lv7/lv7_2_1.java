package lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lv7_2_1 {
    //유클리드 호제법
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        // 최대공약수 계산
        long gcd = getGCD(a, b);

        // 최소공배수 계산
        long lcm = a * b / gcd;

        System.out.println(lcm);
    }

    // 최대공약수를 구하는 메서드 (유클리드 호제법)
    private static long getGCD(long a, long b) {
        while (b != 0) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}

