package lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lv7_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st1.nextToken());
        int B = Integer.parseInt(st1.nextToken());
        int A2 = Integer.parseInt(st2.nextToken());
        int B2 = Integer.parseInt(st2.nextToken());

        int numerator = A * B2 + A2 * B;
        int denominator = B * B2;

        int gcd = gcd(numerator, denominator);

        System.out.println(numerator / gcd + " " + denominator / gcd);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}